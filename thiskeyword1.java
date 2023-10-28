package hemana;

public class thiskeyword1 { 
	int rollno;
	String name;
	float fee;
	thiskeyword1(int rollno,String name,float fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
}

void display()
{
	System.out.println("R"+rollno+"n"+name+"f"+fee);
	
}}  
  class test2{
	public static void main(String[] args) {
		thiskeyword1 s1=new thiskeyword1(111,"hemanai",5000f);
		thiskeyword1 s2=new thiskeyword1(123,"arthika",8000f);
		s1.display();
		s2.display();

	}
}



