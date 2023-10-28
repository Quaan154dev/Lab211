/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.HashMap;

/**
 *
 * @author quandba
 */
public class DictionaryManager {

    public String findWordByKey(String str ,HashMap<String, String> dictionary) {
        if(dictionary.containsKey(str)){
          return dictionary.get(str);
        }
        return null;
    }
 
        
        
}
