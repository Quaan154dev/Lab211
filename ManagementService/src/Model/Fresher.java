/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author quandba
 */
public class Fresher extends Candidate{
    private Integer graduateDate;
    private String graduateRank;
    private String education;

    public Fresher() {
    }

    public Fresher(Integer graduateDate, String graduateRank, String education, String candidateId, String firstName, String lastName, Integer birthDate, String address, String phone, String email, Integer candidateType) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduateDate = graduateDate;
        this.graduateRank = graduateRank;
        this.education = education;
    }

    public Integer getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(Integer graduateDate) {
        this.graduateDate = graduateDate;
    }

    public String getGraduateRank() {
        return graduateRank;
    }

    public void setGraduateRank(String graduateRank) {
        this.graduateRank = graduateRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString() + "Fresher{" +
                "graduateDate=" + graduateDate +
                ", graduateRank='" + graduateRank + '\'' +
                '}';
    }
    
    
}
