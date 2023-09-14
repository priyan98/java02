package com.java;

public class OnlyReverseString {
	
	 static String reverse(String inputString) { 
		    String[] words = inputString.split(" ");
		    boolean set = false; 
		    String reverseString = "";

		    for (int i = 0; i < words.length; i++) 
		    {
		        String word = words[i];

		        String reverseWord = "";

		        for (int j = word.length()-1; j >= 0; j--) 
		        {  
		            if (Character.isAlphabetic(word.charAt(j))){
		                
		            reverseWord = reverseWord + word.charAt(j);
		            set = false; 
		        }else{
		            set = true ; 
		            break ; 
		        }
		        }
		        if(set == true){
		            reverseString = reverseString + reverseWord + word +  " "; 
		        }
		        
		        reverseString = reverseString + reverseWord +  " ";
		      
		    }
		    return reverseString;
		}

		public static void main(String[] args)
		{
		    String st1 = "alpha123beta123";
		    System.out.println(OnlyReverseString.reverse(st1));  

		   	}
		}  
		


