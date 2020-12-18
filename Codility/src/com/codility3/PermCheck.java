package com.codility3;

import java.util.*;

public class PermCheck {

	public int Solution(int A[]) {
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<A.length;i++)
			set.add(A[i]);
		for(int i=1;i<=A.length;i++) {
			if(!(set.contains(i)))
				return 0;
		}
		return 1;
			
	}
	public static void main(String[] args) {
		PermCheck obj=new PermCheck();
		int A[]= {2};
		int i=obj.Solution(A);
		System.out.println(i);
	}

}
