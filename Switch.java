package hemana;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		    Scanner input=new Scanner(System.in);
		    System.out.print("enter the case");
		    int c=input.nextInt();
		    System.out.print("enter the value a");
		    int a=input.nextInt();
		    System.out.print("enter the value b");
		    int b=input.nextInt();
		   
		    switch(c){
		        case 1:
		            System.out.println(a+b);
		         break;
		        case 2:
		            System.out.println(a-b);
		        break;
		        case 3:
		            System.out.println(a*b);
		        break;
		        case 4:
		            System.out.println(a/b);
		        break;
		       default:
		    	  System.out.println(" invalid");
		    }
		    }
		

	}


