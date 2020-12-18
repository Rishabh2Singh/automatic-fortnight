package com.codility2;
public class MaxCounters {
	public int[] Solution(int N,int A[]) {
		int max=0;
		int min=0;
		int a[]=new int[N];
		for(int i=0;i<A.length;i++) {
			if(A[i]>=1 && A[i]<=N) {
				if(a[A[i]-1]<min)
					a[A[i]-1]=min;
				
				a[A[i]-1]++;
				if(a[A[i]-1]>max) 
					max=a[A[i]-1];
			}
			else if(A[i]==N+1) 
					min=max;
			}
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				a[i]=min;
		}
		return a;
	}
	public static void main(String[] args) {
		MaxCounters obj=new MaxCounters();
		int A[]= {3,4,4,6,1,4,4};
		int B[]=obj.Solution(5,A);
		for(int x:B)
			System.out.print(x+" ");
	}

}
