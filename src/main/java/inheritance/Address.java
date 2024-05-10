package inheritance;

public class Address {
	String ad;
	Student s;
	public Address(String ad,Student s)
	{
		this.ad=ad;
		this.s=s;
	}
public void display()
{
	System.out.println(ad+" "+s.name+" "+s.rnumber);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj1=new Student(2,4);
Address obj2=new Address("puthen",obj1);
obj2.display();
	}

}
