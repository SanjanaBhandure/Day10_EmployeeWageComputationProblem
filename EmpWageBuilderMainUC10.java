package com.Bridgelabz.Day10_EmployeeWageComputation;

public class EmpWageBuilderMainUC10 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private CompanyInfoUC10[] companyInfoArray;

    public EmpWageBuilderMainUC10() {
        companyInfoArray = new CompanyInfoUC10[3];
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Builder Program For Multiple companies");
        EmpWageBuilderMainUC10 empWageBuilder = new EmpWageBuilderMainUC10();
        empWageBuilder.addCompanyInfo("DMart", 20, 20, 100);
        empWageBuilder.addCompanyInfo("JIO", 25, 22, 110);
        empWageBuilder.addCompanyInfo("Airtel", 27, 26, 120);
        empWageBuilder.computeEmpWage();
    }

    private void addCompanyInfo(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        companyInfoArray[numOfCompany] = new CompanyInfoUC10(companyName, empRatePerHr, numOfWorkingDays, maxHrsPerMonth);
        numOfCompany++;
    }

    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyInfoArray[i].setTotalWage(computeEmpWage(companyInfoArray[i]));
            System.out.println(companyInfoArray[i]);
        }
    }

    public static int computeEmpWage(CompanyInfoUC10 companyInfo) {
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
