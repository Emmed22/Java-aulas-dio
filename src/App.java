import java.util.Scanner;

public class App {
    private final static String WELCOME_MESSAGE = "Olá, informe seu nome: ";
    public static void main(String[] args) {
        //Variáveis e tipos primitivos
       Scanner scanner = new Scanner(System.in);
       System.out.println(WELCOME_MESSAGE);
       String name = scanner.next();
       System.out.println("Olá informe sua idade: ");
       int age = scanner.nextInt();
       System.out.printf("Olá %s sua idade é %s \n", name, age);

      //Usando operadores lógicos
      System.out.println("Quanto é 2 + 2 ?");
      var result =scanner.nextInt();
      var isRight = result == 4;
      System.out.printf("O resultado é 4, voce acertou? %s \n", isRight);

      //Verificando se uma pessoa pode dirigir: 
      System.out.println("Quantos anos voce tem?");
      var idade = scanner.nextInt();
      var canDrive= idade > 17;
      System.out.printf("Voce pode dirigir? (%s) \n", canDrive);
}
}