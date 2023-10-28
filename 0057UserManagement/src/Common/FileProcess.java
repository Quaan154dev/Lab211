/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import Model.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author quandba
 */
public class FileProcess {

    public ArrayList<User> readData(String fileName) {
        ArrayList<User> list = new ArrayList<>();
        FileInputStream fileInputStream = null;
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                writeData(new ArrayList<User>(), fileName);
            }

            fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (ArrayList<User>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }

        return list;

    }

    public void writeData(ArrayList<User> arrayList, String fileName) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayList);
        } catch (FileNotFoundException e) {
  
            e.printStackTrace();
        } catch (IOException e) {
    
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                
                e.printStackTrace();
            }
        }

    }
}
