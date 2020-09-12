package dev.distasio.method_overriding_and_overloading;

public class MethodOverridingAndOverloadingMisc {

	public static void main(String[] args) {
		
	}
	
	void perform_work(int time){ }
	
	int  perform_work(int time, int speed){ return time*speed ;} //These can both be here though they have the same name
	//because they have different arguments.
	
	//That they have different return types doesn't matter because the compiler doesn't look for different return types
	//because the method signatures are the same.
	
	
	
	//However, this makes an error, won't compile because there are the same number, type, and order of parameters: 
	
//	void perform_work(int time, int speed){ }
//	
//	int  perform_work(int time, int speed){ return time*speed ;}
	
	
	
	
	//This makes an error, won't compile because there are the same number, type, and order of parameters;
	//"time" and "speed" are just arbitrary
	
//	void perform_work2(int time){ }
//	
//	int  perform_work2(int speed){return speed ;}	
		
}
