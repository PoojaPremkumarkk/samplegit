package inheritance;

public class HChildB extends HParentA{
	public void method2()
	{
		System.out.println("Child B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HChildB obj=new HChildB();
		obj.method1();
		obj.method2();

	}

}
