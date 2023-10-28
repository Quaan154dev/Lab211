/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import Model.Student;
import java.util.ArrayList;

/**
 *
 * @author quandba
 */
public interface IStudentManagement {
//    private FunctionsLibrary functionsLibrary = new FunctionsLibrary();
    ArrayList<Student> studentsList = new ArrayList<>();
    
    void addStudent(ArrayList<Student> studenstList);
    void sortStudent(ArrayList<Student> studentsList);
    void displayStudent(ArrayList<Student> studentsList, String msg);

   
}
