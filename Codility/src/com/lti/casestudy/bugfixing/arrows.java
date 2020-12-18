package com.lti.casestudy.bugfixing;
import java.util.*;
public class arrows {
	public int solution(String S) {
	     int up=0,down=0,left=0,right=0;
	     int a[]=new int[4];
	     for(int i=0;i<S.length();i++){
	         switch(S.charAt(i)){
	             case '^':up++; break;
	             case '>':right++; break;
	             case '<':left++;break;
	             default: down++;
	         }
	     }
	     a[0]=up;
	     a[1]=down;
	     a[2]=left;
	     a[3]=right;
	     int max=0,index=0;
	     for(int i=0;i<4;i++){
	    	 System.out.print(a[i]);
	         if(max<a[i]) {
	        	 max=a[i];
	        	 System.out.print(max);
	        	 index=i;
	         }
	     }
	     
	     System.out.print(index);
	     int count=0;
	     for(int i=0;i<4;i++){
	         if(i!=index)
	             count=count+a[i];
	     }
	     return count;
	 }
	public static void main(String[] args) {
		System.out.println(new arrows().solution("^vv<v"));

	}

}