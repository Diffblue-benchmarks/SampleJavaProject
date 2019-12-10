package com.thomasPerkins;

public class MainClass {
	public static void main(String[] args){
		System.out.println(addOne(1));
		System.out.println(addTwo(1));
		System.out.println(doubleMe(1));
		System.out.println(addS("run"));
		System.out.println(doStuff(45));
	}

	public static int addOne(int n) {
		return n + 1;
	}

	public static String addS(String s) {
		return s + "s";
	}

	public static int addTwo(int n) {
		return addOne(addOne(n));
	}

	public static int doubleMe(int n) {
		return n * 2;
	}

	public static int doStuff(int n) {
		return doubleMe(addTwo(addOne(doubleMe(n))));
	}
}
