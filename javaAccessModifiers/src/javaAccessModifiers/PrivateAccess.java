package javaAccessModifiers;
	class A
	{
	private int i=10;
	private	void m1()
		{
			System.out.println(i);
		}
	}

public class PrivateAccess {
	public static void main(String[] args) 
	{
		A obj=new A();
		obj.m1();
		obj.i=100;
		System.out.println(obj.i);
//if we make variable and method private,we cannot access it through   object
	}

}
