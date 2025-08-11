package Demo2;

public class Division extends Addition {
	
	int a;
	
	Division()
	{
		//this.a = super.add;
		//System.out.println(a);
		int total = super.add(30,20);
		System.out.println(total);
		if (total % 10 == 0)
		{
			System.out.println("DIVISIBLE");
		}
		else
		{
		System.out.println("NOT DIVISIBLE");		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Division d1 = new Division();

	}

}
