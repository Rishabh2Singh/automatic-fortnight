package com.codility6;

public class NumberOfSteps {

	public int solution(String s) {
		int n=Integer.parseInt(s,2);
        int count=0;
        while(n!=1){
            if(n%2==0){
                n=n/2;
                count++;
            }else{
                n++;
                count++;
            }
        }
        return count;
	}
	public static void main(String[] args) {
		System.out.println(new NumberOfSteps().solution("1101001"));
		System.out.println(new NumberOfSteps().solution("1"));
		System.out.println(new NumberOfSteps().solution("101"));
	}

}
