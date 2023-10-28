package hemana;

class keywordsuper {
	String color ="white";
}
class dog extends keywordsuper {
	String color="black";

void display()
{
	System.out.println(color);
	System.out.println(super.color);
}}
class testsuper1{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog ();
		d.display();
	}

}
