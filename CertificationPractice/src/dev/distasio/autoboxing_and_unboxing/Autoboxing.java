package dev.distasio.autoboxing_and_unboxing;

public class Autoboxing {

	public static void main(String[] args) {

		Integer wrappedInt = 3;
		
		System.out.println(returnInt(wrappedInt));
		
	}
	
	public static Integer returnInt(int a){

		return a + 3;

	}

}
