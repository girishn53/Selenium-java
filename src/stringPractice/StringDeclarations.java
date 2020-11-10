package stringPractice;

public class StringDeclarations {

	public static void main(String[] args) {
		
		//Character array
		char ch[]={'H','e','l','l','o'};
		
		String s=new String(ch);
		
		System.out.println(s);
		//----------------------------------------
		
		
		//By declaring as string literal, it will create in string constant pool
		//If String is present in SCP then a reference will be returned
		String s1="Girish";
		
		System.out.println(s1);
		
		//By using new keyword in this case a new object will be created in heap
		
		String s2=new String("Welcome");
		
		System.out.println(s2);
		
		

	}

}
