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
public class DepartmentInfoBean {
    private String departmentId;    //部门编号
    private String departmentName;  //部门名称

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "DepartmentInfoBean{" + "departmentId=" + departmentId + ", departmentName=" + departmentName + '}';
    }
}
