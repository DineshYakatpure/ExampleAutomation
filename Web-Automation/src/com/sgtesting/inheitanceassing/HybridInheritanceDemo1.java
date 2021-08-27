package com.sgtesting.inheitanceassing;
abstract class GG
{
	abstract void method1();
	abstract void method2();
	abstract void method3();
	
}
abstract class PP extends GG
{
	public void method1()
	{
		
			System.out.println("Method1");
			
	}
	public void method2()
	{
		System.out.println("Method2");
		
	}
}
class DD extends PP
{
	public void method3()
	{
		System.out.println("method3");
	}
}
class TT extends GG
{
	public void method1()
	{
		System.out.println("Method1");
		
	}
	public void method2()
	{
		System.out.println("Method2");
		
	}
	public void method3()
	{
		System.out.println("Method3");
		
	}
}
public class HybridInheritanceDemo1 {

	public static void main(String[] args) {
		DD ch =new DD();
		ch.method1();
		ch.method2();
		ch.method3();
		System.out.println("****************");
		TT tt =new TT();
		tt.method1();
		tt.method2();
		tt.method3();
		
				

	}

}
