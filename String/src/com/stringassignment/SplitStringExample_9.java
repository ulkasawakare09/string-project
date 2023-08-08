/*9. WAP to split string into 2 tokens where string is “HELLO$WORLD”
*/
package com.stringassignment;

public class SplitStringExample_9 {
	        public static void main(String[] arg) {
	            String str = "HELLO$WORLD";
	            String split[] = str.split("\\$");
	            for (String s: split)
	                System.out.println(s);
	        }
	    }