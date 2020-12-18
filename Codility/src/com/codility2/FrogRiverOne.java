package com.codility2;

public class FrogRiverOne {

	public int Solution(int A[],int X) {
		int count=0,temp;
		int a[]=new int[X];
		for(int i=0;i<A.length;i++) {
			temp=A[i];;
			if(a[temp-1]==0) {
				a[temp-1]=1;
				count++;
				}
			if(count==X)
				return i;
			}

		return -1;
	}
	public static void main(String[] args) {
		FrogRiverOne obj=new FrogRiverOne();
		int A[]= {1,3,1,4,2,3,5,4};
		int n=obj.Solution(A,5);
		System.out.println(n);
	}

}
