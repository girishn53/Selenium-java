package test;

import java.util.HashMap;
import java.util.Map;

public class BookTest {

public static void main(String[] args) {
		
HashMap<Integer, Book> hm =new  HashMap<Integer, Book>();
	
Book b1=new Book(101, "C++", "Balaguru");

Book b2=new Book(102, "Java", "Herbert");


hm.put(1, b1);
hm.put(2, b2);

for (Map.Entry <Integer,Book>e: hm.entrySet())
{
    
	int key = e.getKey();
	
	Book b =e.getValue();
	
	
	System.out.println(key+" "+b.id+" "+b.title+" "+b.author);
	
	}
	}

}
