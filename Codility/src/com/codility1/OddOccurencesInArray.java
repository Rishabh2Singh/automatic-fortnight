package com.codility1;

import java.util.Arrays;

public class OddOccurencesInArray {

	public static void main(String[] args) {
		int[] a={7,8,7,6,1,5,8,6,5,1,8,5,8};

		Arrays.sort(a);
//		for(int x:a)
//			System.out.println(x);
		for(int i=0;i<a.length-1;i=i+2) {
			if(a[i]!=a[i+1]) {
				System.out.println(a[i]);
				System.exit(0);
			}
		}
			System.out.println(a[a.length-1]);
	}
}
