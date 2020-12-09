package g_oop2;

public abstract class Animal 
{
	void run()
	{
		System.out.println("달려간다~~");
	}
	
	abstract void sound();
}


//자식들
class Dog extends Animal
{

	@Override
	void sound() 
	{
		System.out.println("멍멍!!");
	}
	
}

class Cat extends Animal
{

	@Override
	void sound() 
	{
		System.out.println("떼껄룩!");
		
	}
	
}

class hamster extends Animal
{

	@Override
	void sound() {
		System.out.println("찍!찍!");
		
	}
	
}