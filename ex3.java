// Crie um programa que receba elementos para preencher uma matriz de 5 linhas e 10 colunas. Após preencher a matriz, o programa receberá um número inteiro de 0 a 9 que indicará qual coluna deverá ter os valores somados. Por fim o programa deverá imprimir a matriz resultante e o valor da soma dos números da coluna escolhida.

import java.util.Scanner;

public class ex3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[5][10];
        int soma = 0;

        for(int i = 0; i < 5; i++){
            for (int c = 0; c < 10; c++) {
                System.out.print("Digite um número: ");
                numeros[i][c] = scanner.nextInt();
            }
        }

        System.out.print("Digite um número de 0 a 9: ");
        int escolha = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int c = 0; c < 10; c++) {
                System.out.printf("%2d|", numeros[i][c]);
            }
            System.out.printf("%\n");
        }

        for(int m = 0; m < numeros.length; m++){
            soma += numeros[m][escolha];

        }
        System.out.print("A soma da coluna escolhida foi de "+ soma);

    }
}
