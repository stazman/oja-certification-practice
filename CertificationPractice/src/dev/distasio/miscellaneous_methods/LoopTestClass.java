package dev.distasio.miscellaneous_methods;

public class LoopTestClass {
	
   public static void main(String args[]) {
      int i;
      int j;
      int k;
      int o;
      int p;
      int r = 5;
      int s = 5;
      int t = 5;
      int u = 5;

      for (i = 0, j = 0 ; j < 1 ; ++j , i++){
         System.out.println( i + " " + j );
      }
      
      System.out.println( i + " " + j );
      
      for( k = 0; k < 10; ++k) {
	   System.out.println(k);
   }
   
//   outer:
	   for ( int m = 0 ; m<3 ; m++ )
	   {
	      for ( int n = 0 ; n<2 ; n++ )
	      {
//	         if ( m == n )
//	         {
//	            continue outer;
//	         }
	         System.out.println( "m=" + m + " , n=" + n );
	      }
	   }
 
	   for(o = 0; o < 5; o++) {
		   for(p = 0; p < 5; p++) {
		   
		   System.out.println(o + p);
		   
		   }
	   }
	   
	   
	   //nested while loops -- the r value in the outer loop is decremented once is output once, then
	   //control goes to the inner while loopthe total of r and s values are added 
	   //the decrement operator in a for loop statement is fundamentally different than the decrement operator in
	   //a while loop, which is not passed as an argument as it is in a for loop, but it just a distinct expression.
	   //The inner loop is not completely iterated through once for every outer loop iteration such as in a for loop.
	   
	   System.out.println("While Practice");
	   
	   while(r>0) {
		   
		   r--;
		   
		   System.out.println(r);
		   
		  while(s>0) {
			  
			  s--;
			  
			  System.out.println(s);
			  
			  System.out.println(r + s);
		  }
	   }
	   
	   //the same loops, non-nested -- it just counts down from 4-0 twice because in the distinct while loop for u,
	   //t is always zero when it is added to u as it decrements

	   while(t>0) {
	   
		   t--;
	   
		   System.out.println(t);
	   
	   	}
	   
	   
	   while(u>0) {
		  
		  u--;
		  
		  System.out.println(t + u);
	   }
   }
}