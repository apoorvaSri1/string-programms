package com.jsp.allstringprog;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {8,3,6,17,2,9,15,12,10};
      Sort(a);
      for(int n:a) {
    	  System.out.print(n+" ");
      }
	}
	static void Sort(int a[]) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
