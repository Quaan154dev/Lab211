/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author quandba
 */
public abstract class Menu {
    private final Scanner scan = new Scanner(System.in);
    private final String title;
    private final ArrayList<String> options = new ArrayList<>();
    public Menu(String title, String[] option) {
        this.title = title;
        this.options.addAll(Arrays.asList(option));
    }
    public void menuDisplay() {
        System.out.println("\n----------------------------");
        System.out.println(title);
        System.out.println("----------------------------");
        for (int i = 0; i<options.size(); i++) {
            System.out.println((i+1) + " - " + options.get(i));
        }
        System.out.println("----------------------------");
    }
    public Integer getChoice() {
        menuDisplay();
        int choice = 0;
        System.out.println("Enter number's option: ");
        while(choice == 0) {
            try {
                choice = Integer.parseInt(scan.nextLine());
            }
            catch (NumberFormatException e) {
                System.err.println("Your choice must be a number!");
            }
        }
        return choice;
    }
    public void run() {
        while(true) {
            int choice = getChoice();
            execute(choice);
            if(choice>options.size()) break;
        }
    }
    public abstract void execute(int number);
}
