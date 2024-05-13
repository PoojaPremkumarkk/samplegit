package inheritance;

public class Addchild extends Addparent{
	static int d;
	public boolean div()
	{
		
		d=super.add(29, 76);
		return d%10==0;
	
		
	}
	public void method2()
	{
		if(d%10==0)
		{
			System.out.println(" the number is divisible by 10");
		}
		else
		{
			System.out.println("the number is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		Addchild obj=new Addchild();
		obj.div();
		obj.method2();
		System.out.println("The result of addition = " +d);
		

	}

}
