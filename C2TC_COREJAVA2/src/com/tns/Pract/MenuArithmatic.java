package com.tns.practice;

import java.util.Scanner;

public class MenuArithmatic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("MENU");
		System.out.println("************");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("DIV");
		System.out.println("MUL");
		
		System.out.println("ENTER THE 2 NUMBERS: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.nextLine();
		
		System.out.println("ENTER THE OPTION IN WORDS: ");
		String option=sc.nextLine();
		
		switch(option)
		{
				case "ADD":
				{
					System.out.println(num1+num2);
					break;
				}

				case "SUB":
				{
					System.out.println(num1-num2);
					break;
				}
				case "DIV":
				{
					System.out.println(num1%num2);
					break;
				}
				case "MUL":
				{
					System.out.println(num1*num2);
					break; 
				}
	}

}
}
