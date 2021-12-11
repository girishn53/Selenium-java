package test;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
	
		Student s1= new Student(1, "Anjul", 30);
		
		Student s2= new Student(2, "Bharat", 31);
		Student s3= new Student(3, "Girish", 31);
		
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator<Student> itr=al.iterator();
		
		while(itr.hasNext()) {
			
			Student st=(Student)itr.next();
			System.out.println(st.roll+" "+st.name+" "+st.age);
			
			
			}
		
			

		
		

	}

}
