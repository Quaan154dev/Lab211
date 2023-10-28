/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Element;
import View.Menu;
import common.Algorithm;
import common.Library;

/**
 *
 * @author quandba
 */
public class Search  extends Menu<String>{
    protected Library library;
    protected Algorithm algorithm;
    protected int arrSize;
    protected int[] arr;
    static String[] opsList = {"Search", "Exit"};

    public Search(Element element) {
        super("Search Menu", opsList);
        library = new Library();
        algorithm = new Algorithm();
        arrSize = element.getSizeArray();
        arr = element.getArray();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                search();
                break;
            }
            case 2:
                System.exit(0);
            default:
                System.out.println("Please, enter again!");
        }
    }

    public void search() {
        final String[] searchList = {"Linear Search", "Binary Search", "Exit"};
        class searchMenu extends Menu<String> {

            public searchMenu() {
                super("Search option", searchList);
            }

            @Override
            public void execute(int n) {
                switch (n) {
                    case 1: {
                        int value = library.getInt("Enter number ", 1, 100);
                        library.display(arr);
                        algorithm.linearSearch(arr, value);
                        break;
                    }
                    case 2: {
                        int value = library.getInt("Enter number ", 1, 100);
                        algorithm.bubbleSort(arr);
                        library.display(arr);                       
                        algorithm.binarySearch(arr, value);
                        break;
                    }

                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please, enter again!");
                }
            }
        }
        searchMenu sm = new searchMenu();
        sm.run();
    }
}
