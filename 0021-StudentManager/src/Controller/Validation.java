/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Student;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author quandba
 */
public class Validation {

    public boolean validatePattern(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public Student search(String string, ArrayList<Student> studentsList) {
        string = string.trim().toUpperCase();
        for(Student student: studentsList ) {
            if(student.getStudentId().equals(string)) {
                return student;
            }   
        }
        return null;
    }
    
    public String searchInArray(String string, ArrayList<String> checkArrayList) {
        string = string.trim();
        for(String str: checkArrayList) {
            if(str.equals(string)) {
                return str;
            }
        }
        return null;
    }
    
    public boolean isDuplicated(String string, ArrayList<Student> studentsList) {
        string = string.trim().toUpperCase();
        return search(string, studentsList) != null;
    }
    public boolean isDuplicatedValueInArray(String string, ArrayList<String> checkArrayList) {
        string = string.trim();
        return searchInArray(string,checkArrayList ) != null;
    }
}

