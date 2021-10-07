package com.company;

import java.util.Random;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program using OOP");
        int WAGE_PER_HR =20;
        int MAX_WORKING_DAYS = 20;
        int MAX_HRS_IN_MONTH = 100;
        int TOTAL_WORKING_DAYS = 0;
        int TOTAL_EMP_HRS = 0;
        int EMP_HRS;
        int TOTAL_SALARY;
        while (TOTAL_WORKING_DAYS < MAX_WORKING_DAYS && TOTAL_EMP_HRS < MAX_HRS_IN_MONTH){
            Random num = new Random();
            int randomCheck = num.nextInt(3);
            switch (randomCheck) {
                case 1 -> EMP_HRS = 8;
                case 2 -> EMP_HRS = 4;
                default -> EMP_HRS = 0;
            }
            TOTAL_EMP_HRS = TOTAL_EMP_HRS + EMP_HRS;
            TOTAL_WORKING_DAYS++;
        }
        TOTAL_SALARY = WAGE_PER_HR * TOTAL_EMP_HRS;
        System.out.println("Total Salary : "+TOTAL_SALARY);

    }
}
