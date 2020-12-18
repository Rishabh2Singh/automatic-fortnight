package com.codility2;

import java.util.Arrays;

public class TapeEquilibrium {

	public int tapeEqui(int A[]) {
		int min=999999,diff=0,a=0,b=0,sum=0,i;
		for(int x:A)
			sum=sum+x;
//		c=b;
		System.out.println(b);
		int n=A.length;
		for(i=0;i<n;i++) {
			a=a+A[i-1];
			b=sum-a;
			diff=a-b;
			if(diff<0)
				diff=-diff;
			System.out.println("a:"+a+" b:"+b);
			min=Math.min(min, diff);
			System.out.println("diff:"+min);
			
		}
		return min;
	}
	public static void main(String[] args) {
		TapeEquilibrium obj=new TapeEquilibrium();
		int A[]= {1,4,5,6,7,8};
		int min=obj.tapeEqui(A);
		System.out.println(min);

	}

}
