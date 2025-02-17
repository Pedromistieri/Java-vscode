package secao11;

public class Exercicios {

public static void main(String[] args) {


    //  Ex 1 = somatório com for
    int somatório = 0;
    for (int i = 0; i <= 100; i++) { // Somando os números de 1 a 10

        somatório += i;
        
       
    }
    System.out.println("A soma dos números de 1 a 10 é: " + somatório);

    // Ex 2 = Usando loop While imprima todos os número pares de 1 a 20

    int numero = 1;

    while (numero <= 20) {

        if (numero % 2 == 0) {

            System.out.println("Os número pares de 1 a 20 são: " + numero);
            
        }

        numero++;
        
    }


    // Ex 3 - Verificçõ de número primo com for

    int numPrimo = 21;

    boolean ePrimo = true;

    // Testr se ele é primo mesmo
    for(int i = 2; i < numPrimo; i++){

        //Se conseguir dividir esse cra e nõ ter resto, enão ele é primo
        // dividido por 1 e por ele mesmo
        if(numPrimo % i == 0){

            ePrimo = false;
            break;

        }

    }

    if(ePrimo){

        System.out.println("O número " + numPrimo + " é primo!");

    }else{
        System.out.println("O número " + numPrimo + " Não é primo!");


    }

    //Ex 4 - Menu interativo com do While
   int opcao;
   
    do{

        System.out.println("Exercício 4 - Menu");
        System.out.println("0) Refrigerante");
        System.out.println("1) Hamburguer");
        System.out.println("2) Hot doggy");
        System.out.println("3) Pizza");
        System.out.println("4) Sair");
        
        opcao = (int)(Math.random() * 5);

        System.out.println("A opção escolhida foi: " + opcao );

    }while(opcao != 4);
       




}    
    
}
