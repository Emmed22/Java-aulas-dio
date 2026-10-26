import java.util.Scanner;

public class Exercicios {
    public static void main(String[]args){

        //Exercício 1:
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var name = scanner.next();
        System.out.println("Informe sua idade:");
        var age = scanner.nextInt();
        System.out.printf("Olá %s, você tem %s anos \n", name, age);

        //Exercicio 2:
        System.out.println("Informe o tamanho do lado do quadrado:");
        var lado = scanner.nextInt();
        var area = lado * lado;
        System.out.printf("A área do quadrado é: %s \n", area);

        //Exercício 3: 
        System.out.println("Informe a base do retângulo:");
        var base = scanner.nextInt();
        System.out.println("Informe a altura do retângulo: ");
        var altura = scanner.nextInt();
        var areaRe = base * altura;
        System.out.printf(" A área do retângulo é : %s \n" , areaRe);

        //Exercício 4:
        System.out.println("Informe seu nome:");
        var nome = scanner.next();
        System.out.println("Informe sua idade:");
        var idade = scanner.nextInt();
        System.out.println("Informe seu nome:");
        var nome2 =scanner.next();
        System.out.println("Informe sua idade:");
        var idade2 = scanner.nextInt();
        var diferenca = 0;
        if (idade > idade2){
            diferenca = idade-idade2;
            System.out.printf("A diferença de idade entre %s e %s é de %s anos \n", nome, nome2, diferenca);
        }else {
            diferenca = idade2-idade;
            System.out.printf("A diferença de idade entre %s e %s é de %s anos \n", nome2, nome, diferenca);
        }
    }
}
