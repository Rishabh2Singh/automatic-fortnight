package com.lti.casestudy.bugfixing;

public class BugFixing4 {
	int solution(int[] A) {
		int n = A.length;    
		int i = n - 1;     
		int result = -1;
		int k = 0, maximal = 0;
		while (i >=0) {							//corrected
			if (A[i] == 1) {
				k = k + 1;
				if (k >= maximal) {
					maximal = k;
					result = i;
				}
			} else
				k = 0;
			i = i - 1;
		}
		if (A[i+1] == 1 && k + 1 > maximal) {   //corrected
			result = 0;
		}
			
		return result;
	}
	
	public static void main(String[] args) {
		int[] A = {0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
		int[] B= {1,1,1,0,0,1,1,1,0,0};
		System.out.println(new BugFixing4().solution(A));
		System.out.println(new BugFixing4().solution(B));
	}
}
