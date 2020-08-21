package dev.distasio.using_printf_format_specifiers;

public class FormatSpecifiers {

	public static void main(String[] args) {


		System.out.printf("%s%s", "Hello, ", "John" + "\n"); //Hello, John
		
		System.out.printf("%s%s%n", "Hello, ", "John"); //Hello, John
		
		System.out.printf("%s %s", "Hello,", "John"); //Hello, John

	}

}
