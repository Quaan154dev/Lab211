package base;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
kiểu dử liệu: 
1.Primitive type (kiểu nguyên thuỷ):nt, byte, short, long, float, double, boolean and char
2.Wrapper class (kiểu đóng gói): Boolean ,Byte ,Character , Float ,Integer,Long ,Short , Double 
3.Reference type (kiểu tham chiếu): class, interface, String, Arrays, etc.
 */
//QUY TẮC ĐẶT TÊN:
/*
 + Tên class: chữ cái đầu tiền phải viết hoa :vd :MyList
 + Tên biến , tên method , tên package : theo quy tắc camelCase 
   -  chữ cái đầu tiền viết thường , các chữ cái đầu tiền tiếp theo viết hoá VD : writeFile()
 */
// QUY TẮC COMMENT : / + shift + 8 8 + enter  + /
/**
 * @purpose:
 * @author: quandba
 * @date:
 */
public class Utility {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Yêu cầu người dùng nhập tuổi
        int person = getInteger("Enter your age :", "Tuổi bạn phải số nguyên", 0, 100);
        System.out.println(person);
        // Yêu cầu người nhập vào số lượng pt mảng 
        int mang = getInteger("Enter số lượng pt của mảng :",
                "Số lượng pt mảng ko hợp lệ", 1, 100);
        System.out.println(mang);
        // Yêu cầu nhập điểm 
        float diem = getFloat("Enter your point:", "Điểm không hợp lệ", 0, 10);
        System.out.println(diem);
    }

    /**
     *
     * @param msg
     * @param error
     * @param min
     * @param max
     * @return number input
     */
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

    public static float getFloat(String msg, String error, float min, float max) {
        while (true) {     
            try {
                System.out.println(msg);
            String input = scanner.nextLine();
            float number = Float.parseFloat(input);

            if (number >= min && number <= max) {
                return number;
            } else {
                System.out.println("Number must in range " + min + " - " + max);
            }
            } catch (Exception e) {
                System.out.println(error);
            }
        }
    }
     public static String getString(String message, String error, String regex) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.print("Input cannot be empty");
            } else if (input.matches(regex)) {
                return input;
            } else {
                System.out.println(error);
            }
        }

    }
    
    

}
