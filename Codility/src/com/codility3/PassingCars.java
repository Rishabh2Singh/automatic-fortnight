package com.codility3;

public class PassingCars {

	public int Solution(int A[]) {
		int n=0,sum=0,east_car=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]==0)
				east_car++;
			else {
				sum=sum+A[i]*east_car;
				if(sum>1000000000)
					return -1;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		PassingCars obj=new PassingCars();
		int A[]= {1,0,0,1,0,1,0,1,1};
		int n=obj.Solution(A);
		System.out.println(n);
	}

}
