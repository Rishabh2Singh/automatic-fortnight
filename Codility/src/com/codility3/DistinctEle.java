package com.codility3;

import java.util.Arrays;

public class DistinctEle {

	public int solution(int A[]) {
		int n=0,x=99999999;
		Arrays.sort(A);
		for(int i=0;i<A.length;i++) {
			if(A[i]!=x) {
				n=n+1;
				x=A[i];
			}
		}
		return n;
	}
	public static void main(String[] args) {
		DistinctEle obj=new DistinctEle();
		int A[]= {0,0,0,1,2,3,3,5,4};
		int n=obj.solution(A);
		System.out.println(n);
	}

}
