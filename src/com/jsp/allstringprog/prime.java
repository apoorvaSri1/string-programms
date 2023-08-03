package com.jsp.allstringprog;

import java.util.Scanner;

public class prime {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=sc.nextInt(); int count=0;
	for( int i=1; i<=n;i++) {
		if(isPrime(i)) {
			System.out.println(i);
		}
	}
}
	static boolean isPrime(int n) {
	if (n<=1) return false;
    for(int i=2;i<=n/2;i++) {
    	if(n%i==0) return false;
    	
    }
    return true;
		
	}
}
// jai shree ram
// 5 bair ,11 ghee ke deepak ,
//5 jaau(wheat), 5 safed phul,
//5 kamalgate, 5 kalimirch