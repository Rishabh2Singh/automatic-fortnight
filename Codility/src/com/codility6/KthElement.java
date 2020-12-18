package com.codility6;

import java.util.*;

public class KthElement {

	public int solution(int A[], int K) {
		Arrays.sort(A);
		return A[A.length-K];
	
	}
	public static void main(String[] args) {
		int A[]= {3,2,1,5,6,4};
		System.out.println(new KthElement().solution(A,2));
		int B[]= {3,2,3,1,2,4,5,5,6};
		System.out.println(new KthElement().solution(B,4));
		int C[]= {2};
		System.out.println(new KthElement().solution(C,1));
		}
	}


