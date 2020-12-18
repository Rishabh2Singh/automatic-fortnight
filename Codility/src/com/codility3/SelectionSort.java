package com.codility3;

public class SelectionSort {

	public int[] sorting(int A[]) {
		int temp;
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
				if(A[j]>A[i]) {
					temp=A[j];
					A[j]=A[i];
					A[i]=temp;
				}
			}
		}
		return A;
	}
	public static void main(String[] args) {
		SelectionSort obj=new SelectionSort();
		int A[]= {2,5,4,7,3,1,6,8};
		A=obj.sorting(A);
		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+" ");

	}

}
