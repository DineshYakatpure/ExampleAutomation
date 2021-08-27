package com.sgtesting.inheitanceassing;


class Gmother {
	Gmother(String Gname)
	{
		System.out.println("GrandMother name"+Gname);
	}
}

class Mother extends Gmother
{
	Mother(String Mname,String Gname)
	{
		super(Gname);
		System.out.println("mother name"+Mname);
	}
}

class Daug extends Mother
{
	Daug(String Dname, String Mname,String Gname)
	{
		super(Mname,Gname);
		System.out.println("Chld1: 1 string param");
	}
}

public class ParameterisedConstructor {
	public static void main(String[] args) {
		new Daug ("Dinesh","Dnyanoba","Shantabai");
	}
}
