package sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			int n1, n2, sum;
			
			System.out.println("First value");
			
			n1 = s.nextInt();
			
			System.out.println("Second value");
			
			n2 = s.nextInt();
			
			sum = n1 + n2;
			
			System.out.println(n1 + " + "+n2+ " = "+sum);
		}
		

	}

}
