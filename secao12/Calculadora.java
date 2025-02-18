package secao12;

// Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e subtração

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {

        //Resgatando números
        System.out.println(adicionar(2, 4));
        System.out.println(subtração(2, 4));
        System.out.println(multiplicar(2, 4));
        System.out.println(divisão(2, 4));
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");

        double num1 = scanner.nextDouble();

        System.out.println("digite o segundo número: ");

        double num2 = scanner.nextDouble();

        // Resgatando operação
        System.out.println("Escolha a operação: ");
        System.out.println("1) Adição (+) ");
        System.out.println("2) Subtração (-) ");
        System.out.println("3) Multiplicar (*) ");
        System.out.println("4) divisão (/) ");

        int operação = scanner.nextInt();

        
        //Realizando cálculo
        double resultado = 0;

        switch (operação) {
            case 1:

              resultado = adicionar(num1, num2);
                break;
            case 2:

              resultado = subtração(num1, num2);
                break;
            case 3:

              resultado = multiplicar(num1, num2);
                break;
            case 4:

                if(num2 != 0){
               resultado = divisão(num1, num2);
                }else{
                System.out.println("Divisão por 0 não permitida! ");
                scanner.close();
                return;  

                }

                break;
        
            default:
                System.out.println("Operação inválida");
                scanner.close();
                return;
        }
        //Exibição do resultado
        System.out.println("O resultado da operação é: " + resultado);

        //Fechando o Scanner
        scanner.close();

    }

    // Funções para calculos
    public static double adicionar(double a, double b) {

        return a + b;

    }
    
    public static double subtração(double a, double b) {

        return a - b;

    }

    public static double multiplicar(double a, double b) {

        return a * b;

    }
    
    
    public static double divisão(double a, double b) {

        return a / b;

    }
    

}
