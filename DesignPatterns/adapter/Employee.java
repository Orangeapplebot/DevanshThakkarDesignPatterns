package net.media.training.designpattern.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 21, 2011
 * Time: 4:58:33 PM
 * To change this template use File | Settings | File Templates.
 */

/*
 * Employee- Name, Salary. Methods- getName, equals, hashcode
 * LeaveRecord- getMostAbsentEmployee, getEmployeeAbsence; Breaks ocp
 * Addapter- Uses LeaveRecord; gives functionality to FrontDoor, SalaryDisberser
 * FrontDoor- LeaveRecord. Methods- FrontDoorRegister, getDisplayWallOfShame
 * SalaryDisberser- LeaveRecord. Methods- SalaryDisberser, salary
 */

public class Employee {
    private String name;
    public int SALARY;

    public Employee(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return !(name != null ? !name.equals(employee.name) : employee.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}