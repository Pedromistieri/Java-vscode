package secao14;

public class Listas {

    public static void main(String[] args) {
        
        // 1 - Sintaxe 
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("O primeiro elemento é: " + numeros[0]);

        // Tamanho fixo só que vazio
        String[] frutas = new String[3];

        // 0 , 1 e 2 => add elementos
        // 3 => não tenho

        frutas[0] = "Mamão";
        frutas[1] = "Limão";
        frutas[2] = "Laranja";

        System.out.println(frutas[1]);

        //frutas[3] = "teste";
        double[]  precos = {1.99, 2.45, 4.97};

        precos[2] = 5;
        System.out.println(precos[2]);

        //2 - loops em arrays
        //somar todos os elementos de um array;
        //acessar elementos e condensar a soma deles em uma variavel.
        int soma = 0;
                // lenght =  da a quantidade de elementos de um array

        for(int i = 0; i < numeros.length; i++) {
            // i > 0; i > 1; i > 2....
            soma += numeros[i];


        }

        System.out.println("Soma dos elementos: " + soma);
        //for each
        //nomear o item => array
        // pessoas = pessoas
        //frutas = frutas
        for(String fruta: frutas){
            System.out.println("A fruta da vez será: " + fruta);

        }
        // encontrar o maior valor de um Array
        int[] valores = {10, 25, 811, 2255, 1};
        int maiorValor = valores[0];

        int j = 0;

        while (j < valores.length) {

            if(valores[j] > maiorValor){
                maiorValor = valores[j];
            }
            j++;
        }

        System.out.println("O maior valor é: " + maiorValor);

        // 3 - for each
        for(int numero : numeros){
            System.out.println("Os numeros são: " + numero);
        }

        //contatenar os elementos de um array
       String[] palavras = {"Java", "é", "bom!"};
       String frase = "";

       for(String palavra : palavras){

            frase += palavra + " ";

       }

       System.out.println(frase);

       // verificar se valor está presente em array
       char[] letras = {'a', 'b' , 'c' ,'i'};

       char letraProcurada = 'i';

       for(char letra : letras){

        if(letra == letraProcurada){
            System.out.println("Encontraamos a letra: " + letra);
            break;
        }

       }
       
        


    }
    
}
