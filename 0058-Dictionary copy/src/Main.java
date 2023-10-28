
import Common.Utility;
import View.ViewDictionary;
import java.util.HashMap;

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
        HashMap<String, String> dictionary = new HashMap<>();
        while (true) {
            ViewDictionary viewDictionary = new ViewDictionary();
            displayMenu();
            int option = Utility.getInteger("Enter option:", "Wrong", 1, 5);
            switch (option) {
                case 1:
                    viewDictionary.AddNewWord(dictionary);
                    break;
                case 2:
                    viewDictionary.DeleteWord(dictionary);
                    break;
                case 3:
                    viewDictionary.SearchWord(dictionary);                                            
                    break;
                case 4:
                    System.exit(0);
                    break;               
                case 5:
                    viewDictionary.showData(dictionary);                                       
                    break;    
                default:
                    System.out.println("Enter number true");
            }

        }
    }

    private static void displayMenu() {
        System.out.println("========================Dictionary program==========================\n"
                + "1.Add Word\n"
                + "2.Delete Word\n"
                + "3.Translate\n"
                + "4.Exit\n"
        );
    }
   
}
