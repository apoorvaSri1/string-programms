package com.jsp.allstringprog;

public class QuickSortArray {
// Quick Sort
	public static void main(String[] args) {
		int a[]= {1,55,8,11,7,34,6,51,2,41,9}; // 1 2 6 7 8 9 11 34 41 51 55 
		Sort(a,0,a.length-1);
		for(int n: a) {
			System.out.print(n+" ");
		}
	}
     static void Sort(int a[],int start, int end) {
    	 if(start>=end) return;
    	 int pivot =a[(start+end)/2];
    	 int i=start, j=end;
    	 while(i<=j) {
    		 while(a[i]<pivot) i++;
    		 while(a[j]>pivot) j--;
    		 if(i<=j) {
    			 int temp=a[i];
    			 a[i]=a[j];
    			 a[j]=temp;
    			 i++;
    			 j--;
    		 }
    	 }
    	 Sort(a,start,j);
    	 Sort(a,i,end);
    		 
     }
}
