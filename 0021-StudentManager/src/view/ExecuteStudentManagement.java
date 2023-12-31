/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Controller.ManageStudentService;
import constant.StudentConstant;
import Model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import util.Utility;

/**
 *
 * @author quandba
 */
public class ExecuteStudentManagement extends Menu{

    private ExecuteStudentManagement studentManageService = new ExecuteStudentManagement();
    private static final Scanner input = new Scanner(System.in);

    static String[] menuOptions = {
        "Load and Save Data(Bonus feature!)",
        "Create",
        "Find and Sort",
        "Update/Delete",
        "Report",
        "Exit"
    };

    public ExecuteStudentManagement() {
        super("STUDENT MANAGEMENT SYSTEM", menuOptions);
    }
    public void waitForPressAnyKey () {
        System.out.println("Press any key to continue...");
        input.nextLine();
    }
    @Override
    public void execute(int number) {
        switch(number) {
            case 1:
                studentManageService.handleLoadDataAndSaveData();
                break;
            case 2: 
                studentManageService.handleAddStudents();
                waitForPressAnyKey();
                break;
            case 3: 
                studentManageService.handleFindStudent();
                waitForPressAnyKey();
                break;
            case 4: 
                studentManageService.handleUpdateAndDelete();
                waitForPressAnyKey();
                break;
            case 5:
                studentManageService.report();
                waitForPressAnyKey();
                break;
            case 6: 
                System.out.println("EXITED PROGRAM! THANKS FOR YOUR CHECKING!");
            default: 
                System.exit(0);
                return;
        }
    }
  
    
    
    
    

}
