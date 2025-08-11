package Demo2;

public class Address extends Student {
	
	String addr;

	Address(String addr) 
	{

		super();
		this.addr = addr;
		System.out.println("Name: "+name+"\nAge: "+age+"\nAddress: "+addr);
		
		
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1 = new Address("St Philominas, HSS");
		
	}

}
