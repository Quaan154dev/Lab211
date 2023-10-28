package AreaAndPer.common;

import java.util.Scanner;

public class Valid {

    private final Scanner in = new Scanner(System.in);

    public double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Re-input");
            }
        }
    }

}
