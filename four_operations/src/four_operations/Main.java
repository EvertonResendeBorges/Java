package four_operations;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		try (Scanner s = new Scanner(System.in)) {
			double n1, n2, add, sub, multi, div;
			
			System.out.println("First value");
			n1 = s.nextDouble();
			
			System.out.println("Second value");
			n2 = s.nextDouble();
			
			add = n1 + n2;
			sub = n1 - n2;
			multi = n1 * n2;
			div = n1 / n2;
			
			System.out.printf("%.2f + %.2f = %.2f%n",n1, n2, add);
			System.out.printf("%.2f - %.2f = %.2f%n",n1, n2, sub);
			System.out.printf("%.2f x %.2f = %.2f%n",n1, n2, multi);
			System.out.printf("%.2f / %.2f = %.2f%n",n1, n2, div);
		}

	}

}
