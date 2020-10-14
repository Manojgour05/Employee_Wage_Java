   package com.nt.java_Program;

public class Employee_Wage2 {
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
			 public Employee_Wage2(String company, int num_Working_Days, int num_hours_In_Month, int wagePerHour) {
				super();
				this.company = company;
				this.num_Working_Days = num_Working_Days;
				this.num_hours_In_Month = num_hours_In_Month;
				this.wagePerHour = wagePerHour;
			}
			double empCheck=Math.floor(Math.random()*10)%3;
		   public void Employee_Attendance() {
			  
			   if(empCheck==isFullTime) {
				   System.out.println("Present");
			   }
			   else {
				   System.out.println("Absent");
			   }
		   }
		    public void calculateFullTime_Wage() {
		    	//double empCheck=Math.floor(Math.random()*10)%2;
		    	if(empCheck==isFullTime) {
		    	   empHour=8;	
		    	}
		    	else {
		    		empHour=0;
		    	}
		    	empWage=(empHour*wagePerHour);
		    	System.out.println("Employee FullTime wage="+empWage);
		    }
		    public void calculatePartTime_Wage() {
		    	//double empCheck1=Math.floor(Math.random()*10)%3;
		    	if(empCheck==isPartTime) {
		    	   empHour=4;	
		    	}
		    	else {
		    		empHour=0;
		    	}
		    	empWage=(empHour*wagePerHour);
		    	System.out.println("Employee PartTime wage="+empWage);
		    }
		    public void checkEmployee_Wage() {
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
		    	empWage=(empHour*wagePerHour);
		    	System.out.println("Employee wage="+empWage);
		    }
		    
		    public void calculateTotalWage() {
		    	for(int day=0;day<num_Working_Days;day++) {
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
		    		empWage=(empHour*wagePerHour);
		    		totalEmpWage=totalEmpWage+empWage;
		    }
		    	System.out.println("Total employee wage for Company"+ " "+company+"="+totalEmpWage);
		    }
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
		    	System.out.println("Total employee wage for Company"+" "+company+"="+totalEmpWage);
		    }
   public static void main(String[]args) {
	   System.out.println("Welcome to EmployeeWage Computation Program on Master Branch");
	   Employee_Wage2 emp=new Employee_Wage2("Dmart",20,100,20);
		emp.Employee_Attendance();
		emp.calculateFullTime_Wage();
		emp.calculatePartTime_Wage();
		emp.checkEmployee_Wage();
		emp.calculateTotalWage();
		emp.calculateTotalWage_Month();
		System.out.println("=============================");
		 Employee_Wage2 emp2=new Employee_Wage2("bigBasket",20,100,10);
			emp2.Employee_Attendance();
			emp2.calculateFullTime_Wage();
			emp2.calculatePartTime_Wage();
			emp2.checkEmployee_Wage();
			emp2.calculateTotalWage();
			emp2.calculateTotalWage_Month();
	}	
}


	

