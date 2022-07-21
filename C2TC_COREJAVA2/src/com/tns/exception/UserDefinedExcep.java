package com.tns.practice;

import java.util.Scanner;

public class UserDefinedExcep {

	public static void main(String[] args) throws CantVote {
		int age;
		System.out.println("Enter the age=");
		Scanner s =new Scanner(System.in);
		age=s.nextInt();
		
		if(age<18)
		{
			throw new CantVote("You cannot cast your vote.....age below 18");
		}
		
		else
		{
			System.out.println("You can vote.....");
		}


	}

}

class CantVote extends Exception    //Checked Exception
{
	CantVote(String msg)
	{
		super(msg);
	}
}