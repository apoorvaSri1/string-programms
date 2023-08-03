package com.jsp.allstringprog;

public class BubbleSortArray {
// Bubble Sort
	public static void main(String[] args) {
		
		int arr[]= {8,6,2,4,1,5,3,7,9,10}; // 1 2 3 4 5 6 7 8 9 10 
		Sort(arr);
		for(int n: arr){
			System.out.print(n+" ");
		}
	}
		static void Sort(int a[]) {
			for(int i=0;i<a.length-1;i++) {
				for(int j=0;j<a.length-1-i;j++) {
					if(a[j]>a[j+1]) {
						int temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
					}
				}
			}
		}
	}