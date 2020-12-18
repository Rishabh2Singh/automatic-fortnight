package com.codility2;

import java.util.Arrays;

public class PermMissingElem {

	public int missingEle(int A[]) {
		int i,n=0;
		Arrays.sort(A);
//		for(int x:A)
//			System.out.println(x);
		for(i=0;i<A.length;i++) {
			if(A[i]!=i+1)
				return i+1;
		}
		if(i==A.length)
			return i+1;
		else
			return 1;
	}
	public static void main(String[] args) {
		PermMissingElem obj=new PermMissingElem();
		int A[]= {0,2,3};
		int n=obj.missingEle(A);
		System.out.println(n);

	}

}
