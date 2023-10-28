
import Common.Utility;
import View.ViewWorker;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author quandba
 */
public class Main {
    public static void main(String[] args) {
        ViewWorker viewWorker = new ViewWorker();
        viewWorker.addmockdata();
        while (true) {
            displayMenu();
            int option = Utility.getInteger("Enter option:", "Wrong", 1, 5);
            switch (option) {
                case 1:
                    viewWorker.addWorks();
                    break;
                case 2:
                    viewWorker.changeIncreaseSalary(); 
                    break;
                case 3:
                    viewWorker.changeDecreaseSalary();                                             
                    break;
                case 4:
                    viewWorker.showData();
                    break;
                case 5:
                     System.exit(0);
                    break;                   
                default:
                    System.out.println("Enter number true");
            }

        }
    }

    private static void displayMenu() {
        System.out.println("=====================Worker Management=======================\n"
                + "1.Add Works\n"
                + "2.Up Salary\n"
                + "3.Down Salary\n"
                + "4.Display Information salary\n"
                + "5.Exit\n"
        );
    }
}
