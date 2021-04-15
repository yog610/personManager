/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author reqaw
 */
public class User {
    private int UserNo;
    private String UserID;
    private String UserPWD;

    public User() {
    }

    public User(String UserID, String UserPWD) {
        this.UserID = UserID;
        this.UserPWD = UserPWD;
    }

    public int getUserNo() {
        return UserNo;
    }

    public void setUserNo(int UserNo) {
        this.UserNo = UserNo;
    }
    
    public String getUserID() {
        return UserID;
    }
    
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getUserPWD() {
        return UserPWD;
    }

    public void setUserPWD(String UserPWD) {
        this.UserPWD = UserPWD;
    }

    @Override
    public String toString() {
        return "User{" + "UserNo=" + UserNo + ", UserID=" + UserID + ", UserPWD=" + UserPWD + '}';
    }
}
