package com.company;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program using OOP");

        //creating object for child class
        EmployeeWage employeeData = new EmployeeWage();

        //Getting random number
        employeeData.getRandomNumber();

        //Checking for employee attendance
        employeeData.employeeAttendance();

        //Getting daily Emp Wage
        employeeData.dailyEmployeeWage();

        //Getting part time Emp Wage
        employeeData.partTimeEmployeeWage();

        //Getting employee wage using switch
        employeeData.empWageSwitch();

        //Getting Wages for month
        employeeData.wagesForMonth();

        //Getting Wages For Working Hour And Days
        employeeData.wagesForWorkingHourAndDays();
    }
}