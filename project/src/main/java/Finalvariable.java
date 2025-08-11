
public class Finalvariable {

	
	final int speed = 900;
	
	 void display()
	{
		 speed = 800;
		System.out.println(speed);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalvariable v1 = new Finalvariable();
		v1.display();
	}

}
