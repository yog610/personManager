/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import infobean.DepartmentInfoBean;
import infobean.TeacherInfoBean;
import db.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reqaw
 */
public class TeacherAction {

    public TeacherAction() {
    }
    public TeacherInfoBean findTeacherByTeacherID(String teacherId) {
        TeacherInfoBean  teacherinfo = new TeacherInfoBean();
        boolean flag = false;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sqlstr = "select * from teacherinfo where rtrim(TEACHERID) = ?";
        
        try {
            JDBCUtil.registerDriver();
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sqlstr);
            ps.setString(1, teacherId);
            rs = ps.executeQuery();
            while(rs.next()) {
                if(rs.getString(1).equals(teacherId)) {
                    teacherinfo.setTeacherId(rs.getString(1));
                    teacherinfo.setTeacherName(rs.getString(2));
                    teacherinfo.setTeacherBirthday(rs.getString(3));
                    teacherinfo.setTeacherSex(rs.getString(4));
                    teacherinfo.setTeacherSchool(rs.getString(5));
                    teacherinfo.setTeacherTech(rs.getString(6));
                    teacherinfo.setTeacherAddress(rs.getString(7));
                    teacherinfo.setTeacherIndate(rs.getString(8));
                    teacherinfo.setTeacherDepartment(rs.getString(9));
                    teacherinfo.setTeacherDuty(rs.getString(10));
                    flag = true;
                    //System.out.println(teacherinfo.toString());
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentAction.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("查询是否存在该编号的教师时出错");
        } finally{
            JDBCUtil.releaseALL(rs, ps, conn);
        }
        if(flag)
            return teacherinfo;
        else
            return null;
    }
    public ArrayList findAllTeachers() {
        ArrayList list = new ArrayList();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sqlstr = "select * from teacherinfo";
        
        try {
            JDBCUtil.registerDriver();
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sqlstr);
            rs = ps.executeQuery();
            while(rs.next()) {
                TeacherInfoBean  teacherinfo = new TeacherInfoBean();
                teacherinfo.setTeacherId(rs.getString(1));
                teacherinfo.setTeacherName(rs.getString(2));
                teacherinfo.setTeacherBirthday(rs.getString(3));
                teacherinfo.setTeacherSex(rs.getString(4));
                teacherinfo.setTeacherSchool(rs.getString(5));
                teacherinfo.setTeacherTech(rs.getString(6));
                teacherinfo.setTeacherAddress(rs.getString(7));
                teacherinfo.setTeacherIndate(rs.getString(8));
                teacherinfo.setTeacherDepartment(rs.getString(9));
                teacherinfo.setTeacherDuty(rs.getString(10));
                list.add(teacherinfo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentAction.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("查询所有教师时出错");
        } finally{
            JDBCUtil.releaseALL(rs, ps, conn);
        }
        return list;
    }
    public ArrayList findTeachersByDepartmentID(String departmentID) {
        ArrayList list = new ArrayList();
        String sqlstr = "select * from teacherinfo where rtrim(TEACHERDEPARTMENT) like ?";
        
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            JDBCUtil.registerDriver();
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sqlstr);
            ps.setString(1, departmentID);
            rs = ps.executeQuery();
            while(rs.next()) {
                if(rs.getString(9).equals(departmentID)) {
                    TeacherInfoBean  teacherinfo = new TeacherInfoBean();
                    teacherinfo.setTeacherId(rs.getString(1));
                    teacherinfo.setTeacherName(rs.getString(2));
                    teacherinfo.setTeacherBirthday(rs.getString(3));
                    teacherinfo.setTeacherSex(rs.getString(4));
                    teacherinfo.setTeacherSchool(rs.getString(5));
                    teacherinfo.setTeacherTech(rs.getString(6));
                    teacherinfo.setTeacherAddress(rs.getString(7));
                    teacherinfo.setTeacherIndate(rs.getString(8));
                    teacherinfo.setTeacherDepartment(rs.getString(9));
                    teacherinfo.setTeacherDuty(rs.getString(10));
                    System.out.println(teacherinfo.getTeacherName());
                    list.add(teacherinfo);
                }
            }
        } catch(SQLException e){
            System.out.println("根据员工编号查询教师时出错");
        } finally{
            JDBCUtil.releaseALL(rs, ps, conn);
        }
        return list;
    }
    public int addTeacher(TeacherInfoBean teacherinfo) {
        String sqlstr = "insert into teacherinfo values(?,?,?,?,?,?,?,?,?,?)";
        int result = 0;
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            JDBCUtil.registerDriver();
            con = JDBCUtil.getConnection();
            ps = con.prepareStatement(sqlstr);
            ps.setString(1, teacherinfo.getTeacherId());
            ps.setString(2, teacherinfo.getTeacherName());
            ps.setString(3, teacherinfo.getTeacherBirthday());
            ps.setString(4, teacherinfo.getTeacherSex());
            ps.setString(5, teacherinfo.getTeacherSchool());
            ps.setString(6, teacherinfo.getTeacherTech());
            ps.setString(7, teacherinfo.getTeacherAddress());
            ps.setString(8, teacherinfo.getTeacherIndate());
            ps.setString(9, teacherinfo.getTeacherDepartment());
            ps.setString(10, teacherinfo.getTeacherDuty());
            result = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TeacherAction.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("添加教师时出错");
        } finally {
            JDBCUtil.releaseALL(rs, ps, con);
        }
        return result;
    }
    public int delTeacher(String teacherid) {
        String sqlstr = "delete from teacherinfo where rtrim(TEACHERID)=?";
        int result = 0;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            JDBCUtil.registerDriver();
            con = JDBCUtil.getConnection();
            ps = con.prepareStatement(sqlstr);
            ps.setString(1, teacherid);
            result = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TeacherAction.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("删除教师时出错");
            result = -1;
        } finally{
            JDBCUtil.releaseALL(rs, ps, con);
        }
        return result;
    }
