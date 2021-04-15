/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;


import infobean.DepartmentInfoBean;
import db.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reqaw
 */
public class DepartmentAction {
    public DepartmentAction() {
    }
    public String findDepartmentIDByDepartmentName(String departmentName) {
        System.out.println("要查找的部门名称是：" + departmentName);
        String departmentID = "";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sqlstr = "select * from departmentinfo";
        
        try {
            JDBCUtil.registerDriver();
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sqlstr);
            rs = ps.executeQuery();
            while(rs.next()) {
               if(departmentName.equals(rs.getString(2))) {
                   departmentID = rs.getString(1);
                   break;
               }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentAction.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("根据部门编号查找部门名称时出错");
        } finally{
            JDBCUtil.releaseALL(rs, ps, conn);
        }
        return departmentID;
    }
    public String findDepartmentNameByDepartmentID(String id) {
        String departmentName = "";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sqlstr = "select * from departmentinfo";
        
        try {
            JDBCUtil.registerDriver();
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sqlstr);
            rs = ps.executeQuery();
            while(rs.next()) {
               if(id.equals(rs.getString(1)))
                   departmentName = rs.getString(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentAction.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("根据部门名称查找部门编号时出错");
        } finally{
            JDBCUtil.releaseALL(rs, ps, conn);
        }
        return departmentName;
    }
    public ArrayList findAllDepartments() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sqlstr = "select * from departmentinfo";
        
        try {
            JDBCUtil.registerDriver();
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sqlstr);
            rs = ps.executeQuery();
            while(rs.next()) {
                DepartmentInfoBean departmentinfo = new DepartmentInfoBean();
                //将每个部门信息保存到一个部门对象中，然后加入到一个动态数组中去
                departmentinfo.setDepartmentId(rs.getString(1));
                departmentinfo.setDepartmentName(rs.getString(2));
                list.add(departmentinfo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentAction.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("查询所有部门时出错");
        } finally{
            JDBCUtil.releaseALL(rs, ps, conn);
        }
        return list;
    }
}
