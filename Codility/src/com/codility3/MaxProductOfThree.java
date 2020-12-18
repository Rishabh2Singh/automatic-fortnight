package com.codility3;

import java.util.Arrays;

public class MaxProductOfThree {

	public int solution(int A[]) {
		int product=1,prod2;
		Arrays.sort(A);
		product=A[A.length-1]*A[A.length-2]*A[A.length-3];
		prod2=A[0]*A[1]*A[A.length-1];
		product=Math.max(product, prod2);
		return product;
	}
	public static void main(String[] args) {
		MaxProductOfThree obj=new MaxProductOfThree();
		int[] A= {-3,1,2,-2,5,6};
		int pro=obj.solution(A);
		System.out.println(pro);

	}

}
