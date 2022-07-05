package calculo;

import java.util.Scanner;

public class Calculo {
    


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double n1, n2;
        int calculo;
        
        System.out.println("Digite o primeiro número.");
        n1 = s.nextDouble();
        
        System.out.println("Digite o segundo número.");
        n2 = s.nextDouble();
        
        System.out.println("Escolha o calculo que deseja realizar.");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5- Resto da Divisão");
        System.out.println("6- Sair do programa");
        
        calculo = s.nextInt();
        
        switch(calculo){
            case 1: 
                System.out.println(n1+" + "+n2+" = "+(n1+n2));
            break;
            case 2: 
                System.out.println(n1+" - "+n2+" = "+(n1-n2));
            break;
            case 3: 
                System.out.println(n1+" x "+n2+" = "+(n1*n2));
            break;
            case 4: 
                System.out.println(n1+" / "+n2+" = "+(n1/n2));
            break;
            case 5: 
                System.out.println(n1+" mod "+n2+" = "+(n1%n2));
            break;
            case 6: 
                System.out.println("Saindo do programa.\nAté mais!");
            break;
            default:
                System.out.println("Entrada inválida.");
        }
        
    }
    
}
