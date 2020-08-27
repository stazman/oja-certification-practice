package dev.distasio.equals_operator_vs_equals_method;

import dev.distasio.beans.Dog;

public class Equals extends Dog {

	public static void main(String[] args) {

	//comparing two primitives
		
		int p1 = 2; 
		
		int p2 = 2;
		
		Integer o1 = 2;
		
		Integer o2 = 2;
		
		System.out.println(p1 == p2); //true
		
		System.out.println(o1 == o2); //true ... a wrapper does not have a specific memory address like an instantiated object does
		
//		System.out.println(p1.equals(p2)); // Compiler error: Cannot invoke equals(int) on the primitive type int
		
		System.out.println(o1.equals(p1)); //true

		System.out.println(o1.equals(o2)); //true
		
	
	//comparing strings
		
		String s1 = "rigamarole";
		
		String s2 = "rigamarole";
		
		System.out.println(s1 == s2); //true
		
		System.out.println(s1.equals(s2)); //true 
		
		String s3 = new String();
		
		String s4 = new String();
		
		s3 = "Hambone";
		
		s4 = "Hambone";
		
		System.out.println(s3 == s4); // true because of the string pool
		
		System.out.println(s3.equals(s4)); // true because of equal values
		
		
		//comparing objects
		
		
		Dog d1 = new Dog();
		
		Dog d2 = new Dog();
		
		d1.name = "Jan";
		
		d2.name = "Jan";
		
		d1.age = 3;
		
		d2.age = 3;

		System.out.println(d1 == d2); // false (different memory addresses)	
		
		System.out.println(d1.name == d2.name); // true	

		System.out.println(d1.name.equals(d2.name)); // true
		
		System.out.println(d1.age == d2.age); // true
		
		System.out.println(d1.age.equals(d2.age)); // true

	}

}
