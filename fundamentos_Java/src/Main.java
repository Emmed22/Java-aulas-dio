import java.util.Scanner;

public class Main {
    public static void main(String[] args){
         /* var scanner = new Scanner(System.in);
         System.out.println("Informe o primeiro número: ");
         var value1 = scanner.nextInt();
         System.out.println("Informe o segundo número: ");
         var value2 = scanner.nextInt();
         System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
         System.out.printf("%s - %s = %s\n", value1, value2, value1 - value2);
        */
        var scanner = new Scanner(System.in);
         System.out.println("Informe um número: ");
         var square = scanner.nextInt();
         System.out.printf("O quadrado do número %s é: %s\n",square, Math.sqrt(square));
        var square2 = Math.sqrt(square);
        System.out.println( square2++);
        System.out.println(square2++);
        System.out.println(square2);
    }

    
}
