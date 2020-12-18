package com.lti.casestudy.bugfixing;

import java.util.Arrays;  //line added

public class BugFixing3 {
	public boolean solution(int[] A, int K) {
		int n = A.length;
//		Arrays.sort(A); //line added
		for (int i = 0; i < n - 1; i++) {
			if (A[i]<K && A[i] + 1 < A[i + 1])
				return false;
		}
		if (A[0] != 1 && A[n - 1] != K)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		int[] A = {1,1,2,2,3};
		int K = 5;
		System.out.println(new BugFixing3().solution(A, K));
	}
}
