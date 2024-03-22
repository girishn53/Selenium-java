package stringPractice;

public class StringSplit {

	public static void main(String[] args) {
		
		String s="Hi my name is Girish";
		
		 String t[] = s.split("\\s+");//split on basis of spaces
		 //or
		 
		 // String t[] = s.split(" ");
		 
		 
		 
		 
		 for(String k:t)
		 {
			 System.out.println(k);
		 }
		 
		
		
		
		

	}

}
