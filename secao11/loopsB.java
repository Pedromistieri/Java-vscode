package secao11;

public class loopsB {
    
    public static void main(String[] args) {

          // 8 - Loops com rótulos

          //Rótulos internos e externos
          externo:
          for(int i = 0; i < 3; i++){

            for(int j = 0; j < 5; j ++){

                if(i == 1 && j == 1){
                    break externo;

                }

                System.out.println("i " + i + ", j" + j);
            }

          }


          for(int i = 0; i < 5; i++){

            System.out.println("Externo: " + i);

            interno:
            for(int j = 0; j < 3; j ++){

                if(j == 2){
                System.out.println("Parou interno");
                break interno;
            }


                System.out.println("i " + i + ", j" + j);
            }

        
    }

    // 9 - loops off by one

    // [1, 2, 3, 4]
    // loop tem q rodar 4 vezes

    // se roda 5 ele acessa um elemento inválido, ele gera um erro no software
    //associar o loop a quantidade de elementos

    //Executar um loop 5 vezes
    for(int i = 0; i <= 5; i ++){

        System.out.println("I: " + i);

    }

    }
}

