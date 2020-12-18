package com.lti.casestudy.bugfixing;

public class HappyString {

	public String solution(int a, int b, int c) {
		StringBuilder builder=new StringBuilder();
		int total=a+b+c;
		int currA=0,currB=0,currC=0;
		for(int i=0;i<total;i++) {
			if((a>=b && a>=c && currA!=2)||(a>0 && (currB>=2 || currC>=2))){
				builder.append("a");
				currA++;
				currB=0;
				currC=0;
				a--;
			}
			
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
