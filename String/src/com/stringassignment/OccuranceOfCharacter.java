/*11. Write a Java program to count occurrences of a character in given string.
*/
package com.stringassignment;

public class OccuranceOfCharacter {
	public static void main(String args[])
	{
		String s1="vedashree";
		
		int index = s1.indexOf('e');
		System.out.println("Frist occurance of 'e' in string is:"+index);
		
		System.out.println("--------------------------------------------------");
		
		int index1 = s1.indexOf('h',2);
		System.out.println("First occurance of 'h' in string is:"+index1 );
		
		System.out.println("--------------------------------------------------");
		int index2 = s1.lastIndexOf('e');
		System.out.println("Last occurance of 'e' in string is:" +index2);
		

	}

}
