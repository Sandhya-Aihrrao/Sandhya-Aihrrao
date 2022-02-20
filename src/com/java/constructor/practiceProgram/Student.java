package com.java.constructor.practiceProgram;

public class Student {
	String SName;
	int SId;
	String Sub1;
	
	int Marks;
	
	
	Student( String name,int Id,String s1, int M)
	{
		SName= name;
		SId = Id;
		Sub1= "Eng";
		//Sub2="Maths";
		//Sub3="Comp";
		Marks= M;
		
		
		
	}
	void Show()
	{
		System.out.println("Name:"+SName);
		System.out.println("SId:"+1);
		System.out.println("Sub:" +Sub1);
		System.out.println("Marks:" +Marks);
		
		
	}
	

	public static void main(String[] args) {
		Student s1 = new Student("sandhya", 1,"Maths", 50);
		
		s1.Show();
		System.out.println();
		Student s2 = new Student("Vrishu", 2,"Computer",70);
		s2.Show();
		
		
		
		
	}

}
