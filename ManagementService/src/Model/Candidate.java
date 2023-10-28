/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author quandba
 */
public class Candidate {
    private String candidateId;
    private String firstName;
    private String lastName;
    private Integer birthDate;
    private String address;
    private String phone;
    private String email;
    private Integer candidateType;

    public Candidate() {
        
    }

    public Candidate(String candidateId, String firstName, String lastName, Integer birthDate, String address, String phone, String email, Integer candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Integer birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(Integer candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId='" + candidateId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", candidateType=" + candidateType +
                '}';
    }
    
    public void display(){
        System.out.format("| %-5s %-5s| %-5s | %-8s | %-5s | %-10s | %-5s \n",
                firstName,lastName,birthDate,address,phone,email,candidateType);
    }

    
    
     
    
    
    
    
    
}
