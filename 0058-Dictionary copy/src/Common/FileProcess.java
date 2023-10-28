/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author quandba
 */
public class FileProcess {

    public void loadDataFromFile(String fileName, HashMap<String, String> dictionary) {
        //check file có tồn tại ko ?
        File file = new File(fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();// tạo mới file
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            while (true) {
                String line = bufferedReader.readLine();

                System.out.println(line);
                if (line != null) {
                    String[] data = line.split("[,]");
                    String enString = data[0];
                    String viString = data[1];
                    //index 4:
                    int availability = Integer.parseInt(data[3].trim());
//                    System.out.println(data[2]);             
                    //create instance
                    dictionary.put(enString, viString);
                } else {
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void saveDataToFile(HashMap<String, String> dictionary) {
        try {
            String path = Paths.get("").toAbsolutePath().toString();
            try (FileWriter wf = new FileWriter(path + "/src/Data/dictionary.txt")) {
                for (String enString : dictionary.keySet()) {
                    String viString = dictionary.get(enString);
                    // check if key or value contains semicolon or newline
                    if (enString.contains(";") || enString.contains("\n") || viString.contains(";")
                            || viString.contains("\n")) {
                        throw new IllegalArgumentException("Key or value contains invalid characters");
                    }
                    wf.write(enString + ";" + viString + System.lineSeparator());
                }
                wf.close();
            }
        } catch (IOException e) {
            System.out.println("AN ERROR OCCURED!");
            e.printStackTrace();
        }
    }
    
    public void saveDataToFileAppend(String path, String enString, String viString) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter((path), true))) {
            writer.write(enString + ";" + viString);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("AN ERROR OCCURED!");
            e.printStackTrace();
        }
    }

}
