package dev.distasio.practice_with_math_classes;

public class MathMethodsPractice {
	
	public static void main (String args[]) {
		        
        double random = (double)(Math.random() * 100);
        
        int roundedRandom = (int)Math.round(random);
        
        System.out.println(random);

        System.out.println(roundedRandom);
        
        
        double d = 4.5;
        
        int round = (int) Math.round(d);
        
        int ceil = (int) Math.ceil(d);

        int floor = (int) Math.floor(d);
        
        System.out.println(round);
        
        System.out.println(ceil);
        
        System.out.println(floor);

	}

}
