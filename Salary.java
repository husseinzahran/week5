/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MscGroupProject;

/**
 *
 * @author Administrator
 */
public class Salary extends HumanResource implements IEmployee,ISalary {

    private String grade;
    private String salaryType;
    private String salaryTitle;
    private int year;
    private int month;
    private int daysWorked;
    private double Amount;
    private double Total;
    private int empId;
    private int salaryStructureId;
    
    @Override
    public int getEmpId() {
       return this.empId;
    }

    @Override
    public void setEmpId(int empId) {
        this.empId=empId;
    }

    @Override
    public int getSalStrucId() {
        return this.salaryStructureId;
    }

    @Override
    public void setSalStrucId(int salaryStructureId) {
         this.salaryStructureId = salaryStructureId;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the salaryType
     */
    public String getSalaryType() {
        return salaryType;
    }

    /**
     * @param salaryType the salaryType to set
     */
    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
    }

    /**
     * @return the salaryTitle
     */
    public String getSalaryTitle() {
        return salaryTitle;
    }

    /**
     * @param salaryTitle the salaryTitle to set
     */
    public void setSalaryTitle(String salaryTitle) {
        this.salaryTitle = salaryTitle;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the daysWorked
     */
    public int getDaysWorked() {
        return daysWorked;
    }

    /**
     * @param daysWorked the daysWorked to set
     */
    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    /**
     * @return the Amount
     */
    public double getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    /**
     * @return the Total
     */
    public double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(double Total) {
        this.Total = Total;
    }
    
}
