package secao14;
import java.util.Arrays;

public class exercicios2 {
    public static void main(String[] args) {
        

        //Ex 1 Inverter elementos de um Array
        int [] arrayOriginal = {1,2,3,4,5};
        int[] arrayInvertido = new int[arrayOriginal.length];

        for(int i = 0; i < arrayOriginal.length;i++) {

            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];

        }
        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayInvertido));


        // 2- Encontrar o elemento mais  frequente em um Array

        int[] arrayInteiros = {1,2,2,3,4,4,4,5};

        int maisFrequente = arrayInteiros[0];

        int maxContagem = 1;

        for(int i = 0; i < arrayInteiros.length;i++){

            int contagem = 0;

            for(int j = 0; j < arrayInteiros.length;j++){

                    if(arrayInteiros[j] == arrayInteiros[i]){
                        contagem++;

                    }
            }

            if(contagem > maxContagem){

                maxContagem = contagem;
                maisFrequente = arrayInteiros[i];
            }

        }
        System.out.println("O mais frequente é: " + maisFrequente);

        // 3 - Transpor uma matriz 2D, troca linhas por colunas
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}

        };

        int[][] matrizTransposta = new int [matriz[0].length][matriz.length];

        for (int[] linha : matrizTransposta) {

            System.out.println(Arrays.toString(linha));



        }       
        for(int i = 0; i <matriz.length;i++){

            for(int j = 0; j < matriz[0].length; j++){

                matrizTransposta[j][i] = matriz[i][j];

            }
        }

        for (int[] linha : matrizTransposta) {

            System.out.println(Arrays.toString(linha));


    }
}
    
}

