/*
 * Final Solution of UC11, UC12, UC13, UC14
 */
package com.Bridgelabz.Day10_EmployeeWageComputation;

public class EmpWageBuilderMainUC11 implements IEmployeeWageComputationUC11 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private int numOfCompany = 0;
    private final CompanyInfoUC11[] companyInfoArray;

    public EmpWageBuilderMainUC11() {
        companyInfoArray = new CompanyInfoUC11[3];
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Builder Program For Multiple companies");
        IEmployeeWageComputationUC11 empWageBuilder = new EmpWageBuilderMainUC11();
        empWageBuilder.addCompanyInfo("Dmart", 20, 20, 100);
        empWageBuilder.addCompanyInfo("JIO", 25, 22, 110);
        empWageBuilder.addCompanyInfo("Airtel", 27, 26, 120);
        empWageBuilder.computeEmpWage();
    }

    public void addCompanyInfo(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        companyInfoArray[numOfCompany] = new CompanyInfoUC11(companyName, empRatePerHr, numOfWorkingDays, maxHrsPerMonth);
        numOfCompany++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyInfoArray[i].setTotalWage(computeEmpWage(companyInfoArray[i]));
            System.out.println(companyInfoArray[i]);
        }
    }

    public static int computeEmpWage(CompanyInfoUC11 companyInfo) {
        int empHrs, totalWorkingDays = 0, totalEmpHrs = 0, empWage = 0;

        while (totalEmpHrs <= companyInfo.getMaxHrsPerMonth() && totalWorkingDays < companyInfo.getNumOfWorkingDays()) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            empHrs = switch (empCheck) {
                case IS_PART_TIME -> 4;
                case IS_FULL_TIME -> 8;
                default -> 0;
            };
            totalEmpHrs += empHrs;
            empWage = empHrs * companyInfo.getEmpRatePerHour();
            System.out.println("Day# " + totalWorkingDays + " Emp Hrs: " + empHrs + " Emp Wage: " + empWage);
            //totalEmpWage += empWage;
        }
        return totalEmpHrs * companyInfo.getEmpRatePerHour();
    }
}
