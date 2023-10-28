package hemana;

class singleinheritance {
	void eat()
	{System.out.println("eating");
	
	}
}
class  Dog extends singleinheritance
{
	void bark()
	{
		System.out.println("barking");
		
	
	}}
class testinheritance
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Dog d=new Dog();
     d.eat();
     d.bark();
	}

}
