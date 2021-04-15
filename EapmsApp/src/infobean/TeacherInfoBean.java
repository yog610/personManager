/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infobean;

/**
 *
 * @author reqaw
 */
public class TeacherInfoBean {
    private String teacherId;       //教师编号
    private String teacherName;     //姓名
    private String teacherBirthday; //生日
    private String teacherSex;      //性别
    private String teacherSchool;   //毕业院校
    private String teacherTech;     //专业
    private String teacherAddress;  //籍贯/联系地址
    private String teacherIndate;   //入职时间
    private String teacherDepartment;//所在部门
    private String teacherDuty;     //职务
    
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherBirthday() {
        return teacherBirthday;
    }

    public void setTeacherBirthday(String teacherBirthday) {
        this.teacherBirthday = teacherBirthday;
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    public String getTeacherSchool() {
        return teacherSchool;
    }

    public void setTeacherSchool(String teacherSchool) {
        this.teacherSchool = teacherSchool;
    }

    public String getTeacherTech() {
        return teacherTech;
    }

    public void setTeacherTech(String teacherTech) {
        this.teacherTech = teacherTech;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    public String getTeacherIndate() {
        return teacherIndate;
    }

    public void setTeacherIndate(String teacherIndate) {
        this.teacherIndate = teacherIndate;
    }

    public String getTeacherDepartment() {
        return teacherDepartment;
    }

    public void setTeacherDepartment(String teacherDepartment) {
        this.teacherDepartment = teacherDepartment;
    }

    public String getTeacherDuty() {
        return teacherDuty;
    }

    public void setTeacherDuty(String teacherDuty) {
        this.teacherDuty = teacherDuty;
    }

    @Override
    public String toString() {
        return "TeacherInfoBean{" + "teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherBirthday=" + teacherBirthday + ", teacherSex=" + teacherSex + ", teacherSchool=" + teacherSchool + ", teacherTech=" + teacherTech + ", teacherAddress=" + teacherAddress + ", teacherIndate=" + teacherIndate + ", teacherDepartment=" + teacherDepartment + ", teacherDuty=" + teacherDuty + '}';
    }
}
