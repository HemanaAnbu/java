package hemana;

import java.util.Scanner;

public class Patten1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    System.out.print("enter the value of a:\n");
	    int a=input.nextInt();
		for (int i=1;i<=a;i++) {
			for  (int j=a;j>=i;j--) {
				System.out.print(" ");}
				for (int k=1;k<=i;k++) 
					System.out.print(k+" ");
				System.out.println();			}
		}

	}


  