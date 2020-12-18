package com.codility3;

public class CountDiv {

	public int countNum(int A,int B,int K) {
		int diff=0;
		for(int i=A;i<=B;i++) {
			if(i%K==0) {
				diff=B-i;
				if(diff==1)
				    return 1;
				diff=diff/K;
	    		return diff+1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		CountDiv obj=new CountDiv();
		int n=obj.countNum(11,14,2);
		System.out.println(n);

	}

}
