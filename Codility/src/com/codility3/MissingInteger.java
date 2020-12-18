package com.codility3;
import java.util.*;
import com.codility2.PermMissingElem;

public class MissingInteger {

	public int missingEle(int A[]) {
		if(A.length==0)
			return 1;
		
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<A.length;i++)
			set.add(A[i]);
		for(int i=0;i<A.length;i++) {
			if(set.contains(i)!=true)
				return i;
			
		}
		return A.length+1;
	}
	
	public static void main(String[] args) {
		MissingInteger obj=new MissingInteger();
		int A[]= {12};
		int n=obj.missingEle(A);
		System.out.println(n);

	}
}