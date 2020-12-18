package com.codility1;
import java.util.Scanner;
public class BinaryGap {
	public static void main(String[] args) {
		long n,x;
		int i=0;
		long[] a=new long[30];
		String[] rec=new String[10];
		Scanner sc=new Scanner(System.in);
		char ch='y';
		int count,check,max;
		long num;
		for(i=0;i<rec.length;i++)
			rec[i]="";
		while(ch=='y' || ch=='Y') {
			i=0;
			num=0;
			count=0;
			check=1;
			max=0;
			System.out.println("Enter any value:");
			num=sc.nextLong();
			n=num;
			while(n!=0) {
				a[i]=n%2;
				n=n/2;
				i=i+1;
			}
			for(int z=i-1;z>=0;z--){
				System.out.print(a[z]);
			}
			System.out.println("\n");
			for(int z=0;z<i;z++) {
				if(a[z]==1 && check==1)
					check=0;
				if(a[z]==0 && check==0) 
					count++;
				if(a[z]==1 && check==0) {
					if(max<count) {
						max=count;
					}
					count=0;
				}
			}
			rec[max]=rec[max]+num+" ";
			System.out.println("Max Binary gap is:"+max);
			System.out.println("Do you want to enter more(y/n):");
			ch=sc.next().charAt(0);
			for(int m=0;m<30;m++)
				a[m]=0;
				
		}
		
		System.out.println("Enter the max binary gap for which you want to search number:");
		n=sc.nextInt();
		System.out.println("Numbers:"+rec[(int) n]);
		}
}
