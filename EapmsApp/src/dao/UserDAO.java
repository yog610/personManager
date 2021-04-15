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
public interface UserDAO {
    //要根据LoginFrame中提供的UserID和UserPWD实现登录验证
    public User Login(String user, String userpwd);
    public int Register(User user);
    public boolean findUserByUserId(String userId);
    public int modifyUserPassword(User user);
}
