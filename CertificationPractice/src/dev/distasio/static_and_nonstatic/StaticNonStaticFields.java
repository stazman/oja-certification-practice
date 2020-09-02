package dev.distasio.static_and_nonstatic;

public class StaticNonStaticFields {

	int i1;
	static int i2;

	public void method1(){
	
		int i;
		
	    this.i2 = i1; // The static field StaticNonStaticFields.i2 should be accessed in a static way
	    
	    this.i1 = i2; // but i1 can legitimately be accessed in a static way because
	    
	    // assigning a static field's value to a non-static field is acceptable but
	    // assigning a non-static field's value to a static field is not best practice
	    
	}
		
}
	

