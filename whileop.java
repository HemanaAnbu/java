package hemana;

import java.util.Scanner;

public class whileop {

	public static void main(String[] args) {
		Scanner  input=new Scanner(System.in);
		int i=1;
		System.out.println("enter n value");
		int n=input.nextInt();
		while(i<=n) {
			if(i==50) {
				continue;
				//System.out.println(i);
				//continue;
			}System.out.println(i);
			i++;
		}

	}

}
