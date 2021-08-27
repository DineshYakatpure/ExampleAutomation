package com.sgtesting.inheitanceassing;
class Super1
{
	int age;
	Super1 (int age)
	{
		
		System.out.println(age);
	}
}
class Sub extends  Super1 
{
	String name;
	Sub(String name,int age)
	{
		super(age);
		System.out.println(name);  
	}
}
class Sub1 extends Sub
{
	String place;
	Sub1(String place,String name,int age)
	{
		super(name,age);

		System.out.println(place);
	}

}

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Sub1 obj=new Sub1("Bangalore","Dinesh",27);

	}

}
