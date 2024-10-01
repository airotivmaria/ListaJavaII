// Construa um algoritmo que receberá 30 valores inteiros. Ao final, seu algoritmo deverá apresentar os números pares em uma linha e na linha seguinte os números ímpares, na ordem em que foram lidos.

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[30];
        int[] pares = new int[30];
        int[] impares = new int[30];
        int iPares = 0;
        int iImpar = 0;
        

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número inteiro, é permitido números positivos e negativos: ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            if(numero % 2 == 0){
                pares[iPares] = numero;
                iPares++;
            } else {
                impares[iImpar] = numero;
                iImpar++;
            }
        }

        for (int par : pares) {
            System.out.print(par + " ");
        }
        System.out.println("\n");

        for (int impar : impares) {
            System.out.print(impar + " ");
        }
    }
    
}