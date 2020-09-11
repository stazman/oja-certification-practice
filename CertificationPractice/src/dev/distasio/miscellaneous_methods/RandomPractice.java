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
		
		        
        java.util.Random t = new java.util.Random(100);

        double d = t.nextDouble();
        
        System.out.println(d);
        
        
        java.util.Random s = new java.util.Random(100);
        
        double e = s.nextDouble();
        
        System.out.println(e);
          
        
        Random r4 = new Random();
        
        r4.setSeed(12);
        
        double f = r4.nextDouble();
        
        System.out.println(f);
        
        
        Random r5 = new Random(12);
        
        r5.setSeed(12);
        
        double g = r4.nextDouble();
        
        System.out.println(g);
        
        
        Random r6 = new Random();
        
        int i6 = r6.nextInt(10);
        
        System.out.println(i6);
        
        //Between 1 and 10 different each time
        
        
        Random r7 = new Random(10);
        
        int i7 = r7.nextInt();
        
        System.out.println(i7);
        
        //Between 1 and 10 same each time

        
        Random r8 = new Random(10);
        
//        r8.setSeed(10); [does the same as passing 10 to new Random()]
    
        
        int i8 = (int) r8.nextInt() * 10;
        
        System.out.println(i8);
        
        
        int i9 = 10;
        
        System.out.println(Math.round(Math.random()*i9));
        
	}

}
