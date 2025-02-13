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




}    
    
}
