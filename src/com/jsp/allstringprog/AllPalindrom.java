package com.jsp.allstringprog;

public class AllPalindrom {

		public static void main(String[] args) {
			String s="malayalam";
			s=s.toLowerCase();
			for(int i=0;i<=s.length()-1;i++) {
				for(int j=i+1;j<s.length();j++) {
					if(isPalindrom(s,i,j)) {
						System.out.println(s.substring(i,j+1));
					}
					
				}
			}
	}

		
		static boolean isPalindrom(String s, int start, int end) {
			int i=start, j=end;
			if(s.charAt(i)!=s.charAt(j)) return false;
				i++;
				j--;
		   return true;
			
		}
}
