package dev.distasio.miscellaneous_methods;

public class CommandLinePractice {

	public static void main(String[] args) {

		// Command Line: java CommandLinePractice.java dogs cats birds
		
        int i = args.length;
        
//        while (i > 0) {
//        	i--;
//        	System.out.println(i);
//        }
        
        while (i > 0) {
        	i--;
        	System.out.println(args[i]);
      
        }
        
	}

}
