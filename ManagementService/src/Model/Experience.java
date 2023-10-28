/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author quandba
 */
public class Experience extends Candidate{
    private Integer explnYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(Integer explnYear, String proSkill, String candidateId, String firstName, String lastName, Integer birthDate, String address, String phone, String email, Integer candidateType) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.explnYear = explnYear;
        this.proSkill = proSkill;
    }

    public Integer getExplnYear() {
        return explnYear;
    }

    public void setExplnYear(Integer explnYear) {
        this.explnYear = explnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() +  "Experience{" +
                "explnYear=" + explnYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
    
    
 

        
    
}
