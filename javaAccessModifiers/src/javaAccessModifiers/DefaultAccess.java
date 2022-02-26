package javaAccessModifiers;
class B
{
int i=10000;
void m1()
	{
		System.out.println(i);
	}
}

public class DefaultAccess {
public static void main(String[] args) 
{
	B obj=new B();
	obj.m1();
	obj.i=100;
	System.out.println(obj.i);

}


}

//IF DO NOT PROVIDE ANY ACCESS MODIFIER TO VARIABLE AND METHOD,IT WILL BE CONSIDERED AS DEFAULT
//DEFAULT IS A KEYWORD