package inheritance;

public class SecondchildB extends FirstchildA
{
double hra;
double pf;
public void method2()
{
	hra=0.05*basicpay;
	pf=0.2*basicpay;
	System.out.println("hra="+hra);
	System.out.println("pf="+pf);
}
}
