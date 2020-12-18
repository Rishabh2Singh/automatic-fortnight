package com.codility1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		HashSet<String> obj=new HashSet<>();
		obj.add("mon");
		obj.add("tue");
		obj.add("wed");
		obj.add("thu");
		obj.add("fri");
		obj.add("sat");
		obj.add("sun");
		for(String x:obj) {
			System.out.println(x);
		}
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Mon");
		map.put(2,"Tue");
		map.put(3,"Wed");
		map.put(4, "Thu");
		map.put(5, "Fri");
		map.put(6, "Sat");
		map.put(7, "Sun");
		for(Map.Entry<Integer,String> x:map.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
	}
	
	

}
