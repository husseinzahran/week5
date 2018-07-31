/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MscGroupProject;

import java.util.TreeSet;

/**
 *
 * @author husseinzahran
 */
public class EmployeeList {
    public static TreeSet<Employee> employees;
    
    //Construct application level employees list 
    public EmployeeList(){
       employees = new TreeSet<Employee>();
       employees.add(new Employee(1,"Hussein","Zahran","Egypt","asd@asd.asd","Engineering","Software Engineer"));
    }
    
    //Method to add a new Employee
    public void addEmployee(Employee emp){
       employees.add(emp);
    }
    
    public static int getNewEmployeeId(){
        if(employees!=null ){
            int lastId = employees.last().getId();
            return lastId+1;
        }
        
        return 0;
    }

}
