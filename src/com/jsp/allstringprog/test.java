package com.jsp.allstringprog;
//longest Palindromic String
public class test {
public static void main(String[] args) {
	String s="fgMalayalamyl";
	s=s.toLowerCase();
	String bigPalindrom="";
	for(int i=0;i<=s.length()-1;i++) {
		for(int j=i+1;j<s.length();j++) {
			if(isPalindrom(s,i,j)) {
				String temp=s.substring(i,j+1);
				if(temp.length()>bigPalindrom.length()) {
					bigPalindrom=temp;
				}
			}
		}
	}
	System.out.println("Biggest Palindrom in a string is : "+bigPalindrom);

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