package project;

public class Surgeon extends Doctor {

	public void treatpatient()
	
	{
		System.out.println("Surgery fixed for next week");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Surgeon su = new Surgeon();
    // Doctor d = new Doctor();
     //d.treatpatient();
     //super.treatpatient();
     su.treatpatient();
	}

}
