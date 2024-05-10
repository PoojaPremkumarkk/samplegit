package inheritance;

public class Aggregation2 {
	Agrregation1 agg;
int a;
	public Aggregation2(int a,Agrregation1 agg)
	{
		this.agg=agg;
		this.a=a;
		
	}
	public void display()
	{
		System.out.println(a +" "+agg.n+" "+agg.x);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agrregation1 obj=new Agrregation1(1,"pooja");
		Aggregation2 obj2=new Aggregation2(2,obj);//parent class object
obj2.display();
	}

}
