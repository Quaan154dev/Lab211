/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author quandba
 */
public class Student {
    private String  StudentID; 
    private String studentName;
    private Integer semester;
    private String courseName;
    private Integer totalCourse;

    public Student() {
    }

    public Student(String StudentID, String studentName, Integer semester, String courseName, Integer totalCourse) {
        this.StudentID = StudentID;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
        this.totalCourse = totalCourse;
    }

    public Student(String StudentID, String studentName, Integer semester, String courseName) {
        this.StudentID = StudentID;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }
   
    

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getTotalCourse() {
        return totalCourse;
    }

    public void setTotalCourse(Integer totalCourse) {
        this.totalCourse = totalCourse;
    }

    @Override
    public String toString() {
        return "Student{" + "StudentID=" + StudentID + ", studentName=" + studentName + ", semester=" + semester + ", courseName=" + courseName + ", totalCourse=" + totalCourse + '}';
    }
 
  
    
}
