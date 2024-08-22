package test2;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //soma:
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();
        int soma = n1+n2;
        System.out.println("A soma do programa é: "+soma);
         */

        //subtração
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();
        int sub = n1-n2;
        System.out.println("A soma do programa é: "+sub);
         */

        //divisão
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();
        int div = n1/n2;
        System.out.println("A soma do programa é: "+div);
         */

        //multiplicação
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();
        int mult = n1*n2;
        System.out.println("A soma do programa é: "+mult);
    */

        Scanner input = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            System.out.println("Calculadora");
            System.out.println("============");
            System.out.println("Digite '1' para fazer soma de 2 números");
            System.out.println("Digite '2' para fazer subtração de 2 números");
            System.out.println("Digite '3' para fazer multiplicação de 2 números");
            System.out.println("Digite '4' para fazer divisão de 2 números");
            System.out.println("Digite '5' para encerrar o programa");
            System.out.println("Digite sua opção: ");
            int opt = input.nextInt();

            switch (opt){
                case 1:

                    System.out.println("Digite o primeiro número: ");
                    int n1 = input.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int n2 = input.nextInt();
                    int soma = n1+n2;
                    System.out.println("A soma do programa é: "+soma);
                    break;

                case 2:

                    System.out.println("Digite o primeiro número: ");
                    n1 = input.nextInt();
                    System.out.println("Digite o segundo número: ");
                    n2 = input.nextInt();
                    int sub = n1-n2;
                    System.out.println("A subtração do programa é: "+sub);
                    break;

                case 3:
                    System.out.println("Digite o primeiro número: ");
                    n1 = input.nextInt();
                    System.out.println("Digite o segundo número: ");
                    n2 = input.nextInt();
                    int mult = n1*n2;
                    System.out.println("A multiplicação do programa é: "+mult);
                    break;

                case 4:
                    System.out.println("Digite o primeiro número: ");
                    n1 = input.nextInt();
                    System.out.println("Digite o segundo número: ");
                    n2 = input.nextInt();
                    int div = n1/n2;
                    System.out.println("A divisão do programa é: "+div);
                    break;
                case 5:
                    System.out.println("Fim do programa");
                    i = 6;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
}
