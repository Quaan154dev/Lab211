import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author quandba
 */
public class LinearSearch {
    int array [];
    int size_array ;
    /**
     * constructor
     * @param numberOfArray
     * 
     */
    public LinearSearch(int numberOfArray) {
        array = new int[numberOfArray]; // tạo mới mảng với số lg pt = numberOfArray nhập từ input , 
                                        // ko khác j truyền số lg pt để mảng biết số lg pt
    }
    
 
    /**
     * 
     * Generate random integer in number range for each array element
     */ 
    void generateRandomInteger() {
        
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            // gán nó vào từng pt của mảng
            array[i] = random.nextInt(array.length);
        }   
    }

    /**
     * 
     * Display the array
     * 
     */
    void displayArray() {
        System.out.println("The array:" + Arrays.toString(array));
        
    }

    void displayIndexOfSearchNumber(int searchNumber) {
        // thực hiện thuận toán linear search để tìm ra index của pt muốn tìm kiếm
        int index = linearSearch(searchNumber);
        
        // hiển thị
        
        if(index ==  -1){
            System.out.println("Note Found !");
        }else
        System.out.println("Found " + searchNumber + " at index " + index);
    }
    
    //THUẬT TOÁN LINEARSEARCH
    private int linearSearch(int searchNumber) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]  == searchNumber){
              return  i;
            }
        }
        return  -1;
    }

    
    
    

    
    
    
}
