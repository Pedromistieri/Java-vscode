package secao5_calcIMC;

import java.util.Scanner;

public class Calculadora{
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");

        double peso = scanner.nextDouble();

      System.out.println("Digite sua altura");

      double altura = scanner.nextDouble();

      double imc = peso / (altura * altura);

      System.out.println(imc);

      scanner.close();

      if(imc < 18.5){
        System.out.println("Seu IMC é: " + imc + "Classificação: Abaixo do peso!");


      }else if (imc >= 18.5 && imc <= 24.9){
        System.out.println("Seu IMC é: " + imc + " Classificação: Peso normal!");


      } else if(imc >= 25.0 && imc <= 29.9) {
        System.out.println("Seu IMC é: " + imc + "Classificação: Sobrepeso!");


      }else{
        System.out.println("Seu IMC é: " + imc + "Classificação: Obesidade seu gordim safado!");
      }

    }
}

