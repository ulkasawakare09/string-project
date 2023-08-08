package com.assignment;

import java.util.Scanner;

public class FrequncyOfCharacter {
	public static void main(String args[])
	{
		String s1 = "India is my country";
		int i,len=s1.length(),count=0;
		char ch1,ch2;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter your char for its frequency");
		ch1=sc.next().charAt(0);
		
		for(i=0;i<len;i++) {
			ch2=s1.charAt(i);
			
			if(ch1==ch2)
			{
				count++;
			}
		}
		System.out.println(ch1+" = "+count);
	}

}
