package com.codility3;

public class MinAvgTwoSlice {

	public int Solution(int A[]) {
		float min=999999,avg1=0,avg2=0,min_avg=0;
		int n=0;
		for(int i=0;i<A.length-2;i++) {
			avg1=(float)(A[i]+A[i+1])/2;
			avg2=(float)(A[i]+A[i+1]+A[i+2])/3;
			min_avg=Math.min(avg1, avg2);
			if(min_avg<min) {
				min=min_avg;
				n=i;
			}
		}
		avg1=(float)(A[A.length-2]+A[A.length-1])/2;
		if(avg1<min)
		    n=A.length-2;
		return n;
	}
	public static void main(String[] args) {
		MinAvgTwoSlice obj=new MinAvgTwoSlice();
		int A[]= {-3,-5,-8,-4,-10};
		int n=obj.Solution(A);
		System.out.println(n);
	}

}
