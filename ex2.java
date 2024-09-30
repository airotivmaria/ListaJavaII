import java.util.Scanner;

class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[100];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite um valor: ");
            valores[i] = scanner.nextDouble();
        }

        for (int i = 0; i < valores.length; i++) {
            if(valores[i] <= 10){
                System.out.println("V[" + i + "] = " + valores[i]);
            }
        }
    }
}