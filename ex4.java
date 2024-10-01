// Construa um algoritmo que receberá valores inteiros em quantidade suficiente para monta uma matriz de 10x10 posições. Ao final, o algoritmo escreverá o maior valor encontrado. Além dele, serão apresentados, também, todos os elementos presentes na linha e coluna em que se encontra o maior valor.

import java.util.Scanner;

public class ex4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[10][10];
        int maiorValor = numeros[0][0];
        int colunaMaior = 0;
        int linhaMaior = 0;

        for(int i = 0; i < 10; i++){
            for (int c = 0; c < 10; c++) {
                System.out.print("Digite um número: ");
                numeros[i][c] = scanner.nextInt();
            }
            
        }

        for (int i = 0; i < 10; i++) {
            for (int c = 0; c < 10; c++) {
                System.out.printf("%2d|", numeros[i][c]);
                
                if(numeros[i][c] > maiorValor){
                    maiorValor = numeros[i][c];
                    colunaMaior = c;
                    linhaMaior = i;
                }
            }
        }
        System.out.println("\nO maior valor da matriz: " + maiorValor);

        System.out.print("Elementos da coluna: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i][colunaMaior] + " ");
        }

        System.out.print("\nElementos da linha: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[linhaMaior][i] + " ");
        }
    }
}
