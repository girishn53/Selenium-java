package stringPractice;

import java.util.Scanner;

public class ReverseWordsInStringAtSamePos {

	public static void main(String[] args) {
		
		System.out.println("Please enter the string");
		
		Scanner sc=new Scanner(System.in);
		
		String orgStrng=sc.nextLine();
		
		sc.close();
		reverseWord(orgStrng);
	}

	
	
	public static void reverseWord(String orgStrng)
	{
		String arr[]=orgStrng.split("\\s+");
		String convStrng="";
		
		for(String word:arr)
		{
			
			char ch[]=word.toCharArray();
			
			for(int i=ch.length-1;i>=0;i--)
			{
			
				convStrng=convStrng+Character.toString(ch[i]);
				
			}
			convStrng=convStrng+" ";
			
		}
		
		
		System.out.println("reversed string is "+convStrng);
		
		
		
		
	}
	
}
