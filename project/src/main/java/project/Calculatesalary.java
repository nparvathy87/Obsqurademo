package project;

public class Calculatesalary extends Basicpay{
 int HRA;
 int PF;
  Calculatesalary()
  {
	  super();
      int b= super.basicpay;
	  this.HRA = (5 * b)/100;
      this.PF = (20 * b)/100;
  }
	public void HRAPF() 
	{
    	// TODO Auto-generated constructor stub

        System.out.println("HRA = "+HRA+"\nPF = "+PF);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculatesalary c1 = new Calculatesalary();
        c1.HRAPF();

	}

}