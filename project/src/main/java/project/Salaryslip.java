package project;

public class Salaryslip extends Calculatesalary {
	int totalsalary;
	Salaryslip() 
	{
		super();
		totalsalary = basicpay + HRA + PF + bonus + professionaltax;
		//System.out.println("Total salary = "+totalsalary);
		super.HRAPF();
		System.out.println("Total salary = "+totalsalary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salaryslip s1 = new Salaryslip();

	}

}
