package com.codility7;

public class ZeroSum {

	public int solution(int A[]) {
		int sum=0;
		for(int i=0;i<A.length;i++) {
			for(int j=i;j<A.length;j++) {
				sum=sum+A[j];
				if(sum==0||A[j]==0)
					return 1;
			}
			sum=0;
		}
		return 0;
	}
	public static void main(String[] args) {
		int A[]= {4,2,-3,1,6};
		int b[]= {4,2,0,1,6};
		int c[]= {1,4,-2,-2,5,-4,3};
		System.out.println(new ZeroSum().solution(A));
		System.out.println(new ZeroSum().solution(b));
		System.out.println(new ZeroSum().solution(c));

	}

}
