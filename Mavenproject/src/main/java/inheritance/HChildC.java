package inheritance;

public class HChildC extends HParentA{
	public void method3()
	{
		System.out.println("Child class C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HChildC obj1=new HChildC();
		obj1.method1();
		obj1.method3();

	}

}
