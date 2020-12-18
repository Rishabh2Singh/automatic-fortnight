package com.codility1;

public class CyclicRotation {

	public static void main(String[] args) {
		int[] a= {4,8,2,5,9,6,3,1};
		int k=3,temp1,temp2;
		int n=a.length;
		for(int j=0;j<k;j++) {
		temp1=a[0];
		for(int i=1;i<n;i++) {
			temp2=a[i];
			a[i]=temp1;
//			System.out.println(a[i]);
			temp1=temp2;
		}
		a[0]=temp1;
	}

		for(int num:a) {
			System.out.print(num+" ");
		}
	}
}
