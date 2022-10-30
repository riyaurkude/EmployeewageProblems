package com.bridgelabz;

public class EmployeeWageUC1 {

	public static void main(String[] args)
	{
		//uc3
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int IS_PART_TIME_HOUR = 8;
		int IS_PART_TIME =0;
		
		int empHrs=0;
		int empWage=0;
		
		double empcheck=Math.floor(Math.random()*10)%2;
		
		if(empcheck == IS_PART_TIME)
		{
			empHrs=8;
			System.out.println("part-time hours:"+empHrs);
		}
		else
		{
			empHrs=16;
			System.out.println("full-time hours:"+empHrs);
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("emp wage: "+ empWage);
	}

}


