package com.company;

import java.util.Random;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program using OOP");
        int WAGE_PER_HR = 20;
        int EMP_HRS;
        int TotalWageInDay;
        Random num = new Random();
        int randomCheck = num.nextInt(3);
        switch (randomCheck){
            case 1 -> EMP_HRS=8;
            case 2 -> EMP_HRS=4;
            default -> EMP_HRS=0;

        }
        TotalWageInDay = WAGE_PER_HR * EMP_HRS;
        System.out.println("Total wage in Day : "+TotalWageInDay);

    }
}
