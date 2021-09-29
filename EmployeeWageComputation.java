package com.company;

import java.util.Random;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program using OOP");
        int IS_PRESENT = 1;
        Random num = new Random();
        int randomCheck = num.nextInt(2);
        if (IS_PRESENT == randomCheck)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }
}
