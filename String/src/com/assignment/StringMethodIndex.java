package com.assignment;

public class StringMethodIndex {
	public static void main(String args[])
	{
		String s1="i love india";
		
		String s2="siri is indian beacause her father is indian";
		//case1
		int index1=s1.indexOf('i');
		
		//index1=s1.indexOf(97);
		index1=s1.indexOf('j');// if any char is not present return -1
		System.out.println("index of char is"+index1);//giving index for 1st occurance
		
		//case 2
		//int index2=s1.indexOf('i',5);
		int index2=s1.indexOf(105,5);//indexOF('i',5)
		System.out.println("i="+index2);
		
		int index3=s1.lastIndexOf('i');
		System.out.println("i="+index3);
		
		int index4=s1.lastIndexOf('i',9);
		System.out.println("i="+index4);
		
		int index5=s2.indexOf("indian");//indexOF('i',5)
		System.out.println("indian="+index5);
		
		int index6=s2.lastIndexOf("indian",9);//indexOF('i',5)
		System.out.println("indian="+index6);
		

		
	}

}
