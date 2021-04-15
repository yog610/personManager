/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.JDBCUtil;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author reqaw
 */
public class UserDAOImpl implements UserDAO{
    //检查是否账号和密码都已经输入
    public boolean Check(String userId, String userPwd) {
        if(userId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "<html><font Color='red'>账号不能为空！", "提示", JOptionPane.WARNING_MESSAGE);
            return false;
        }else {
            if(userPwd.isEmpty()) {
                JOptionPane.showMessageDialog(null, "<html><font Color='red'>密码不能为空！", "提示", JOptionPane.WARNING_MESSAGE);
                return false;
            }else
                return true;
        }
    }
    @Override
    public User Login(String userId, String userPwd) {
        if(!this.Check(userId, userPwd))
            return null;
        
        Connection conn = null;
        PreparedStatement pstat = null;
        ResultSet rs = null;
        
        String sql = "select * from userinfo where USERID = ?";
        try {
            JDBCUtil.registerDriver();
            conn = JDBCUtil.getConnection();
            pstat = conn.prepareStatement(sql);
            pstat.setString(1, userId);
            rs = pstat.executeQuery();
            
            if(rs.next()) {
                String pwd = rs.getString("USERPWD");
                if(pwd.equals(userPwd)) {
                    return new User(userId, userPwd);
                    //然后关掉提示框，关掉LoginFrame,弹出ManageFrame
                }else {
                    JOptionPane.showMessageDialog(null, "<html><font Color='red'>密码错误！", "错误", JOptionPane.WARNING_MESSAGE);
                }
            }else {
                JOptionPane.showMessageDialog(null, "<html><font Color='red'>此账号不存在！", "警告", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            JDBCUtil.releaseALL(rs, pstat, conn);
        }
        return null;
    }

    @Override
    public int Register(User user) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int result = 0;
        String sqlStr = "insert into userinfo(USERID,USERPWD) values(?,?)";
        
        JDBCUtil.registerDriver();
        con = JDBCUtil.getConnection();
        try {
            ps = con.prepareStatement(sqlStr);
            ps.setString(1, user.getUserID());
            ps.setString(2, user.getUserPWD());
            
            result = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public boolean findUserByUserId(String userId) {
        boolean ok = false;
        Connection con =null;
        PreparedStatement pstat = null;
        ResultSet rs = null;
        String sqlStr = "select * from userinfo where USERID = ?";
        try {
            JDBCUtil.registerDriver();
            con = JDBCUtil.getConnection();
            pstat = con.prepareStatement(sqlStr);
            pstat.setString(1, userId);
            rs = pstat.executeQuery();
            
            if(rs.next()) {
                ok = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            JDBCUtil.releaseALL(rs, pstat, con);
        }
        return ok;
    }

    @Override
    public int modifyUserPassword(User user) {
        int result = 0;
        Connection conn = null;
        PreparedStatement pstat = null;
        ResultSet rs = null;
        
        String sql = "update userinfo set USERPWD = ?  where USERID = ?";
        try {
            JDBCUtil.registerDriver();
            conn = JDBCUtil.getConnection();
            pstat = conn.prepareStatement(sql);
            pstat.setString(1, user.getUserPWD());
            pstat.setString(2, user.getUserID());
            result = pstat.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            JDBCUtil.releaseALL(rs, pstat, conn);
        }
        return result;
    }
}
