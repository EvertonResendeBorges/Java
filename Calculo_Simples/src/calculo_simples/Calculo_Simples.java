package calculo_simples;

import java.util.Scanner;

public class Calculo_Simples {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int n1,n2, soma;
        
        System.out.println("Informe o primeiro número");
        n1 = s.nextInt();
        
        System.out.println("Informe o segundo número");
        n2 = s.nextInt();
        
        soma = n1 + n2;
        
        System.out.println(n1+" + "+n2+" = "+soma);
       
    }
    
}
