package dev.distasio.miscellaneous_methods;

public class Variables {

	public static void main(String[] args) {
		
		//This method has to be static because it is a static reference. That's because it's not being called
		//on an object instance but on the class object itself (Variables)

		Variables.testMeth();
		
		//Variables.testMeth() is the same as test.Meth(); it's implicit when a static method is called
		//within the same class
		
	}
	
	
	public static void testMeth() {
		
		int a;
		
		//local variables, those that are declared within a method, have to be initialized in their method
		//if the below line is commented out, there will be an error
		
		a = 3;
		
		System.out.println(a);
		
	}

}
