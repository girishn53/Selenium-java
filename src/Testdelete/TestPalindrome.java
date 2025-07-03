package Testdelete;

public class TestPalindrome {

	public static void main(String[] args) {

		String s = "nitin";
		char[] str = s.toCharArray();

		String finalStr = "";
		for (int i = (str.length) - 1; i >= 0; i--) {
			finalStr = finalStr + str[i];

		}

		System.out.println(finalStr);

		if(s.equalsIgnoreCase(finalStr))
		{
			System.out.println("Palindrome");
		}
	}
	
	
	

}
