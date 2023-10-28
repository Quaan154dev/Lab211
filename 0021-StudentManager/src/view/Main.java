/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Controller.ManageStudentService;
import java.util.Scanner;
import util.Utility;

/**
 *
 * @author quandba
 */
public class Main {
    public static void main(String[] args) {
        ExecuteStudentManagement viewStudent = new ExecuteStudentManagement();
        
        ManageStudentService manageStudentService = new ManageStudentService();
        while (true) {     
            int option = Utility.getInteger("Enter option:", "Wrong !", 1, 4);
            switch (option) {
                case 1:
                    viewStudent.addStudentInformation();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;    
                default:
                     System.out.println("Enter number true");
            }
        }
    }
    
}
