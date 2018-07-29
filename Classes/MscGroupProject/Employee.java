/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MscGroupProject;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Employee extends HumanResource {

    private String firstName;
    private String middleName;
    private String lastName;
    private String nationality;
    private String email;
    private String department;
    private String designation;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private Date dateOfBirth;
    private Date employmentDate;
    private Date confirmationDate;
    private Date lastPromotionDate;

    public Employee() {

    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * @return the maritalStatus
     */
    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus the maritalStatus to set
     */
    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the employmentDate
     */
    public Date getEmploymentDate() {
        return employmentDate;
    }

    /**
     * @param employmentDate the employmentDate to set
     */
    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    /**
     * @return the confirmationDate
     */
    public Date getConfirmationDate() {
        return confirmationDate;
    }

    /**
     * @param confirmationDate the confirmationDate to set
     */
    public void setConfirmationDate(Date confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    /**
     * @return the lastPromotionDate
     */
    public Date getLastPromotionDate() {
        return lastPromotionDate;
    }

    /**
     * @param lastPromotionDate the lastPromotionDate to set
     */
    public void setLastPromotionDate(Date lastPromotionDate) {
        this.lastPromotionDate = lastPromotionDate;
    }

}


