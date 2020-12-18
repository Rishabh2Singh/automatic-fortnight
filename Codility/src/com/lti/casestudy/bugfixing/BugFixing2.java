package com.lti.casestudy.bugfixing;

import java.util.Arrays;

public class BugFixing2 {
	int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n;k++) {		//corrected
            if (A[k] == B[i])
                return A[k];
            while (i < m-1  && B[i] < A[k])  //corrected
                i += 1;
//            else 			//line added
//            	k++;		//line added
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int[] A = {2, 4, 6, 7};
		int[] B = {1, 1, 1,4};
		System.out.println(new BugFixing2().solution(A, B));
	}
}
