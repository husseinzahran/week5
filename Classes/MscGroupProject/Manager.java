/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MscGroupProject;

import java.util.List;

/**
 *
 * @author husseinzahran
 */
public class Manager extends Employee {
    private boolean isManager;
    private List<Employee> employees;
    
    public Manager(){
        
    }
    
     public Manager(int employeeId,String firstName, String lastName, String nationality, String email, String department, String designation) {
         //construct manager from super class
         super(employeeId, firstName,  lastName,  nationality,  email,  department,  designation);
         isManager = true;
         
     }
    /**
     * @return the isManager
     */
    public boolean getIsManager() {
        return isManager;
    }

    /**
     * @param isManager the nationality to set
     */
    public void setIsManager(boolean isManager) {
        this.isManager = isManager;
    }
    
    /**
     * @return the employees
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param employees the nationality to set
     */
    public void setIsManager(List<Employee> employees) {
        this.employees = employees;
    }
    
}
