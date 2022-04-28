package com.Bridgelabz.Day08_EmployeeWageComputationOOPs;

import java.util.Random;

public class EmployeeWageBuilderOOPsUC5 {
    static final int IS_FULL_TIME = 1;// constants
    static final int IS_PART_TIME = 2;// constants
    static final int EMP_WAGE_PER_DAY = 20;
    static final int EMP_WAGE_FOR_MONTH = 20;

    /*
     * generating random numbers with in 3 using random functions
     */
    public static int empCheck() {
        Random random = new Random();// random is object
        int empCheck = random.nextInt(3);
        return empCheck;
    }

    /*
     * calculating employee work hours
     */
    public static int empSalary(int empCheck) {
        int empWrkHrs;
        switch (empCheck) {
            case IS_FULL_TIME -> empWrkHrs = 8;
            case IS_PART_TIME -> empWrkHrs = 4;
            default -> empWrkHrs = 0;
        }
        int empWage = empWrkHrs * EMP_WAGE_PER_DAY;
        return empWage;
    }

    public static int totalEmpSalary() {
        int day = 0;
        int totalEmpSalary = 0;
        int empWage = 0;
        int empCheck = 0;
        while (day < EMP_WAGE_FOR_MONTH) {
            empCheck = empCheck();
            empWage = empSalary(empCheck);
            ++day;
            totalEmpSalary += empWage;
        }
        return totalEmpSalary;
    }

    public static void main(String[] args) {
        int totalEmpSalary = EmployeeWageBuilderOOPsUC5.totalEmpSalary();
        System.out.println("Total Employee Salary: " + totalEmpSalary);
    }
}
