/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author quandba
 */
public class Validator {
    private static final Scanner scanner = new Scanner(System.in);
      /**
     * lấy về một số nguyên từ đầu vào
     *
     * @param message
     * @param error
     * @param min
     * @param max
     * @return number input
     */
    public static int getInteger(String message, String error, int min, int max) {
        while (true) {
            try {
                //hiển thị thông báo, yêu cầu người dùng
                System.out.print(message);
                //cho người dùng nhập vào
                String input = scanner.nextLine();
                int number = Integer.parseInt(input);
                //kiểm tra xem giá trị đầu vào có trong đoạn min - max
                //if number in range => return number
                if (number >= min && number <= max) {
                    return number;
                    //else tell error
                } else {
                    System.out.println("Number must in range " + min + " - " + max);
                }

            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        }
    }

    /**
     * lấy về một số nguyên từ đầu vào
     *
     * @param message
     * @param error
     * @param min
     * @param max
     * @return number input
     */
    public static float getFloat(String message, String error, int min, int max) {
        while (true) {
            try {
                //hiển thị thông báo, yêu cầu người dùng
                System.out.print(message);
                //cho người dùng nhập vào
                String input = scanner.nextLine();
                float number = Float.parseFloat(input);
                //kiểm tra xem giá trị đầu vào có trong đoạn min - max
                //if number in range => return number
                if (number >= min && number <= max) {
                    return number;
                    //else tell error
                } else {
                    System.out.println("Number must in range " + min + " - " + max);
                }

            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        }
    }
    /**
     * lấy về một số nguyên từ đầu vào
     *
     * @param message
     * @param error
     * @param min
     * @param max
     * @return number input
     */
    
    public static double getDouble(String message, String error, double min, double max) {
        while (true) {
            try {
                //hiển thị thông báo, yêu cầu người dùng
                System.out.print(message);
                //cho người dùng nhập vào
                String input = scanner.nextLine();
                double number = Double.parseDouble(input);
                //kiểm tra xem giá trị đầu vào có trong đoạn min - max
                //if number in range => return number
                if (number >= min && number <= max) {
                    return number;
                    //else tell error
                } else {
                    System.out.println("Number must in range " + min + " - " + max);
                }

            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        }
    }

    public static String getString(String message, String error ){
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.print("Input cannot be empty");
            } else {
                System.out.println(error);
            }
        }

    }
    
    public boolean validateDateOfBirth(String birthDate) {
        Pattern pattern = Pattern.compile("^19[0-9]{2}|20[0-2][0-9]$");
        Matcher matcher = pattern.matcher(birthDate);
        return matcher.matches();
    }

    public boolean validatePhoneNumber(String phone) {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@fpt\\.edu\\.vn$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public boolean validateYearsOfExperience(String expInYear) {
        int years;
        try {
            years = Integer.parseInt(expInYear);
        } catch (NumberFormatException e) {
            return false;
        }
        return years >= 0 && years <= 100;
    }

    public boolean validateRankOfGraduation(String gradRank) {
        return gradRank.equalsIgnoreCase("Excellence") || gradRank.equalsIgnoreCase("Good") || gradRank.equalsIgnoreCase("Fair") || gradRank.equalsIgnoreCase("Poor");
    }
    
    
}
