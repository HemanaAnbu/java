package hemana;

class overloading2 {
	static int add(int a,int b) {return a+b;}
	static double add(double a,double  b) {return a+b;}
}
class testoverloading1{

 public static void main(String[] args) {
    System.out.println(overloading2.add(10,11));
    System.out.println(overloading2.add(66.7,44.6));
	}

}


	
