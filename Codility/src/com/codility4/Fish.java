package com.codility4;

import java.util.Stack;

public class Fish {

	public int solution(int A[], int B[]) {
		Stack<Integer> stack=new Stack<>();
		int alive=B.length;
		for(int i=0;i<B.length;i++) {
			if(B[i]==1) {
				stack.push(A[i]);
			}
			else if(B[i]==0) {
				while(!stack.isEmpty()) {
					if(stack.peek()>A[i]) {
						alive--;
						break;
					}
					else if(stack.peek()<A[i]) {
						alive--;
						stack.pop();
					}
				}
			}
		}
		return alive;
	}
	public static void main(String[] args) {
		Fish obj=new Fish();
		int A[]= {5,4,3,2,1};
		int B[]= {1,0,0,0,1};
		System.out.print(obj.solution(A, B));
	}

}
