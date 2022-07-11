package com.denominations.service;

public class Denominations 
{
	public void findminDenominations(int denominations[], int amount)
	{
		int notesCounter[]= new int[denominations.length];
		  
		for(int i=0;i<denominations.length;i++)
		{
			if (amount>=denominations[i])
			{
				notesCounter[i]=amount/denominations[i];
				amount= amount-(denominations[i]*notesCounter[i]);
			}
		}
		if (amount>0)
		{
			System.out.println("Maintain sufficient denominations during the travel");
		}
		else
		{
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0; i<notesCounter.length;i++)
			{
				if(notesCounter[i]!=0)
				{
					System.out.println(denominations[i]+" : "+notesCounter[i]);
				}
					
			}
		}
		
		
	}

}
