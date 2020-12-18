package com.codility4;

import java.util.Stack;

public class Nesting {

	public int solution(String S) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='(')
				stack.push(S.charAt(i));
			else if(S.charAt(i)==')' && !stack.isEmpty())
				stack.pop();
			else 
				return 0;
		}
		return stack.isEmpty()?1:0;
	}
	public static void main(String[] args) {
		Nesting obj=new Nesting();
		String S="";
		System.out.print(obj.solution(S));
	}

}
