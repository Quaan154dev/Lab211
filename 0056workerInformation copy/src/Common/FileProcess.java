/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import Model.Worker;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quandba
 */
public class FileProcess {

    public static void writeToFile(String fileName, List<Worker> list) {
        //CÁCH VIẾT VÀO FILE : b1:BufferedWriter -> B2:FileWriter => b3: finally : close() 2 file đó
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(fileName, false);// địa chỉ file , ng mở đg (cách ghi đề lên file sd 'false')
            bufferedWriter = new BufferedWriter(fileWriter);//người công nhân 

            for (Worker worker : list) {
                String a = worker.getId() + "," + worker.getName() + "," + worker.getAge() + "," + worker.getSalary() +"," +worker.getWorkLocation();

                bufferedWriter.write(a);
                bufferedWriter.newLine();// xuống dòng
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }

    public static List<Worker> readToFile(String fileName) {
        //check file có tồn tại ko ?
        File file = new File(fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();// tạo mới file
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        List<Worker> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            while (true) {
                String line = bufferedReader.readLine();
                //neu co du lieu thi chung ta moi doc
                //1,ABC,123
                System.out.println(line);
                if (line != null) {
                    String[] data = line.split("[,]");
                    //index 0:
                    String code = data[0].trim();
                    //index 1:
                    String name = data[1].trim();
                    //index 3:
                    String specialization = data[2].trim();
                    //index 4:
                    int availability = Integer.parseInt(data[3].trim());
//                    System.out.println(data[2]);             
                    //create instance
                    Worker worker = new Worker(code, name, availability, availability, specialization);
                    //add to list
                    list.add(worker);
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
        return list;
    }

}
