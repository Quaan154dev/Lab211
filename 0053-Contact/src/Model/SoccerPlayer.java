/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author quandba
 */
public class SoccerPlayer {
    private int ID;
    private String fullName ,group  ,address, phone  ,lastName , firstname;
    private static int defaultId = 0;

    public SoccerPlayer() {
    }

    public SoccerPlayer(String fullName, String group, String address, String phone) {
        this.ID = ++defaultId;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;
//        this.lastName = lastName;
//        this.firstname = firstname;
        String[] nameParts = this.fullName.split(" ");
        this.firstname = nameParts[0];
        this.lastName = nameParts[nameParts.length - 1];
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" + "ID=" + ID + ", fullName=" + fullName + ", group=" + group + ", address=" + address + ", phone=" + phone + ", lastName=" + lastName + ", firstname=" + firstname + '}';
    }
    public void display(){
       System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s ",ID,fullName,firstname,lastName,group,address , phone);
    }
    
    
    
    
    
}
