package com.assignment;

public class ConcatMethod {
public static void main(String args[])
{
	String s1="welcome";  //scp - welcome

	s1.concat("to TQ"); //heap - welcome to TQ -unref(going for GC)\scp to TQ
	
	System.out.println(s1);
	
	s1=s1.concat(" to Pune");//heap-welcome to pune(ref by s1)\scp to Pune
	
	System.out.println(s1);//welcome to pune
}
}
