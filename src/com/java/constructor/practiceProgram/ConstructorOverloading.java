package com.java.constructor.practiceProgram;

public class ConstructorOverloading {
	String Snm;
	int Sid;
	int a,b;
	int sum;
	ConstructorOverloading(String name, int id)
	{
		Snm=name;
		Sid=id;
	
	//void display()
	
	System.out.println("student name:"+Snm);
	System.out.println("Student id:"+Sid);
}
	public ConstructorOverloading(String name, int number, int age)
	
	{
		System.out.println("emp name:"+name);
		System.out.println("emp age:"+age);
		System.out.println("emp number:"+number);
		
	}
	public ConstructorOverloading( int x, int y)
	{
		a=x;
		b=y;
		sum=a+b;
		
		System.out.println(sum);
	}
	
	

	public static void main(String[] args) {
		ConstructorOverloading co= new ConstructorOverloading("sandhya",1);
		new ConstructorOverloading("vrishika", 5,6);
		new ConstructorOverloading(10,20);
		//co.display();
				
		
		
		
		
		
		
		
	}

}
