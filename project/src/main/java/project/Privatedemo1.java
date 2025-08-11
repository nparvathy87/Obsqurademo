package project;

 class Privatedemo1 {
	 
	 private int age;
	 private void print(int age)
	 {
		 this.age = age;
		 System.out.println(age);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Privatedemo1 p1 = new Privatedemo1();
		p1.print(45);
	}

}
