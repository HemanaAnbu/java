package hemana;

public class multilevelinheritance
{
	void eat()
	{
		System.out.println("eating");
	}
}
class  milk extends multilevelinheritance
{
	void bark()
	{
		System.out.println("barking");
	}
}
class babydog extends multilevelinheritance
{
	void weep()
	{
		System.out.println("weeping");
	}
}
class test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      babydog obj=new babydog();
      obj.weep();
      obj.bark();
      obj.eat();
	}

}
