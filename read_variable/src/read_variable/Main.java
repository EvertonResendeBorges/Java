package read_variable;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			String variable;
			
			System.out.println("Type something");
			
			variable = s.nextLine();
			
			System.out.println("You typed: "+variable);
		}
		

	}

}
