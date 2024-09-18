package Assignment;


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
        EmployeeWageComputation tataMotors = new EmployeeWageComputation("Tata Motors", 20, 5);
        System.out.println(tataMotors.toString());

        int wagePerHour = 20;
        int fullDay = 8;
        System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
        System.out.println("");

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if(empCheck == 0)
        {
            System.out.print("Employee is Present");
            System.out.println("");
            System.out.print("The daily wage of Employee is : " + ( wagePerHour * fullDay ));
            System.out.println("");
        }
        else
        {
            System.out.print("Employee is Absent");
            System.out.println("");
            System.out.println("The daily wage of Employee is : 0 " );
            System.out.println("");
        }

    }
}