//    public int modifyTeacher(TeacherInfoBean teacherinfo) {
//        String sqlstr = "update teacherinfo set TEACHERNAME = ?,TEACHERBIRTHDAY = ?,TEACHERSEX = ?,TEACHERSCHOOL = ?,TEACHERTECH = ?,TEACHERADDRESS = ?,TEACHERINDATE = ?,TEACHERDEPARTMENT = ?,TEACHERDUTY = ? where TEACHERID = ?";
//        //String sqlstr = "update teacherinfo set TEACHERNAME = 'asdf',TEACHERBIRTHDAY = 'asdf',TEACHERSEX = 'af',TEACHERSCHOOL = 'asdf',TEACHERTECH = 'asdf',TEACHERADDRESS = 'asdf',TEACHERINDATE = 'asdf',TEACHERDEPARTMENT = '0',TEACHERDUTY = 'asdf' where TEACHERID = '984A0001';";
//   
//        int result = 0;
//        Connection con = null;
//        PreparedStatement ps = null;
//        PreparedStatement setForeignChecksOpen = null;
//        PreparedStatement setForeignChecksClose = null;
//        ResultSet rs = null;
//        System.out.println(teacherinfo.toString());
//        try {
//            JDBCUtil.registerDriver();
//            con = JDBCUtil.getConnection();
//            ps = con.prepareStatement(sqlstr);
//            ps.setString(1, teacherinfo.getTeacherName());
//            ps.setString(2, teacherinfo.getTeacherBirthday());
//            ps.setString(3, teacherinfo.getTeacherSex());
//            ps.setString(4, teacherinfo.getTeacherSchool());
//            ps.setString(5, teacherinfo.getTeacherTech());
//            ps.setString(6, teacherinfo.getTeacherAddress());
//            ps.setString(7, teacherinfo.getTeacherIndate());
//            ps.setString(8, teacherinfo.getTeacherDepartment());
//            ps.setString(9, teacherinfo.getTeacherDuty());
//            ps.setString(10, teacherinfo.getTeacherId());
//            
//            setForeignChecksClose = con.prepareStatement("set foreign_key_checks = 0");
//            setForeignChecksClose.executeUpdate();
//              
//            result = ps.executeUpdate(sqlstr);
//            
//            setForeignChecksOpen = con.prepareStatement("set foreign_key_checks = 1");
//            setForeignChecksOpen.executeUpdate();
//            System.out.println("修改信息成功");
//        } catch (SQLException ex) {
//            Logger.getLogger(TeacherAction.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("修改信息失败");
//            result = -1;
//        } finally{
//            JDBCUtil.releaseALL(rs, ps, con);
//        }
//        return result;
//    }
    public int modifyTeacher(TeacherInfoBean teacherinfo) {
        //涉及如何更新一个表的属性（这个属性是另一个表的外键时，DBMS会有一个外键检查机制），以及PreparedStatement 语句不能识别的解决办法
        String sqlstr = "update teacherinfo set TEACHERNAME = '" + teacherinfo.getTeacherName() +"',TEACHERBIRTHDAY = '" + teacherinfo.getTeacherBirthday() 
                + "',TEACHERSEX = '" + teacherinfo.getTeacherSex() + "',TEACHERSCHOOL = '" + teacherinfo.getTeacherSchool() +"',TEACHERTECH = '" + teacherinfo.getTeacherTech()
                +"',TEACHERADDRESS = '" + teacherinfo.getTeacherAddress() + "',TEACHERINDATE = '" + teacherinfo.getTeacherIndate() + "',TEACHERDEPARTMENT = '" + teacherinfo.getTeacherDepartment()
                + "',TEACHERDUTY = '" + teacherinfo.getTeacherDuty() + "' where TEACHERID = '" + teacherinfo.getTeacherId() + "'";
        //System.out.println(sqlstr);
        int result = 0;
        Connection con = null;
        PreparedStatement ps = null;
        Statement sql = null;
        ResultSet rs = null;
        System.out.println(teacherinfo.toString());
        try {
            JDBCUtil.registerDriver();
            con = JDBCUtil.getConnection();
            sql = con.createStatement();
            sql.executeUpdate("set foreign_key_checks = 0");
            
            sql = con.createStatement();
            sql.executeUpdate(sqlstr);
           
            sql = con.createStatement();
            sql.executeUpdate("set foreign_key_checks = 1");
            System.out.println("修改信息成功");
        } catch (SQLException ex) {
            Logger.getLogger(TeacherAction.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("修改信息失败");
            result = -1;
        } finally{
            JDBCUtil.releaseALL(rs, ps, con);
        }
        return result;
    }
}
