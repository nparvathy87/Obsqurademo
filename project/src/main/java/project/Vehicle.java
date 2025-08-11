package project;

//SUPER KEYWORD PGM

public class Vehicle {
String type = "car";

 Vehicle()
{
	displayType();
}

void displayType()
{
	System.out.println(type);
}

public static void main(String[] args){
	Vehicle v1 = new Vehicle();
	
}
}
