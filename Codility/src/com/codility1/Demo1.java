package com.codility1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int fact=1;
		for(int i=1;i<=5;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of 5:"+fact);
		
		/*i  i<=5  fact=fact*i
		 *1  1<=5  1*1=1
		 *2  2<=5  1*2=2
		 *3  3<=5  2*3=6
		 *4  4<=5  6*4=24
		 *5  5<=5  24*5=120
		 *6  6<=5----false
		 */

		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}System.out.print("\n");
		}
		/*(i<5) (j<i) value
		 *0    	0-----false
		 *1    	0     *
		 *1    	1-----false
		 *2    	0     *
		 *2    	1     * * 
		 *2    	2-----false
		 *3    	0     *
		 *3    	1     * * 
		 *3    	2     * * * 
		 *3    	3-----false
		 *4    	0     *
		 *4    	1     * *
		 *4    	2     * * * 
		 *4    	3     * * * *
		 *4    	4-----false
		 *5-----------false
		 */	
		
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}System.out.print("\n");
		}
		
		/*(i<5) (j<i) value
		 *0    	0-----false
		 *1    	0     1----------------1
		 *1    	1-----false
		 *2    	0     2
		 *2    	1     2 2 -------------2 2
		 *2    	2-----false
		 *3    	0     3
		 *3    	1     3 3 
		 *3    	2     3 3 3 ----------3 3 3
		 *3    	3-----false
		 *4    	0     4
		 *4    	1     4 4
		 *4    	2     4 4 4
		 *4    	3     4 4 4 4--------4 4 4 4 
		 *4    	4-----false
		 *5    	0     5
		 *5    	1     5 5
		 *5    	2     5 5 5
		 *5    	3     5 5 5 5
		 *5    	4	  5 5 5 5 5-------5 5 5 5 5
		 */	
		
		System.out.println("\n");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.print("\n");
		}
		System.out.print("\n");
		for(int i=5;i>0;i--) {
			for(int j=0;j<5-i;j++)
				System.out.print(" ");
			for(int j=0;j<(2*i-1);j++)
				System.out.print("*");
			System.out.print("\n");
		}
		int n,result=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0) {
			n=n/10;
			result++;
		}
		System.out.println("Number of digits are "+result);
	}
	

}
