package desafio_numerico_em_java_1;

import java.util.Scanner;

public class Desafio_Numerico_em_Java_1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] valores = new int[5];
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            valores[i] = leitor.nextInt();
            
            if (valores[i] % 2 == 0) {
                pares += 1;
            } 
            
            if (valores[i] % 2 != 0) {
                impares += 1;
            }

            if (valores[i] > 0) {
                positivos += 1;
            }

            if (valores[i] < 0) {
                negativos += 1;
            } 
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

    }

}
