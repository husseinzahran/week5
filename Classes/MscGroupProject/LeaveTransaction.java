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
public class LeaveTransaction extends HumanResource implements IEmployee {

    private LeaveType leaveType;
    private Date startDate;
    private Date endDate;
    private int noOfDaysRequired;
    private String notes;

    @Override
    public int getEmpId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEmpId(int empId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the noOfDaysRequired
     */
    public int getNoOfDaysRequired() {
        return noOfDaysRequired;
    }

    /**
     * @param noOfDaysRequired the noOfDaysRequired to set
     */
    public void setNoOfDaysRequired(int noOfDaysRequired) {
        this.noOfDaysRequired = noOfDaysRequired;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

}
