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
public class LeaveBank extends HumanResource implements IEmployee {

    private LeaveType leaveType;
    private int year;
    private int month;
    private int totalLeaveDays;
    private int totalLeaveDaysUsed;
    private int leaveBalance;
    private int empId;
    @Override
    public int getEmpId() {
        return this.empId;
    }

    @Override
    public void setEmpId(int empId) {
        this.empId =empId;
    }

    /**
     * @return the leaveType
     */
    public LeaveType getLeaveType() {
        return leaveType;
    }

    /**
     * @param leaveType the leaveType to set
     */
    public void setLeaveType(LeaveType leaveType) {
        this.leaveType = leaveType;
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
     * @return the totalLeaveDays
     */
    public int getTotalLeaveDays() {
        return totalLeaveDays;
    }

    /**
     * @param totalLeaveDays the totalLeaveDays to set
     */
    public void setTotalLeaveDays(int totalLeaveDays) {
        this.totalLeaveDays = totalLeaveDays;
    }

    /**
     * @return the totalLeaveDaysUsed
     */
    public int getTotalLeaveDaysUsed() {
        return totalLeaveDaysUsed;
    }

    /**
     * @param totalLeaveDaysUsed the totalLeaveDaysUsed to set
     */
    public void setTotalLeaveDaysUsed(int totalLeaveDaysUsed) {
        this.totalLeaveDaysUsed = totalLeaveDaysUsed;
    }

    /**
     * @return the leaveBalance
     */
    public int getLeaveBalance() {
        return leaveBalance;
    }

    /**
     * @param leaveBalance the leaveBalance to set
     */
    public void setLeaveBalance(int leaveBalance) {
        this.leaveBalance = leaveBalance;
    }
    
}


