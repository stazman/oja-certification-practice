package dev.distasio.using_printf_format_specifiers;

public class FormatSpecifiers {

	public static void main(String[] args) {


		System.out.printf("%s%s", "Hello, ", "John" + "\n"); //Hello, John
		
		System.out.printf("%s%s%n", "Hello, ", "John"); //Hello, John
		
		System.out.printf("%s %s%n", "Hello,", "John"); //Hello, John
		
		System.out.printf("%d%n", 3);
		
		System.out.printf("%s%s%d%d%d%s%d%d%d%s%d%d%d%d%s", "My phone number is ", "(", 5,5,5, ")", 5,5,5, "-", 1,2,3,4, ".");
		
	}

}
