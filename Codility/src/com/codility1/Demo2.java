package com.codility1;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args){
		int n,result=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0) {
			n=n/10;
			result++;
		}
		System.out.println("Number of digits are "+result);
		sc.close();
	}
}
