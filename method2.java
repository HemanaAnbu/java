package hemana;

import java.util.Scanner;

public class method2 {
	public void prime() {
        int i,m=0,a=0;
        int n=6;
        m=n/2;
		
		{
			if(n==0||n==1)  {
				System.out.println("number is not prime");
			}
			
			else {
				for(i=2;i<=m;i++) 
					if(n%i==0) {				
						System.out.println("number is not  prime");
						a=1;
						break;
					}
		}
			if(a==0) {
				System.out.println(n+"is prime number");
			}
			}
		}
		
		

	public static void main(String[] args) {
		method2 obj=new method2();
		obj.prime();// TODO Auto-generated method stub

	}

}

