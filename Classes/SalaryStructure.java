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
public class SalaryStructure extends HumanResource  {
    private String grade;
    private String salaryType;
    private String salaryTitle;
    private double Amount;

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
    
}
