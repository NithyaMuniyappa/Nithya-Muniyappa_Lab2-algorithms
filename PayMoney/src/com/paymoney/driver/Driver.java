package com.paymoney.driver;

import java.util.Scanner;

import com.paymoney.service.PayMoney;

public class Driver
{
	public void display( int array[],int size)
	 {
		 for (int i=0;i<size;i++)
		 {
			 System.out.println(array[i]);
		 }
	 }
	
 public static void main (String [] args)
 { 
	 Scanner input = new Scanner(System.in);
	 PayMoney pm = new PayMoney();
	
	System.out.println("Enter the size of transaction array ");
	int noOfTransactions= input.nextInt();
	int[] transactions= new int[noOfTransactions];
	
	System.out.println("Enter the values of array ");
	for (int i=0;i<noOfTransactions;i++)
	{
		transactions[i]=input.nextInt();
	}
	
	System.out.println("Enter the total no of targets that needs to be achieved ");
	int noOfTargets= input.nextInt();
	int target;
	
	for (int i=0;i<noOfTargets;i++)
	 {   
		System.out.println("Enter the value of target ");
		target=input.nextInt();
		
		int targetAchieved=pm.findTarget(transactions,target);
		if(targetAchieved==-1)
	    {
		   System.out.println("Given target is not achieved\n");
	    }
		else
		{
			System.out.println("Target achieved after  "+targetAchieved+" transactions\n");
		}
	 }
	
	input.close();
 }
 
 
}
