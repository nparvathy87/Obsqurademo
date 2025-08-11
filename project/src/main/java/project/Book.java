package project;

//AGGREGATION PGM
public class Book {
	
	String bname;
	int price;
	Author auth;
	
	Book(String bname, int price, Author auth)
	{
		this.bname = bname;
		this.price = price;
		this.auth = auth;
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author au = new Author("James",62);
		Book bo = new Book("Java",312,au);
		System.out.println(bo.bname) ;
		System.out.println(bo.auth.authname);
		System.out.println(bo.auth.age);
		//System.out.println(bo.bname);
	}

}
