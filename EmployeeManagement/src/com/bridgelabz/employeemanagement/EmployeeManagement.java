package com.bridgelabz.employeemanagement;

import java.util.*;
public class EmployeeManagement {
    public static void main(String args[]){
        System.out.println("Welcome to Employee Wage Computation Program.");
        Random random = new Random();
        int attendance = random.nextInt(3);
        int empWagePerHr = 20;
        int fullDayHr = 8;
        int partTimeHour = 4;//uc3
        int dailyWage = 0;

        if(attendance==1){
            dailyWage = empWagePerHr*fullDayHr;
            System.out.println("Employee is present full time");
            System.out.println("Daily wage = "+ dailyWage);
        } else if (attendance==2) {
            dailyWage = empWagePerHr*partTimeHour;
            System.out.println("Employee is present part time");
            System.out.println("Daily wage = "+ dailyWage);
        } else{
            System.out.println("Employee is absent");
        }
/*
* UC3
Add Part time
Employee & Wage
- Assume Part time Hour is 8*/


    }
}



