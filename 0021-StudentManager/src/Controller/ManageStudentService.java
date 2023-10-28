/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quandba
 */
public class ManageStudentService {
    
    private ArrayList<Student> studentsList = new ArrayList<>();
    private ManageFunction manageFunction = new ManageFunction();
    private InputFunctions inputFunctions = new InputFunctions();
    

    public ArrayList<Student> returnStudentsList() {
        return studentsList;
    }
    public void handleLoadDataAndSaveData() {
        manageFunction.loadDataAndSaveData(studentsList);
    }
    public void handleAddStudents() {
        manageFunction.addStudentList(studentsList);
        manageFunction.displayStudentsList("LIST OF STUDENT: ", studentsList);
    }
    public void handleFindStudent() {
        manageFunction.displayStudentsList("LIST OF STUDENTS: ", studentsList);
        String searchName = inputFunctions.inputString("Enter student name to find: ", "^[a-zA-Z]{1,}(?: [a-zA-Z]+){0,3}$" );
        ArrayList<Student> tempArrayList = manageFunction.search(studentsList, student -> (student.getStudentName().contains(searchName)));
        if(tempArrayList.isEmpty()) {
            System.out.println("Do not have any student have the name " + searchName + " !");
        } else {
            manageFunction.displayStudentsList("LIST OF STUDENT HAS THE NAME: " + searchName.toUpperCase(), tempArrayList);
        }
    }
    public void handleUpdateAndDelete() {
        manageFunction.updateAndDelete(studentsList);
    }
    public void report() {
        manageFunction.displayStudentsReport("REPORT LIST OF STUDENTS: ", studentsList);
    }

   
  
}
