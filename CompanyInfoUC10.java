package com.Bridgelabz.Day10_EmployeeWageComputation;

public class CompanyInfoUC10 {
    private String companyName;
    private int empRatePerHour;
    private int numOfWorkingDays;
    private int maxHrsPerMonth;
    private int totalWage;

    public CompanyInfoUC10(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String getCompanyName () {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public void setEmpRatePerHour(int empRatePerHour) {
        this.empRatePerHour = empRatePerHour;
    }

    public int getNumOfWorkingDays() {
        return numOfWorkingDays;
    }

    public void setNumOfWorkingDays(int numOfWorkingDays) {
        this.numOfWorkingDays = numOfWorkingDays;
    }

    public int getMaxHrsPerMonth() {
        return maxHrsPerMonth;
    }

    public void setMaxHrsPerMonth(int maxHrsPerMonth) {
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    @Override
    public String toString() {
        return "CompanyInfoUC10{" +
                "companyName='" + companyName + '\'' +
                ", empRatePerHour=" + empRatePerHour +
                ", numOfWorkingDays=" + numOfWorkingDays +
                ", maxHrsPerMonth=" + maxHrsPerMonth +
                ", totalWage=" + totalWage +
                '}';
    }
}
