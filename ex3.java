import java.util.Scanner;
public class ex3 {
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
