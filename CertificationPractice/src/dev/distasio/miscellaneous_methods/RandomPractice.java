package dev.distasio.miscellaneous_methods;

import java.util.Random;

public class RandomPractice {

	public static void main(String[] args) {

		Random r = new Random();
		
		Random r2 = new Random();
		
		Random r3 = new Random(42);

		System.out.println(r2.nextInt(100));
		
		System.out.println(r.nextDouble());
		
		System.out.println(r3.nextInt());
		
	}

}