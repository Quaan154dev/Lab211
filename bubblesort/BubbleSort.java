package bubblesort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //1.Display a screen to prompt users to input a positive decimal number.
        int number_size = inputPositiveNumber("Enter number of Array:", 0);

        //2.Generate random integer in number range for each array element.
        int array[] = getRandomIntegerArray(number_size);
        //3.Display unsorted random array
        Display(array, "Unsorted array :");
        //4.Display sorted random array by using BubbleSort algorithm
        selectionSort(array);
//        bubbleSort(array);
        Display(array, "Sorted array:");
        
        
    }

    /*
       inputPositiveNumber() method have parameters:
       + String msg : display ask input a number
       + int min : limit number must  large than min 
     */
    public static int inputPositiveNumber(String msg, int min) {
        //Loop use to for user enter positive number untill use input correct format else continue process 

        while (true) {
            // NumberFormatException "ABC" parse to int => lổi 
            // EmptyException (lổi người dùng) => mình phải tự tạo Throw 
            // PositiveNumberException (lổi người dùng)  => mình phải tự tạo Throw 
            try {
                // Display a screen to prompt users to input a positive decimal number.

                System.out.println(msg);
                //Users Scanner class to input String 

                String inputString = sc.next();
                //Declear number positive that want return 
                int numberOfResult = Integer.parseInt(inputString);

                if (inputString == null || inputString.length() == 0) {
                    throw new EmptyException("Not allow empty input !!! Please enter again");
                }

                if (numberOfResult < 0) {
                    throw new PositiveNumberException("Not negative input !!! Please enter again !!!");
                }
                // if not error return numberOfResult
                return numberOfResult;

            } catch (NumberFormatException e1) {
                System.out.println("The input must be number !!! Please enter again !!!");
                continue;
            } catch (EmptyException e2) {
                System.out.println(e2.getMessage());
                continue;
            } catch (PositiveNumberException e3) {
                System.out.println(e3.getMessage());
                continue;
            }

        }
    }

    // FUNCTION 2: DISPLAY VÀ SORT ARRAY 
    //Display 1:Generate random integer array in number size for each element 
    public static int[] getRandomIntegerArray(int size_range) {
        //create new array to store random element number
        int array[] = new int[size_range];
        // gán tri random cho từng phần tử
        for (int i = 0; i < array.length; i++) {
            //Declear a number range (equal size range)        
            int number_range = size_range;

            //make random number for value of each element in  array
            Random random = new Random();
            array[i] = random.nextInt(number_range);
        }
        return array;
    }

    //DISPLAY 2: Display array before and after sorting.
    public static void Display(int arr[], String msg) {
        System.out.print(msg);

        int size = arr.length;
        // display open brackets
        System.out.print("[");

        //loop use to access from first element to last element
        for (int i = 0; i < size; i++) {
            // display element
            System.out.print(arr[i]);
            // if element not last element 
            if (i < size - 1) {
                System.out.print(", ");// append ", "
            } else {
                System.out.println("]");  // append  "]" (close brackers)   
            }
        }
    }

    public static int[] bubbleSort(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void selectionSort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int index_mix = i;
            for (int j = i; j < size; j++) {
                if (arr[j] < arr[index_mix]) {
                    index_mix = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index_mix];
            arr[index_mix] = temp;
        }

    }

}
