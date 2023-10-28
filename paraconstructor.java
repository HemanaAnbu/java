package hemana;

public class paraconstructor {
     int id;
     String name;
     paraconstructor(int i, String n){
    	 
    	 id=i;
    	 name=n;
     }
     void display() {
    	 System.out.println(id+"  "+name);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paraconstructor s1=new paraconstructor(111,"kaviya  ");
		paraconstructor s2=new paraconstructor(222,"annika");
		s1.display();
		s2.display();
		
	}

}
