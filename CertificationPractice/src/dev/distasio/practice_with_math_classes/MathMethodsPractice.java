package dev.distasio.practice_with_math_classes;

public class MathMethodsPractice {
	
	public static void main (String args[]) {
		
        // Random random = new Random();
        
        double random = (double)(Math.random() * 100);
        
        int roundedRandom = (int)Math.round(random);
        
        System.out.println(random);

        System.out.println(roundedRandom);

	}

}
