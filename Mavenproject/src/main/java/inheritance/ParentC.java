package inheritance;

public class ParentC extends ParentB{
	public void method3()
	{
		System.out.println("method3");
	}

	public static void main(String[] args) {
		ParentC obj1=new ParentC();
		obj1.method1();
		obj1.method2();
		obj1.method3();
		

	}

}
