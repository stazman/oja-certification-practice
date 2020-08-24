package dev.distasio.practice_with_string;

public class StringMethodPractice {

	public static void main(String[] args) {

		String s = "understated";//e
		
		String t = "understated";
		
		String u = "   understated   ";
		
		String a = "London, ";
		
		String b = "England";
		
		String[] arrOfStr = s.split("e", 2);
		
		String[] arrOfStr3 = s.split("e", 3); 		
		
		int i = 3;
		
		int i2 = 3;
		
		char[] s2 = s.toCharArray();
		
//		boolean b2 = true;
		
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
		
		System.out.println(a.replace("on", "ON"));//LONdON,
		
		
		for (String c : arrOfStr ) {
			System.out.println(c);
		}
		
		for (String d : arrOfStr3 ) {
			System.out.println(d);
		}
		
		System.out.println(s.startsWith("under"));
		
		System.out.println(s.subSequence(0, 5));
		
		System.out.println(s.substring(0, 5));
		
		System.out.println(s.toCharArray());
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
//		System.out.println(s.toUpperCase(s.replace('e', 'E'))); //Why doesn't this work???
		
		System.out.println(s.toString());
		
		System.out.println(u);
		
		System.out.println(u.trim());
		
		System.out.println(s.toCharArray());
		
		char[] cArr = s.toCharArray();
		
		for ( char c : cArr) {
			
			System.out.println(c);
			
		}
				
	}

}
