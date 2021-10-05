package com.company;

import java.util.Random;

public class Employee {

    //parent variable
    protected int randomCheck;
    protected int WAGE_PER_HR=20;
    protected int EMP_HRS;
    protected int TotalWageInDay;
    protected int TOTAL_WORKING_DAYS = 0;
    protected int MAX_WORKING_DAYS = 20;
    protected int TOTAL_SALARY =0;
    protected int TOTAL_EMP_HRS = 0;
    protected int MAX_HRS_IN_MONTH =100;

    //generating random number
    protected void getRandomNumber() {
        Random num = new Random();
        randomCheck = num.nextInt(2)+1;
    }

    //calculating employee wage using switch case statement
    protected void employeeWageUsingSwitch() {
        switch (randomCheck) {
            case 1 ->  EMP_HRS = 8;
            case 2 ->  EMP_HRS = 4;
            default -> EMP_HRS = 0;
        }
        TOTAL_EMP_HRS = TOTAL_EMP_HRS + EMP_HRS;
    }
}
