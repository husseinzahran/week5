/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MscGroupProject;
//import the utilities from Java
import java.util.Date;

/**
 *
 * @Group work
 */

//Inheritance demonstration
public class Employee extends HumanResource implements Comparable<Employee>{

    private String firstName;
    private String lastName;
    private String nationality;
    private String email;
    private String department;
    private String designation;
    

    public Employee() {

    }
    
    public Employee(int employeeId,String firstName, String lastName, String nationality, String email, String department, String designation) {
        this.setId(employeeId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.email = email;
        this.department = department;
        this.designation = designation;
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

    @Override
    public int compareTo(Employee e) {
         if (this.getId() == e.getId()) {
             return 0;
         } else if (this.getId() < e.getId()) {
             return -1;
         }
         return 1;
    }

}//end class employee


