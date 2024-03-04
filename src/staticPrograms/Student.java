package staticPrograms;

//static variable gets the memory at class level

//It gets the memory at class loading
//It is shared with all the objects of the class

public class Student {
	static String college = "RIET"; // static variable is class variable

	int roll;
	String Name;

	public Student(int roll, String Name) {

		this.roll = roll;

		this.Name = Name;

	}

	public void display() {

		System.out.println(roll + " " + Name + " " + college);
	}

	public static void main(String[] args) {

		Student s1 = new Student(1, "Girish");

		Student s2 = new Student(2, "Ankita");
		s1.display();
		s2.display();

	}

}
