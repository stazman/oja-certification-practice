package dev.distasio.using_printf_format_specifiers;

public class FormatSpecifiers {

	public static void main(String[] args) {


		System.out.printf("%s%s", "Hello, ", "John" + "\n"); //Hello, John
		
		System.out.printf("%s%s%n", "Hello, ", "John"); //Hello, John
		
		System.out.printf("%s %s%n", "Hello,", "John"); //Hello, John
		
		System.out.printf("%d%n", 3);
		
		System.out.printf("%s%s%d%d%d%s%d%d%d%s%d%d%d%d%s%n", "My phone number is ", "(", 5,5,5, ")", 5,5,5, "-", 1,2,3,4, ".");
		
		// integer-type 
        System.out.println(10 == 20); 
  
        // char-type 
        System.out.println('a' == 'b'); 
  
        // char and double type 
        System.out.println('a' == 97); 
  
        // boolean type 
        System.out.println(true == true); 
		
	}

}
