
/*
 * -----------------------------------------
 * Nome: Daniel Nogueira Lopes
 * RA: 0027826
 * Atividade 2.5 - Tabuada com while
 * -----------------------------------------
 */

import java.util.Scanner;

public class Atividade2_5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Processamento
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        int contador = 1;

        while (contador <= 10) {
            int resultado = numero * contador;

            //Resultados
            System.out.println(numero + " x " + contador + " = " + resultado);

            if (resultado % 2 == 0) {
                System.out.println("Resultado par");
            } else {
                System.out.println("Resultado ímpar");
            }

            contador++;
        }

        entrada.close();
    }
}
