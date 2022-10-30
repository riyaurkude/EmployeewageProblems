package com.bridgelabz;

public class EmployeeWageUC1 {

	public static void main(String[] args)
	{
		//UC6
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int IS_PART_TIME_HOUR = 8;
		int IS_PART_TIME =0;
		int workingdays=20;
		int empWage=0;
		
		int empHrs = 0;
		double employeeCheck = Math.floor(Math.random() * 10 % 2);
		int i = (int)employeeCheck;
		switch (i)
		{
			case 0:
				empHrs =0;
				break;
			case 1:
				empHrs =1;
				break;
			default:
				empHrs = 0;
				break;
		}
		System.out.println("Nowwage for 100 working hour and 20 workinh days is:");
		//empHrs=100
		if(employeeCheck==IS_PART_TIME || employeeCheck==IS_FULL_TIME)
		{
			empHrs=100;
			System.out.println("Employee hour: "+ empHrs);
		empWage = empHrs *  EMP_RATE_PER_HOUR;
		System.out.println("The employee wage for "+empHrs+" is:" + empWage);
	}
		int totalwage=0;
		for(int j=0;j<workingdays;j++)
		{
			totalwage=totalwage+empWage;
		}
		System.out.println("total ways for"+ workingdays + "is: "+ totalwage);
	
	}
}



