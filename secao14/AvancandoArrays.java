package secao14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AvancandoArrays {

    public static void main(String[] args) {
        
        // 1 - Ordenação 
        
        // Ordenação array de inteiros

        int[] numbers = {4,5,1,6,2,1,22};

        //Modifica o array original
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        //Ordenação com comparator 
        String[] name = {"joão","Pedro","Bob", "Marco"};

        Arrays.sort(name,Comparator.reverseOrder());

        System.out.println(Arrays.toString(name));

        //Ordenação de matriz

        int[][] matriz = {
            {4,5,1},
            {3,8,9},
            {2,3,1}


        };
        //Ordenação de linhas , por um valor de coluna
        Arrays.sort(matriz,Comparator.comparing(a -> a[0]));

        for(int [] linha : matriz){
            System.out.println(Arrays.toString(linha));
        }

        //Imprimir matriz sem Foreach
        System.out.println(Arrays.deepToString(matriz));


        // 2 -  Manipulação Avançada

        int[] original = {1,2,2,3};

        int[] copia = Arrays.copyOf(original, 2);

        System.out.println(Arrays.toString(copia));

        //fill - preenchimento
        int[] numeros = new int[5];

        System.out.println(Arrays.toString(numeros));

        Arrays.fill(numeros, 5);

        System.out.println(Arrays.toString(numeros));

        //Transformação de arryas para string
        int[] values = {1,2,3,4,5};

        //fazer uma soma dos elementos

        int sum = Arrays.stream(values).sum();

        System.out.println(sum);

        // Arrays dinâmicos
        ArrayList<String> frutas = new ArrayList<>();

        System.out.println(frutas);

        frutas.add("Maçã");
        frutas.add("Banana");

        System.out.println(frutas);

        for(String fruta : frutas){

            System.out.println(fruta);
        }

        frutas.remove("Banana");

        System.out.println(frutas);

        frutas.remove(0);

        System.out.println(frutas);
        
        frutas.add("Maçã");

        String frutaEspecifica = frutas.get(0);

        System.out.println(frutaEspecifica);



    }
    
}
