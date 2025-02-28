package secao14;

import java.util.Arrays;

public class Listas {

    public static void main(String[] args) {
        
        // 1 - Sintaxe 
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("O primeiro elemento é: " + numeros[0]);

        // Tamanho fixo só que vazio
        String[] frutas = new String[3];

        // 0 , 1 e 2 => add elementos
        // 3 => não tenho

        frutas[0] = "Maçã";
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

        // 4- loops com if 
        // filtrar e somar números pares 
        int somaPares = 0;
        for(int numero : numeros){

            if(numero % 2 == 0){
                somaPares += numero;
            }
        }
        System.out.println("Somaa pares: " + somaPares);

        //Exibir valores maiores que determinado valor
        int[] nums = {12, 6, 18 , 24, 48, 5};
        int limite = 10;

        for(int i = 0 ; i <nums.length; i++){

            if(nums[i] > limite){

                System.out.println("Numero maior encontrado: " + nums[i]);

            }

        }

        String[] linguagens = {"Java", "c", "Python", "Php"} ;

        String linguagensAlvo = "Python";

        for(String linguagem : linguagens){

            if(linguagensAlvo == linguagem){

                System.out.println("Linguagem encontrada! Parando o loop ");
                break;

            } else{
                System.out.println("Linguagem ainda não encontrada!");
            }

        }

        // 5 -Atualizar valores
        for(int i = 0; i < numeros.length;i++){

            numeros[i] *= 2;

        }

        System.out.println(numeros[1]);

        for(int numero : numeros){

            System.out.println("Número dobrado: " + numero);
        }

        numeros[5] = 1;
        System.out.println(numeros[5]);

        for(int i = 0; i < frutas.length; i++){

            if(frutas[i].equals("Maçã")) {

                frutas[i] = "Abacate";

            }

        }
        System.out.println(frutas[0]);

        // 6 - Método toString

        // classes do java que vão ter métodos utilitarios , o Arrays é uma delas

        String dadosNumericos = Arrays.toString(numeros);

        System.out.println(dadosNumericos);

        String dadosFrutas = Arrays.toString(frutas);

        System.out.println(dadosFrutas);

        int[] teste = new int[3];
        System.out.println(Arrays.toString(teste));

        //7 - Adicionando novos itens ao Arrays
        //ex1. criando um novo Array  maior e copiando o else.
        int[] novoArray = new int [numeros.length + 1];

        for(int i = 0; i < numeros.length;i++){

            novoArray[i] = numeros[i];
            
        }
        System.out.println(Arrays.toString(novoArray));

        novoArray[novoArray.length - 1] = 4;

        System.out.println(Arrays.toString(novoArray));

        //ex 2 - Utilizando o Array copy para copiar os elementos
        String[] novoFrutas = new String[frutas.length + 1];

        System.arraycopy(frutas, 0, novoFrutas, 0, frutas.length);

        novoFrutas[novoFrutas.length - 1] = "jaca";

        System.out.println(Arrays.toString(novoFrutas));

        //ex 3 - Usando ArrayList
        java.util.ArrayList<String>listaFrutas = new java.util.ArrayList<>(Arrays.asList("Maçã","limão","laranja"));

        System.out.println(listaFrutas);

        listaFrutas.add("manga");
        System.out.println(listaFrutas);

        //8- Reference trap
        int[] arrayOriginal = {1,2,3};

        int[] arrayCopia = arrayOriginal;

        arrayCopia[0] = 10;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayCopia));

        // como evitar?
        int[]arrayClone = arrayOriginal.clone();

        arrayClone[0] = 999;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayClone));



        // 9 - Arrays 2d
        //[[1,2]], [[2,3]]
        //array [0][1]

        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}

        }; 

        System.out.println(matriz[1][2]);

        //Criando array d2 vazio e preenchendo
        int[] [] tabela = new int [3][3];

        tabela[0][0] = 10;
        tabela[1][1] = 20;
        tabela[2][2] = 30;

        for(int[] linha : tabela){
            System.out.println(Arrays.toString(linha));

        }

        int[][] grade = new int [4][5];

        for(int m = 0; m < grade.length; m++){

            for (int n = 0; n < grade[m].length; n++) { // Correção aqui
                grade[m][n] = m * n;
            }

        }

        for(int[] linha : grade){
            System.out.println(Arrays.toString(linha));

        }
    
        


       }
       
    }


    
    

