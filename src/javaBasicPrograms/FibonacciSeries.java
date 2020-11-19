package javaBasicPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		int first=0;
		
		int second=1;
		
		System.out.print(first+" "+second);
		
		int n3,i,count=10;
		
		for(i=2;i<count;i++)
		{
			n3=first + second;
			
			System.out.print(" "+n3);
			
			first=second;
			second=n3;
			
		}
	}

}
