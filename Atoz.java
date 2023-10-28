package hemana;

import java.util.Scanner;

public class Atoz {

	public static void main(String[] args) {

		for(char ch='A';ch<='Z';ch++) {
			
			if(ch>'E'&& ch<'P') {
				continue;
			}
			System.out.print(ch+" ");
		}
           

	}

}
