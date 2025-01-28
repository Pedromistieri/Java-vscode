package secao8;

public class Funcoes {
    

    public static void main(String[] args) {

        // 1 - Crianddo a primeira função
        // Tanto funções quanto variáveis a gente nomeia

        saudacao();
        saudacao();
        saudacao();

        // 2- Parametros
        soma(2 , 4);

        
    }

    // Nome , os parenteses (ARGS), BLOCO {}
   public static void saudacao() {

    System.out.println("Olá, esta é minha primeira função!");
    
   } 


   public static void soma(int a, int b) {
    int resultado =  a + b;

    System.out.println("O resultado dda soma é: " + resultado);


    
   }


    }


    




