package com.assignment;

public class PrintIndexNumberForAllChar {
	public static void printIndexForChar(String s)
	{
		int i,len=s.length();
		char ch;
		for(i=0;i<len;i++) {
			ch=s.charAt(i);
			System.out.println(ch+" = "+s.indexOf(ch,i));
		}
	}

public static void main(String args[])
{
	String s="hello";
	printIndexForChar(s);
}
}
