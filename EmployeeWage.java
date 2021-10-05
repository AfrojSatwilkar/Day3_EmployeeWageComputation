package com.company;

public class EmployeeWage extends Employee{

    //Check Employee Attendance
    protected void employeeAttendance() {
        System.out.println("--------Employee Attendance---------");
        if (randomCheck == 1) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }

    //Calculating Daily wage of Employee
    protected void dailyEmployeeWage(){
        System.out.println("--------Daily Wage---------");
        if (randomCheck == 1) {
            EMP_HRS = 8;
        }
        else {
            EMP_HRS = 0;
        }
        TotalWageInDay = WAGE_PER_HR * EMP_HRS;
        System.out.println("Total wage in Day : "+TotalWageInDay);
    }

    //calculating daily wage of part time employee
    protected void partTimeEmployeeWage(){
        System.out.println("--------Part Time---------");
        if (randomCheck == 1) {
            EMP_HRS = 8;
        }
        else if (randomCheck == 2) {
            EMP_HRS = 4;
        }
        else {
            EMP_HRS = 0;
        }
        TotalWageInDay = WAGE_PER_HR * EMP_HRS;
        System.out.println("Total wage in Day : "+TotalWageInDay);
    }

    //Calculating employee wage using switch case statement
    protected void empWageSwitch(){
        System.out.println("--------Using Switch---------");
        employeeWageUsingSwitch();
        TotalWageInDay = WAGE_PER_HR * EMP_HRS;
        System.out.println("Total wage in Day : "+TotalWageInDay);
    }

    //Calculating Wages for a month
    protected void wagesForMonth(){
        System.out.println("--------Wages for a month---------");
        while (TOTAL_WORKING_DAYS < MAX_WORKING_DAYS){
            getRandomNumber();
            employeeWageUsingSwitch();
            TOTAL_WORKING_DAYS++;
        }
        TOTAL_SALARY = WAGE_PER_HR * TOTAL_EMP_HRS;
        System.out.println("Total Salary : "+TOTAL_SALARY);

    }

    //calculating Wages For Working Hour And Days
    protected void wagesForWorkingHourAndDays(){
        System.out.println("--------Wages for working hours and days---------");
        while (TOTAL_WORKING_DAYS < MAX_WORKING_DAYS && TOTAL_EMP_HRS < MAX_HRS_IN_MONTH){
            getRandomNumber();
            employeeWageUsingSwitch();
            TOTAL_WORKING_DAYS++;
        }
        TOTAL_SALARY = WAGE_PER_HR * TOTAL_EMP_HRS;
        System.out.println("Total Salary : "+TOTAL_SALARY);
    }
}
