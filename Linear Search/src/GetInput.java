
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author quandba
 */
public class GetInput {
    /**
     *
     * @param msg
     * @param error
     * @param min
     * @param max
     * @return number input
     */
    public static Scanner scanner = new Scanner(System.in);
    public static int getInteger(String msg, String error, int min, int max) {
        while (true) {
            try {
                //Hiển thị thông báo  ,yều cầu người dùng 
                System.out.println(msg);
                //Cho người dùng nhập vào
                String input = scanner.nextLine();
                int number = Integer.parseInt(input);
                //Kiểm tra giá trị đầu vào trong min hay max ?
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println("Number must in range " + min + " - " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        }
    }
}
