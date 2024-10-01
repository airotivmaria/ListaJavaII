import java.util.Scanner;

public class ex5 {
    public static void povoarVetor(int[] num){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número: ");
            num[i] = scanner.nextInt();
        }
    }
    // ex6
    public static void imprimirVetor(int[] num){
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
    // ex7
    public static void maiorValor(int[] num){
        int maiorValor = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i] > maiorValor){
                maiorValor = num[i];
            }
        }
        System.out.println("O maior valor do vetor é: " + maiorValor);
    }

    //ex8
    public static void validarValor(int[] num){
        for
    }
    public static void main(String[] args) {
        int[] num = new int[5];
        povoarVetor(num);
        System.out.print("O vetor é formado por: ");
        imprimirVetor(num);
        maiorValor(num);
    }
}
