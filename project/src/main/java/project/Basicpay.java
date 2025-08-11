package project;

public class Basicpay {
	int basicpay;
	int professionaltax;
	int bonus;
	Basicpay()
	{
		this.basicpay = 45000;
		this.professionaltax = 200;
		this.bonus = 20000;
		System.out.println("Basicpay = "+basicpay+"\nprofessionaltax = "+professionaltax+"\nBonus = "+bonus);
		
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basicpay b1 = new Basicpay();

	}

}
