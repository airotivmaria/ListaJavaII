import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[10][10];

        for(int i = 0; i < 10; i++){
            for (int c = 0; c < 10; c++) {
                System.out.print("Digite um número: ");
                numeros[i][c] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int c = 0; c < 10; c++) {
                System.out.printf("%2d|", numeros[i][c]);
            }
            System.out.printf("%\n");
            
        }
    }
}
