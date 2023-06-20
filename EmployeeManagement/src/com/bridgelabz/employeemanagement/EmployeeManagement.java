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
        String attendanceType = "";
        switch(attendance) {
            case 1:
                dailyWage = empWagePerHr * fullDayHr;
                attendanceType = "full-time";
                break;
            case 2:
                dailyWage = empWagePerHr * partTimeHour;
                attendanceType = "part time";
                break;
            default:
                attendanceType = "absent";
        }

        System.out.println("Employee is "+ attendanceType +". Daily Wage: "+ dailyWage);
    }



}
