package secao14;

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

    }
    
}
