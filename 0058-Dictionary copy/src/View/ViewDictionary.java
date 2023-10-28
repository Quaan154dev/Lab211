/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Common.FileProcess;
import Common.Utility;
import Controller.DictionaryManager;
import java.nio.file.Paths;
import java.util.HashMap;
import javax.swing.text.Utilities;

/**
 *
 * @author quandba
 */
public class ViewDictionary {

    DictionaryManager dictionaryManager = new DictionaryManager();
    FileProcess fileProcess = new FileProcess();
    
    public void useLoadDataFromFile(HashMap<String, String> dictionary) {
        String path = Paths.get("").toAbsolutePath().toString();
        fileProcess.loadDataFromFile(path + "/src/Data/dictionary.txt", dictionary);
    }

    public void useSaveDateToFile(HashMap<String, String> dictionary) {
        fileProcess.saveDataToFile(dictionary);
    }

    public void AddNewWord(HashMap<String, String> dictionary) {
        
        String choice = "";
        do {
            System.out.println("---------------------------------Add------------------------------");
            String enString = Utility.getString("Enter English word: ", "Wrong!", "^[a-zA-Z]{1,}(?: [a-zA-Z]+){0,3}$").toLowerCase();

            if (dictionary.containsKey(enString)) {
                System.out.println(enString + " has already existed! You will have to update the Vietnamese meaning!");
                String viString = Utility.getString("Enter new meaning: ", "Wrong!", "^[a-zA-Z]{1,}(?: [a-zA-Z]+){0,3}$").toLowerCase();
                dictionary.replace(enString, viString);// nếu có thì update lại , nếu chưa thì thôi
            } else {
                String viString = Utility.getString("Enter new meaning: ", "Wrong!", "^[a-zA-Z]{1,}(?: [a-zA-Z]+){0,3}$").toLowerCase();
                dictionary.put(enString, viString);
            }
            System.out.println("Successful!");
            choice = Utility.getString("Do you want to add more word? (yY-YES or nN-NO) :", "Wrong !", "^(Y|y|N|n|YES|yes|NO|no)$");
        } while (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("YES"));
//        fileProcess.saveDataToFile(dictionary);
    }

    public void showData(HashMap<String, String> dictionary) {
        for (String w : dictionary.keySet()) {
            System.out.println(w + " = " + dictionary.get(w));
        }
    }

    public void DeleteWord(HashMap<String, String> dictionary) {
      
//        useLoadDataFromFile(dictionary);
        String enRemove, resulString;
        System.out.println("---------------------------------Delete-------------------------------");
        if (dictionary.isEmpty()) {
            System.out.println("DICTIONARY IS EMPTY! CANNOT EXECUTE THIS FUNCTION!");
        } else {
            enRemove = Utility.getString("Enter English word you want to remove:", "Wrong !", "^[a-zA-Z]{1,}(?: [a-zA-Z]+){0,3}$").toLowerCase();
            resulString = dictionaryManager.findWordByKey(enRemove, dictionary);
            if (resulString == null) {
                System.out.println("The word " + enRemove + " doesn't exist in our dictionary!");
            } else {
                dictionary.remove(enRemove, resulString);    
//                useSaveDateToFile(dictionary);
            }
        }
    }

    public void SearchWord(HashMap<String, String> dictionary) {
        System.out.println("---------------------------------Translate------------------------------");
        String enRemove, resulString;
        if (dictionary.isEmpty()) {
            System.out.println("DICTIONARY IS EMPTY! CANNOT EXECUTE THIS FUNCTION!");
        } else{
            enRemove = Utility.getString("Enter English word you want to find meaning:", "Wrong !", "^[a-zA-Z]{1,}(?: [a-zA-Z]+){0,3}$").toLowerCase();
            resulString = dictionaryManager.findWordByKey(enRemove, dictionary);
            if (resulString == null) {
                System.out.println("The word " + enRemove + " doesn't exist in our dictionary!");
            }else{
                 System.out.println(enRemove + " -> meaning: " + resulString);
            }
        }
    }

}
