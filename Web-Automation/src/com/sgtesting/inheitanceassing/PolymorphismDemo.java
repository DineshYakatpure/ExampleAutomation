package com.sgtesting.inheitanceassing;
abstract class Animal{
	abstract void sound();
}
class Dog extends Animal{
	public void sound() {
		System.out.println("bow");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("meow");
	}
}
class Cow extends Animal{
	public void sound() {
		System.out.println("amba");
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		Animal a;
		a=new Dog();
		a.sound();
		a=new Cat();
		a.sound();
		a=new Cow();
		a.sound();
	}
}

