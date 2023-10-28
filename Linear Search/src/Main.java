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
        //1.Enter a number of array
        int numberOfArray = GetInput.getInteger("Enter number of array :", "Number of array must  be Integer !", 0, Integer.MAX_VALUE);
        //2.Enter a search number
        int searchNumber = GetInput.getInteger("Enter search value :", "Search value must be Integer !", 0, Integer.MAX_VALUE);
        
        LinearSearch linearSearch = new LinearSearch(numberOfArray);
        //3.Generate random integer in number range for each array element
        linearSearch.generateRandomInteger();
        
        //4.Display the array
        linearSearch.displayArray();
        
        //5.Display the index of search number in array
        
       linearSearch.displayIndexOfSearchNumber(searchNumber);
    }
}
