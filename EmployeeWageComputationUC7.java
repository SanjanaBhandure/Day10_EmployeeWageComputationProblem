package com.Bridgelabz.Day08_EmployeeWageComputationOOPs;

import java.util.Random;

public class EmployeeWageComputationUC7 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    public EmployeeWageComputationUC7(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        super();
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public static void totalEmpWage() {
        EmployeeWageComputationUC7 DMart = new EmployeeWageComputationUC7("DMart", 20, 20, 100);
        Random random = new Random();
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        while (totalWorkingDays < DMart.numOfWorkingDays && totalWorkingHours < DMart.maxHoursPerMonth) {
            totalWorkingDays++;
            int empCheck = random.nextInt(3);
            int empHrs = 0;
            switch (empCheck) {

                case IS_PART_TIME -> empHrs = 4;

                case IS_FULL_TIME -> empHrs = 8;

                default -> empHrs = 0;

            }
            totalWorkingHours = empHrs + totalWorkingHours;
            empWage = empHrs * DMart.empRatePerHour;
            System.out.println("Day " + totalWorkingDays + " : " + empWage);
            totalEmpWage = empWage + totalEmpWage;

        }
        System.out.println("Salary of " + DMart.company + " employee is " + totalEmpWage);

    }
    public static void main(String[] args) {
        totalEmpWage();
    }
}
