package com.jsp.allstringprog;

public class CountVowels {

	public static void main(String[] args) {
		String s="Java Developer is a seveg";
		s=s.toLowerCase();
		int count =0;
	char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
				count ++;
				
			}
		
		
		}
		System.out.println("Vowels present in a string are : "+count);
	}// 10 vowels are present in s String

}
