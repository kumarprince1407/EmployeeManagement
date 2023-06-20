package com.bridgelabz.employeemanagement;

import java.util.*;
public class EmployeeManagement {
    public static void main(String args[]){
        System.out.println("Welcome to Employee Wage Computation Program.");
        Random random = new Random(2);
        int attendance = random.nextInt(2);
        int empWagePerHr = 20;
        int fullDayHr = 8;
        int dailyWage = 0;

        if(attendance==1){
            dailyWage = empWagePerHr*fullDayHr;
            System.out.println("Employee is present");
            System.out.println("Daily wage = "+ dailyWage);
        }
        else{
            System.out.println("Employee is absent");
        }



    }
}
