package secao11;

public class loops {

    public static void main(String[] args) {
        
        // 1- for

        //Loop q vai rodar de 1 a 5

        for(int i = 1; i <= 5; i++) {
            //repetir
            System.out.println("Contador: " + i);
        }

        // Mostrar cada caractere de uma String
        String palavra = "java";

        //lenght em strings da o número de letras
        //Arrays e Strings a primeira letra é o 0 "j" = 0

        for(int i = 0; i < palavra.length();i++){

            System.out.println("Caractere: " + palavra.charAt(i));


        }

        //Contagem regressiva
        for(int i = 5; i>0;i--){

            System.out.println("Contagem: " + i);

        }

        //2 -While

        int i = 0;
    while(i <= 5){

        System.out.println("While contador: " + i);

        i++;

    }


     int valor = 0;
     while (valor != 7) {

        valor = (int)(Math.random() *100);
        
        System.out.println("Valor aleatório: " + valor);
        
     }

     // 3 - loop infinito
     //while(true){
        //System.out.println("Infinito!");

        //for(int j = 0; 1<= 5; j--){

           // System.out.println(j);
            
        
           //4 -Do While

           int j = 110;
           do {

            System.out.println("O valor de j é : " + j);

            j--;

           }while(j > 0);

           int numero = 0;

           do {

            numero = (int)(Math.random() *10);
        
            System.out.println("Número aleatório: " + numero);

           }while (numero != 1) ;
            
           

           
     }


    }

    

    
    

