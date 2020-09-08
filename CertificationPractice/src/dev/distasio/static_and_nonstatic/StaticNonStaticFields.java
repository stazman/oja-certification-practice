package dev.distasio.static_and_nonstatic;

public class StaticNonStaticFields {

	int nonStaticInt;
	static int staticInt1;
	static int staticInt2;

	public void method1(){
			
	    StaticNonStaticFields.staticInt1 = nonStaticInt; 
	    
	    this.nonStaticInt = staticInt1;
	    
	    StaticNonStaticFields.staticInt1 = staticInt2;
	    
	    StaticNonStaticFields.staticInt2 = staticInt1;
	}
}