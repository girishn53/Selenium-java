//Comparator is use to order 
//objects of user defined type stored in a list

//It provides multiple sorting sequences, i.e., you can sort the elements on the basis of any data member, for example, 
//rollno, name, age or anything else.

package comparatorUse;

public class Student {

	String name;

	int rollno;

	int age;

	Student(String name, int rollno, int age) {
		this.name = name;

		this.rollno = rollno;

		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
