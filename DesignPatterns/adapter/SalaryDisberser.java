package net.media.training.designpattern.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 21, 2011
 * Time: 5:51:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalaryDisberser {
    private LeaveRecord leaveRecord;

    public SalaryDisberser(LeaveRecord leaveRecord) {
        this.leaveRecord = leaveRecord;
    }

    public int salary(Employee employee) {
        String employeeName = employee.getName();
        return employee.SALARY - leaveRecord.getEmployeeAbsences(String.valueOf(employeeName)) * 1000;
    }

}
