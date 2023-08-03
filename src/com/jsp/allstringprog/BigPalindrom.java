package com.jsp.allstringprog;

public class BigPalindrom {

	public static void main(String[] args) {
		String s="Malayalaman";
		s=s.toLowerCase();
		String bigPall="";
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				
				if(isPalindrom(s,i,j)) {
					String temp= s.substring(i,j+1);
					if(temp.length()>bigPall.length()) {
						bigPall=temp;
					}
				}
			}
		}
		System.out.println(bigPall);
				
	}
	static boolean isPalindrom(String s, int start, int end) {
		int i=start, j=end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
			
		}
		return true;
	}

}
