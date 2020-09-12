package dev.distasio.miscellaneous_methods;

public class LoopsWithAndWithoutLabels {

	public static void main(String[] args) {
			
		int counter = 0;
		
		int counter2 = 0; 


		for (int i = 0; i <= 10; i++) { 
			
			//1 2 3 4 5 

			for (int j = 0; j <= 10; j++) { 
				
				//1 2 3 4 5

				if (i == 5) break; 
				
				// breaks with five for each ... control goes back to beginning of loop
				// i increases to 6, incrementing the counter one more time, but j fails because it is the inner loop and it's finished 
				// because of the condition

			} 

			counter++; 

		} 

		System.out.println(counter); 
	
	
	/// Output: 11
		

	start: for (int i = 0; i <= 10; i++) { 

		for (int j = 0; j <= 10; j++) { 

			if (i == 5) break start; 

		} 

		counter2++; 

	} 

	System.out.println(counter2); 

	/// Output: 5

	
	}
}


		
