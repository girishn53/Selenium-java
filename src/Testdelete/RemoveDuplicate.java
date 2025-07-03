package Testdelete;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String mainStr = null;
		System.out.println("Please enter the string");

		Scanner sc = new Scanner(System.in);

		mainStr = sc.nextLine();

		sc.close();
		
		removeDuplicateStr(mainStr);

	}
	
	public static void removeDuplicateStr(String Str) {
		
		Set<String> set = new LinkedHashSet<String>();
		String strarr []  =  Str.split("\\s+");
		StringBuffer bf = new StringBuffer();
		for(String s : strarr)
		{
			if(set.add(s)) {
				bf.append(s).append(" ");
				
				
				
			}
			
			
		}
		
		
		System.out.println("The string after removing duplicate is "+bf);
	}

}
