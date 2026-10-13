
/*
 * -----------------------------------------
 * Nome: Daniel Nogueira Lopes
 * RA: 0027826
 * Atividade 3.5 - Tabuada com do while
 * -----------------------------------------
 */

import java.util.Scanner;

public class Atividade3_5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Processamento
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        int contador = 1;

        do {
            int resultado = numero * contador;

            //Resultados
            System.out.println(numero + " x " + contador + " = " + resultado);

            if (resultado % 2 == 0) {
                System.out.println("Resultado par");
            } else {
                System.out.println("Resultado ímpar");
            }

            contador++;
        } while (contador <= 10);

        entrada.close();
    }
}

