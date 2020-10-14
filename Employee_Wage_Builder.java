package com.nt.java_Program;

public class Employee_Wage_Builder {
	int isFullTime=1;
	int isPartTime=2;
	int empHour=0;
	double empWage=0;
	double totalEmpWage=0;
	int totalEmpHours=0;
	int totalWorkingDays=0;
	String company;
	int num_Working_Days;
	int num_hours_In_Month;
	int wagePerHour;
	 

    public void calculateTotalWage_Month() {
    	while(totalEmpHours<=num_hours_In_Month && totalWorkingDays<=num_Working_Days ) {
    		totalWorkingDays++;
    		int empCheck=(int) (Math.floor(Math.random()*10)%3);
    		
    		switch (empCheck) {
    		case 1:
    			empHour=8;
    			break;
    		case 2:
    			empHour=4;
    			break;
    		default:
    			empHour=0;
    	}
    		totalEmpHours=totalEmpHours+empHour;
    		System.out.println("Days="+totalWorkingDays + "EmpHours="+empHour);
    }
    	totalEmpWage=totalEmpHours*wagePerHour;
    	//System.out.println("Total employee wage for Company"+" "+company+"="+totalEmpWage);
    }
@Override
	public String toString() {
	
		return "Employee_Wage_Builder [totalEmpWage=" + totalEmpWage + ", company=" + company + "]";
	}
public static void main(String[]args) {
	System.out.println("Welcome to EmployeeWage Computation Program on Master Branch");
	Employee_Wage2 Dmart=new Employee_Wage2("Dmart",20,100,20);
	Dmart.calculateTotalWage_Month();
	//System.out.println(Dmart);
	System.out.println("=============================");
	Employee_Wage2 bigBasket=new Employee_Wage2("bigBasket",20,100,10);
 	bigBasket.calculateTotalWage_Month();
 	//System.out.println(bigBasket);
   
}	
}



