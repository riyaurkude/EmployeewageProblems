package com.bridgelabz;

public class EmployeeWageUC1 {

	public static void main(String[] args)
	{
		//uc1
		//constants
				int IS_PRESENT=1;
				//variables
				
				double empcheck=Math.floor((Math.random()*10)%2);
				
				if(empcheck == IS_PRESENT)
				{
					System.out.println("Employee is Present");
				}
				else
				{
					System.out.println("Employee is absent");
				}
				
			}
		
	}


