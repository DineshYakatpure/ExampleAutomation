package com.sgtesting.inheitanceassing;
class Super2
{
	int age1;
	String name2;
	Super2 (int age1)
	{
		System.out.println(age1);
	}
	Super2 (String name2)
	{
		
		this.name2=name2;
		System.out.println(name2);
	}
}
class Sub4 extends  Super2 
{
	String name1;
       int age2;
	Sub4(String name1,int age1)
	{
		super(age1);
		System.out.println(name1);  
	}
	Sub4(int age2,String name2)
	{
		super(name2);
		System.out.println(age2);  
	}
}
class Sub3 extends Sub4
{
	String place1;
	String place2;
	Sub3(String place1,String name1,int age1)
	{
		super(name1,age1);
		System.out.println(place1);
	}
	Sub3(String place2,int age2,String name2)
	{
		super(name2,age2);
		System.out.println(place2);
	}

}

public class MultipleInheritanceConstructorOverLoadrong {

	public static void main(String[] args) {
		Sub3 obj=new Sub3("Bangalore","Dinesh",27);
		Sub3 obj1=new Sub3("Bidar","don",28);

	}

}

