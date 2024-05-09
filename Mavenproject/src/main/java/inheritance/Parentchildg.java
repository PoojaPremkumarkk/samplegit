package inheritance;

public class Parentchildg extends ParentClassB {
	
		double totalsalary;
		double salaryslip;
		
		public void show()
		{
			totalsalary=basicpay+hra-pf-deduction+bonus;
			salaryslip=basicpay+deduction+hra+pf;
			System.out.println("total salary="+totalsalary);
			System.out.println("Salary slip="+salaryslip);
		}

		public static void main(String[] args) {
			
	ParentchildC obj1=new ParentchildC();
	obj1.show();
	obj1.method2();
	obj1.display();
		}

	}


