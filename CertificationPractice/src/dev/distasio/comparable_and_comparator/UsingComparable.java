package dev.distasio.comparable_and_comparator;

import java.util.TreeSet;

import dev.distasio.beans.Dog;

public class UsingComparable {

	public static void main(String[] args) {
		
		TreeSet<Dog> dogTree = new TreeSet<>();
		
		dogTree.add(new Dog(1, "Sam", 3));
		dogTree.add(new Dog(2, "Bob", 5));
		dogTree.add(new Dog(3, "Jan", 1));
		dogTree.add(new Dog(4, "Joe", 4));

		for (Dog dg : dogTree) {
			
			System.out.println(dg);
			
		}
		
		
		Dog d1 = new Dog();
		
		Dog d2 = new Dog();
		
		d1.name = "Sam";
		
		d2.name = "Sam2";
		
	}

}
