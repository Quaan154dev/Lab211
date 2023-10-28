package view;

import entity.Country;
import util.Utility;

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
        ViewCountry viewCountry = new ViewCountry();
        viewCountry.mockData();
        while (true) {
            displayMenu();
            int option = Utility.getInteger("Enter option:", "Wrong", 1, 6);
            switch (option) {
                case 1:
                    // input info of 11 country 
                    viewCountry.inputCountry();
                    break;
                case 2:
                    // display the info of country just input  (hiển thị quốc gia vừa nhập)
                    viewCountry.displayCountryJustInput();
                    break;
                case 3:
                    viewCountry.searchCountry();
                    break;
                case 4:
//                    viewCountry.sortCountries();
                    viewCountry.displayCountryJustInput2();
                    break;
                case 5:                  
                    System.exit(0);
                    break;
                case 6:
                    System.out.println("Enter number true");
                    break;
                default:
                    System.out.println("Enter number true");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("");
        System.out.println("                              MENU\n"
                + " ==========================================================================\n"
                + " 1. Input the information of 11 countries in East Asia\n"
                + " 2. Display the information of country you've just input\n"
                + " 3. Search the information of country by user-entered name\n"
                + " 4. Display the information of countries sorted name in ascending order\n"           
                + " 5. Exit\n"             
                + " ==========================================================================");
    }
}
