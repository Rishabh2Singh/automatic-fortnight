package com.codility7;

public class NumberOfDiscInt {

	public int solution(int A[]) {
		int n=0,count=0;
		int lower[]=new int[A.length];
		int upper[]=new int[A.length];
		
		for(int i=0;i<A.length;i++) {
			lower[i]=i-A[i];
			upper[i]=i+A[i];
			
			if(upper[i]>lower[i])
				count++;
		}
		for(int x:upper)
			System.out.print(x);
		System.out.print("\n");
		for(int x:lower)
			System.out.print(x);
		System.out.print("\n");
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
				if(upper[i]>lower[i]) {
				System.out.println("upper-i:"+upper[i]+" upperr-j:"+upper[j]);
				System.out.println("lower-i:"+lower[i]+" lower-j:"+lower[j]);
				if(upper[i]<upper[j] && upper[i]>lower[j])
					n++;
				if(lower[i]<upper[j] && lower[i]>lower[j])
					n++;

				System.out.println("n:"+n);
				}
			}
		}
		n=n-count;
		return n;
	}
	public static void main(String[] args) {
		int A[]= {1,3,5,7};
		System.out.println(new NumberOfDiscInt().solution(A));
		

	}

}
