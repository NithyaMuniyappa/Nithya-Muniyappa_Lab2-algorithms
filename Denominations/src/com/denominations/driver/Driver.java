package com.denominations.driver;

import java.util.Scanner;

import com.denominations.service.Denominations;
import com.denominations.service.MergeSort;

public class Driver 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		MergeSort sort= new MergeSort();
		Denominations dm= new Denominations();
		
		System.out.println("Enter the size of currency denominations");
		int noOfDenominations= sc.nextInt();
		int denominations[]= new int [noOfDenominations];
		
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<noOfDenominations;i++)
		{
			denominations[i]=sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		sc.close();
		
		sort.mergeSort(denominations,0,noOfDenominations-1);
		dm.findminDenominations(denominations, amount);
		
	}
	
	
	
}

