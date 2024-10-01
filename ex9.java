// Desenvolva uma função que recebe os valores da hipotenusa e dos dois catetos e retorna "true" quando o triângulo for retângulo, ou seja, se o quadrado da hipotenusa é igual à soma do quadrado dos catetos. Caso contrário, retoma falso "false".

import java.util.Scanner;

public class ex9{
    
    public static boolean pitagoras(int hipotenusa, int cateto1, int cateto2){
        int a = hipotenusa * hipotenusa;
        int b = cateto1 * cateto1;
        int c = cateto2 * cateto2;

        if(a == b + c){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor hipotenusa: ");
        int hipotenusa = scanner.nextInt();
        System.out.print("Cateto 1: ");
        int cateto1 = scanner.nextInt();
        System.out.print("Cateto 2: ");
        int cateto2 = scanner.nextInt();
        
        boolean resultado = pitagoras(hipotenusa, cateto1, cateto2);
        if(resultado){
            System.out.println("O triângulo é retângulo.");
        } else{
            System.out.println("O triângulo não é retângulo.");
        }

    }
}
