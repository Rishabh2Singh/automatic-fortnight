package com.codility3;

import java.util.Arrays;

public class Triangle {

	public int solution(int A[]) {
		
		Arrays.sort(A);
		for(int i=0;i<A.length-2;i++) {
			if(A[i]>A[i+2]-A[i+1])
				return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Triangle obj=new Triangle();
		int A[]= {1,2,4,5,8,6,3};
		System.out.println(obj.solution(A));

	}

}
