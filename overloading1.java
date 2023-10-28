package hemana;

class overloading1 {
	static int add(int a,int b) {return a+b;}
	static int add(int a,int b,int c) {return a+b+c;}
}
class testoverloading{

 public static void main(String[] args) {
    System.out.println(overloading1.add(10,11));
    System.out.println(overloading1.add(11,11,11));
	}

}
