package com.sgtesting.inheitanceassing;
interface AA
{
	default void method1()
	{
		System.out.println("default method1");
		
	}
}

abstract class  BB
{
	public void method2()
	{
		System.out.println("Method2");
		
	}
}
class CC extends BB implements AA
{
	public void method3()
	{
		System.out.println("Method3");
		
	}
}
	
public class MultipleInhertnce {

	public static void main(String[] args) {
		CC obj =new CC();
		obj.method1();
		obj.method2();
		obj.method3();
	}
}
