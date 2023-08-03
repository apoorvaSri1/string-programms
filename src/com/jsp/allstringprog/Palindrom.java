package com.jsp.allstringprog;
// Palindrom program without reversing  
public class Palindrom {

	public static void main(String[] args) {
		String s="Malayalam";
		String s1=s.toLowerCase();
		//System.out.println(s1);
		boolean rest= isPalindrom(s1);
		if(rest==true) {
			System.out.println(s+" String is Palindrom");
		}
		else System.out.println(s+" String is Not Palindrom");
	}
	
	static boolean isPalindrom(String str) {
		char arr[]=str.toCharArray();
		int i=0, j=arr.length-1;
		while(i<j) {
			if(arr[i]!=arr[j]) return false;
			i++;
			j--;		
	}
		return true;
}
}