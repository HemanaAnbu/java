package hemana;

public class thiskeyword2 {
	void m()
	{System.out.println("hello m");
	
	}
	void  n()
	{
		System.out.println("hello n");
		
	}
	m();
	this.m();
	class B{
	public static void main(String[] args) {
		thiskeyword2 a=new thiskeyword2();
		a.n();
	}

}
