package com.paniclater.polymorphism;
import java.util.*;

public class Casting {
	public static void main(String[] args) {
		Casting c = new Casting();
		//c.go(new A());
		B b = new B();
		Object m = b;
		//without a cast down the following invocation will fail -- only 
		//reference variables of type B or subtypes of B will be allowed by the compiler
		//even if the variable is not of type B but the object instance is.
		c.go((B)m);
		
	}
	void go(B b) {
		System.out.println("I worked");
	}
	static Object stop(ArrayList[] a) {
		System.out.println("I worked");
		return a;
	}
}
class A {}
class B extends A{}