package secao2;

import java.util.Scanner;

public class testeScanner {
    
    /**
     * @param args
     */
    public static void main(String[]args){

// 1 - Testando Scanner 
Scanner scanner = new Scanner(System.in);


//nextInt
//System.out.println("Digite um número: ");

//int numero = scanner.nextInt();

//System.out.println("Seu número é " + numero + "!");

// next line
//System.out.println("Digite seu nome: ");

String nome = scanner.nextLine();

System.out.println("olá " + nome + "!");

//Fechamento do Scanner para evitar memory leak
//scanner.close();

// Problemas nextline

System.out.println("Digite um número:");
int n = scanner.nextInt();
scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

System.out.println("Digite um texto:");
String txt = scanner.nextLine();

System.out.println("Os dados são: n = " + n + " e txt = " + txt);

scanner.close(); // Fecha o scanner no final






    }
}
