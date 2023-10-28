/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import Model.User;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author quandba
 */
public class ManageAccount {

    FileProcess fileProcess = new FileProcess();

    public void createNewAccount(String fileName) {
        // check file exist
        if (checkExistedFile(fileName) == false) {
            System.out.println("File is not existed!!");
        }
        ArrayList<User> list = new ArrayList<>();
        list.addAll(fileProcess.readData(fileName));
        String username;
        while (true) {
           
            username = Validation.getString("Enter Username: ", "You must enter "
                    + "least at 5 character, and no space!",
                    "[^ ]{5,}");
            // if username exist in database then tell user else break
            if (checkExistUsername(list, username, fileName)) {
                System.out.println("Username has existed in file. Please enter "
                        + "other username !!!");
            } else {
                break;
            }
        }
       
        String password = Validation.getString("Enter Password: ", "You must enter "
                + "least at 6 character, and no space!",
                "[^ ]{6,}");
        list.add(new User(username, password));
        fileProcess.writeData(list, fileName);
        System.out.println("Create account successfull !!");

    }


    private boolean checkExistUsername(ArrayList<User> list, String username, String fileName) {
        list = fileProcess.readData(fileName);
        for (User user : list) {
            if (user.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }


    public boolean checkExistedFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            return true;
        }
        return false;
    }


    public void loginSystem(String fileName) {
        ArrayList<User> list = new ArrayList<>();
        list.addAll(fileProcess.readData(fileName));
        String username = Validation.getString("Enter Username: ", "You must enter"
                + " least at 5 character, and no space!",
                "[^ ]{5,}");
        String password = Validation.getString("Enter Password: ", "You must enter"
                + " least at 6 character, and no space!",
                "[^ ]{6,}");
        for (User user : list) {
            if (user.getUserName().equals(username)
                    && user.getUserPassWord().equals(password)) {
                System.out.println("Login successful!");
                return;
            }
        }
        System.out.println("Login fail!!");
        System.out.println("Username or password is not correct!!\n");
    }

}
