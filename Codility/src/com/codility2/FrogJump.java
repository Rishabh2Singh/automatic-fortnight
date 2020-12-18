package com.codility2;

public class FrogJump {

	public int jump(int x,int y,int d) {
		double diff;
		double n=0;
		diff=y-x;
		n= Math.ceil(diff/d);
		return (int) n;
	}
	public static void main(String[] args) {
		FrogJump obj=new FrogJump();
		int x=obj.jump(20, 70019, 20);
		System.out.println(x);
	}

}
