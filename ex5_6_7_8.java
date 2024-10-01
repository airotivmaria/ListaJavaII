import java.util.Scanner;

public class ex5_6_7_8 {
    // ex5
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
    public static boolean validarValor(int[] num, int pesquisa){
        for(int i = 0; i < num.length; i++) {
            if(num[i] == pesquisa){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];
        povoarVetor(num);
        System.out.print("O vetor é formado por: ");
        imprimirVetor(num);
        maiorValor(num);

        System.out.print("Digite um número para pesquisar no vetor: ");
        int pesquisa = scanner.nextInt();
        boolean encontrado = validarValor(num, pesquisa);
        if(encontrado){
            System.out.println("O valor de " + pesquisa + " foi encontrado no vetor.");
        } else{
            System.out.println("O valor de " + pesquisa + " não foi encontrado no vetor.");
        }
    }
}
