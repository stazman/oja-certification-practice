package dev.distasio.practice_with_string;

public class StringMethodPractice {

	public static void main(String[] args) {

		String s = "understated";//e
		
		String t = "understated";
		
		String a = "London, ";
		
		String b = "England";
		
		String[] arrOfStr = s.split("e", 2);
		
		String[] arrOfStr3 = s.split("e", 3); 		
		
		int i = 3;
		
		int i2 = 3;
		
		
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.compareTo("understated")); //0
		
		System.out.println(s.compareTo("overstated")); //6
		
		System.out.println(a.concat(b)); //London, England
		
		System.out.println(s.equals(t)); //true
		
		System.out.println(s.equals(a)); //false

		boolean ib;
		
		
		ib = i == i2;
		
		System.out.println(ib);
		
		System.out.println(s.indexOf('n')); // 1
		
		System.out.println(s.lastIndexOf('t')); // 8
		
		System.out.println(s.length()); // 1
		
		System.out.println(s.replace('e', 'E'));//undErstatEd
		
		for (String c : arrOfStr ) {
			System.out.println(c);
		}
		
		for (String d : arrOfStr3 ) {
			System.out.println(d);
		}
	}

}
