
import java.util.Arrays;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[30];
        int[] pares = new int[]{};
        int[] impares = new int[]{};

        for (int posicaoVetor = 0; posicaoVetor < numeros.length; posicaoVetor++){
            System.out.print("Digite um número inteiro, é permitido números positivos e negativos: ");
            numeros[posicaoVetor] = scanner.nextInt();

            if (numeros[posicaoVetor] % 2 == 0) {
                Arrays.fill(pares, posicaoVetor);
                System.out.println(Arrays.toString(pares));
            } else {
                Arrays.fill(impares, posicaoVetor);
            }
        }

        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
    
}