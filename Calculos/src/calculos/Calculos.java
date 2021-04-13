/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Calculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float numero1, numero2;
        int operacao;

        try {

            System.out.println("Digite dois números para a operação.");
            numero1 = entrada.nextFloat();
            numero2 = entrada.nextFloat();

            System.out.println("Qual operação deseja realizar?\n"
                    + "1- Adição \n"
                    + "2- Subtração \n"
                    + "3- Multiplicação \n"
                    + "4- Divisão \n");

            operacao = entrada.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Adição");
                    System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                    break;

                case 2:
                    System.out.println("Subtração");
                    System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                    break;

                case 3:
                    System.out.println("Multiplicação");
                    System.out.println(numero1 + " x " + numero2 + " = " + (numero1 * numero2));
                    break;

                case 4:
                    System.out.println("Divisão");
                    System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } catch (Exception e) {
            System.out.println("Digite apenas números");
        } finally {
            System.out.println("Encerrando programa.");
        }

    }

}
