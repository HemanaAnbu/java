package hemana;

class keywordsuperB {
       
        	void eat() {
        		System.out.println("eating");
        	}
        }
class Mouse extends keywordsuperB
        {
        	void bark() {
        		System.out.print("barking");
        	
        	}
        	void eat() {
        		System.out.println("eating bread");
        		
        	}
        	void work()
        	{
        		eat();
        		super.eat();
        		bark();
        	}
        }
        
	class testsuper2
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Mouse d=new Mouse();
         d.work();
	}

}
