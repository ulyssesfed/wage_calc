package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int hoursWorked = getInt("Enter hours worked per week: ");
        int weeksWorked = getInt("How many weeks did you work? ");
        double hourlyRate = getfloat("Enter hourly rate: ");
        double deductionRate = getfloat("Enter deduction rate: ");
        double yearlyEarnings = (hoursWorked * weeksWorked) * hourlyRate;
        double deductions = yearlyEarnings * deductionRate;
        double netYearlyEarningsAfterDeductions = yearlyEarnings - deductions;
        System.out.println("Yearly earnings: " + yearlyEarnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Net yearly earnings after deductions: " + netYearlyEarningsAfterDeductions);
    }

    private static int getInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static float getfloat(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextFloat();

    }
}
