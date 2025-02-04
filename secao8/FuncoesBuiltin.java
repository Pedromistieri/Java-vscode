package secao8;

public class FuncoesBuiltin {

    public static void main(String[] args){

        // 10 - Funções built in de Strings
        String frase = "Java é muito bom!";

        //Length = Quantidade de caracteres na frase
        System.out.println(frase.length());

        // int = inteiro
        // String = S = Letra  maiúscula inicial = Classe

        System.out.println(frase.substring(0,4));
        // Extraiu do primeior até o 4  caractere da frase que no caso é "Java"
        System.out.println(frase.toUpperCase());
        System.out.println(frase.replace("o","e"));
        System.out.println(frase.toLowerCase());

    }
    
}
