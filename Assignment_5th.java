class Animal
{
	Animal()
	{
		System.out.println("A new animal has been created!");
	}
	void sleep()
	{
		System.out.println("An animal sleeps...");
	}
	void eat()
	{
		System.out.println("An animal eats...");
	}
}
class Bird extends Animal
{
	Bird()
	{
		System.out.println("A new bird has been created!");
	}
	@Override
	void sleep()
	{
		System.out.println("A bird sleeps...");
	}
	@Override
	void eat()
	{
		System.out.println("A bird eats...");
	}
}
class Dog extends Animal
{
	Dog()
	{
		System.out.println("A new dog has been created!");
	}
	@Override
	void sleep()
	{
		System.out.println("A dog sleeps...");
	}
	@Override
	void eat()
	{
		System.out.println("A dog eats...");
	}
}
public class Assignment_5th
{
	public static void main(String[] args) 
	{
		Animal animal = new Animal();
		Bird bird = new Bird();
		Dog dog = new Dog();
		
		System.out.println();
		
		animal.sleep();
		animal.eat();
		
		bird.sleep();
		bird.eat();
		
		dog.sleep();
		dog.eat();		
		
		Animal a1 = new Dog();
		Animal a2 = new Bird();
		
		a1.eat();
		a2.sleep();		
	}
}