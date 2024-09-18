package Assignment;

import java.util.Scanner;

class EmployeeWageComputation {
    int wagePerHour;
    int fullDay;
    int halfDay;
    int dailyWage;
    int monthlyWage;
    float counter1;
    int totalHourPresent;
    int totalHourPartTime;
    int totalHourAbsent;
    int empCheck;
    int totalHours;
    int totalNoOfDays;
    String companyName;

    EmployeeWageComputation(String companyName, int wage, int totalNoOfDays) {
        this.wagePerHour = wage;
        this.fullDay = 8;
        this.halfDay = 4;
        this.dailyWage = 0;
        this.monthlyWage = 0;
        this.counter1 = 0.0f;
        this.totalHourPresent = 0;
        this.totalHourPartTime = 0;
        this.totalHourAbsent = 0;
        this.totalHours = 0;
        this.companyName = companyName;
        this.totalNoOfDays = totalNoOfDays;
    }

    @Override
    public String toString() {
        return "EmployeeWageComputation [wagePerHour=" + wagePerHour + ", fullDay=" + fullDay + ", halfDay=" + halfDay
                + ", dailyWage=" + dailyWage + ", monthlyWage=" + monthlyWage + ", counter1=" + counter1
                + ", totalHourPresent=" + totalHourPresent + ", totalHourPartTime=" + totalHourPartTime
                + ", totalHourAbsent=" + totalHourAbsent + ", empCheck=" + empCheck + ", totalHours=" + totalHours
                + ", totalNoOfDays=" + totalNoOfDays + ", companyName=" + companyName + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDay = 8;
        int halfDay = 4;
        int totalNoOfDays;
        int dailyWage = 0;
        int monthlyWage = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
        System.out.println("");
        System.out.print("Enter the number of days you were supposed to work ( between 1 -20 ): ");
        totalNoOfDays = sc.nextInt();
        int totalHours = totalNoOfDays * fullDay;
        int counter = 0;
        for (int i = 1; i <= totalNoOfDays; i++) {

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 0:

                    System.out.println("Employee is Present on day and is working full time : " + i);
                    dailyWage = wagePerHour * fullDay;
                    System.out.println("The daily wage of Employee is : " + dailyWage);
                    System.out.println(" \n ");
                    counter = counter + 1;
                    break;

                case 1:
                    System.out.print("Employee is Present but working part time on day : " + i);
                    System.out.println("");
                    dailyWage = wagePerHour * halfDay;
                    System.out.println("The daily wage of Employee is : " + dailyWage);
                    System.out.println(" \n ");
                    break;

                case 2:
                    System.out.println("Employee is Absent on day :" + i);
                    dailyWage = 0;
                    System.out.println("The daily wage of Employee is : " + dailyWage);
                    System.out.println(" \n ");
                    break;
            }

            monthlyWage = monthlyWage + dailyWage;
        }
        System.out.println("\n");
        if(totalHours >= 100 || counter >= 20) {
            System.out.println("The monthly wage of employee is : " + monthlyWage);
        }
        else
        {
            System.out.println("The monthly wage of employee is : " + monthlyWage);
        }

        sc.close();

    }
}
