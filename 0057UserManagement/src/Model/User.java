/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author quandba
 */
public class User  implements Serializable{
    private String userName;
    private String userPassWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    public User() {
    }

    public User(String userName, String userPassWord) {
        this.userName = userName;
        this.userPassWord = userPassWord;
    }

    @Override
    public String toString() {
        return this.userName + " - " + this.userPassWord;
    }
    
    
}
