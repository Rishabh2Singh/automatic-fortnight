package com.codility4;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Brackets {

	 public int solution(String S) {
	       List<Character> open=Arrays.asList('{','(','[');
	       List<Character> close=Arrays.asList('}',')',']');
	       
	       Stack<Character> stack=new Stack<Character>();
	       for(int i=0;i<S.length();i++) {
	    	   if(open.contains(S.charAt(i))) {
	    		   stack.push(S.charAt(i));
	    	   }
	    	   else if(close.contains(S.charAt(i)) && !stack.isEmpty()) {
	    		   Character top=stack.peek();
	    		   if(open.indexOf(top)==close.indexOf(S.charAt(i)))
	    			   stack.pop();
	    		   else
	    			   return 0;
	    	   }
	    	   else
	    		   return 0;
	       }
	       return stack.isEmpty() ? 1:0;
	    }
	public static void main(String[] args) {
		Brackets obj=new Brackets();
		String S="{([]){}{}}";
		System.out.println(obj.solution(S));

	}

}
