package hemana;

public class thiskeyword3 {
	thiskeyword3(){
		System.out.println("hello");
	}
	thiskeyword3(int x){
		this();
		System.out.println(x);
	}
	}
class b{
	public static void main(String[] args) {
		thiskeyword3 a=new  thiskeyword3(10);

	}

}
