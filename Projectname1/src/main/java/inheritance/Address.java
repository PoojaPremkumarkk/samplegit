package inheritance;

public class Address {
	String add;
	Student s;
	public Address(String add,Student s)
	{
		this.add=add;
		this.s=s;
	}
	void display()
	{
		System.out.println("Address of a student="+add);
		System.out.println("Student name="+s.name);
		System.out.println("roll number of student="+s.rnumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1=new Student("pooja",1);
		Address obj2=new Address("puthenpurackal",obj1);
		obj2.display();
				

	}

}
