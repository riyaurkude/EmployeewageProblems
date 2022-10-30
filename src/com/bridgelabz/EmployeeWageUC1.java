package com.bridgelabz;

public class EmployeeWageUC1 {

	public static void main(String[] args)
	{
		//uc4
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
				empHrs =8;
				break;
			case 1:
				empHrs =16;
				break;
			default:
				empHrs = 0;
				break;
				}
		
				empWage = empHrs *  EMP_RATE_PER_HOUR;
				System.out.println("The employee wage for "+empHrs+" is:" + empWage);
		}
		

}



