
/************************************************************
 * Instituicao: UNICEPLAC
 * Aluno: Daniel Nogueira Lopes
 * RA: 0027826
 * Atividade: Tabuada analisada - for
 ************************************************************/

import java.util.Scanner;

public class Atividade1_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Processamento
        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        for (int contador = 1; contador <= 10; contador++) {
            int resultado = numero * contador;

            //Resultados
            if (resultado % 2 == 0) {
                System.out.println(numero + " x " + contador + " = "
                        + resultado + " - Par");
            } else {
                System.out.println(numero + " x " + contador + " = "
                        + resultado + " - Impar");
            }
        }

        entrada.close();
    }
}
