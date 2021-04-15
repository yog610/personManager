/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author reqaw
 */
public class JDBCUtil {
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/eapms? useSSL=true&characterEncoding=utf-8";
    private static String userName = "root";
    private static String userPWD = "";
    
    public static void registerDriver() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("驱动未加载!");
        }
    }
    
    public static Connection getConnection(){
        try {
            Connection conn = null;
            //System.out.println("正在连接...");
            conn = DriverManager.getConnection(url, userName, userPWD);
            //System.out.println("连接成功！");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("连接失败！");
        }
        return null;
    }
    
    private static void closeConnection(Connection conn) {
        //System.out.println("关闭连接..");
        if(conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException ex) {
                Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("关闭连接失败");
            }
        }
    }
    
    public static void releaseALL(ResultSet rs, PreparedStatement pstat, Connection conn) {
        if(rs != null) {
            try {
                rs.close();
                rs = null;
            } catch (SQLException ex) {
                Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(pstat != null) {
            try {
                pstat.close();
                pstat = null;
            } catch (SQLException ex) {
                Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        closeConnection(conn);
    }
}
