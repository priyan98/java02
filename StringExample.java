package com.java;

public class StringExample {
	public static void main(String[] args) {
		String s1 = "HELLO";           // SHARE SAME MEMORY LOCATION
		String s2 = "HELLO";
		boolean literal =(s1==s2);
		System.out.println(literal);
		s2 = "HELLO WORLD";             // change memory location
		System.out.println(s1==s2);
				
		String s3 = new String("HELLO");
		String s4 = new String("HELLO");   // IT ALWAYS KEEP AS SEPARATE COPY
		boolean literal1 = (s3== s4);
		System.out.println(literal1);
		
		char []ch = {'H','E','L','L','O'};
		String s5 = new String(ch);          // character of array covert single string
		System.out.println(s5);
		
		String s6 = "sangeeth prian";
		int length = s6.length();
	//	String s6concat = "s6 length is :".concat(length+"");    //string typecast
	//	String lenstring = String.valueOf(length);
	//	String lenstring = Integer.toString(length);
		String lenstring = length+"";
	    String s6concat = "s6 length is :".concat(lenstring);
		
	 	//	System.out.println(length);
	    	System.out.println(s6concat);
	    	
	    	
	    String s7 = "hello";
	    String s8 = "world";
	  //  String concatstring = s7.concat(" ").concat(s8);
	    String concatstring = s7+" "+s8;
	    System.out.println(concatstring);
	    
	    String s9 = "ddd";     
	    System.out.println("s9 is empty :" +s9.isEmpty());
	    
	    String s10 = s9.replace("ddd","eee");                 //replace
	    System.out.println("Replace data:"+s10);
	    
	    String s11 = s9.replaceFirst("d","eee");                
	    System.out.println("Replace data S11:"+s11);
	    
	    String s12 = "madurai";
	    String s13 = "madurai";
	    String s14 = "MADURAI";
	    System.out.println("Equals value:"+s13.equalsIgnoreCase(s14));
	    System.out.println("Equals value:"+s12.equals(s13));
		}
	
}
