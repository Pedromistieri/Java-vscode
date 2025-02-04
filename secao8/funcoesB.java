package secao8;

public class funcoesB {

  // Escopo global 
  static int globalVar = 20;

    public static void main(String[] args) {
        
        // 5 - funções com condicionais
        String r1 = verificarAcesso(19, true, true);

        System.out.println(r1);

        String r2 = verificarAcesso(25, false, true);

        System.out.println(r2);

        // 6 - Funções com Switch
        System.out.println(obterDiaDaSemana(3));
        System.out.println(obterDiaDaSemana(10));

        // 7 -System exit
        verificarAutenticacao("Admin", "SenhaSegura");

        System.out.println("Oi!");

        // 8 - Documentação unção
    System.out.println(calcularMedia(5, 6, 7));

    // 9 - Escopos

    // escopo local

    int localVar = 10;

    if(true){
      System.out.println(localVar);
    }

    System.out.println(globalVar);

    escopoLocal(localVar);

    // { } => Abertura e fechamento de chaves, delimitam um escopo, cria um escopo.

    /*11 - Funções matemáticas
     * Math.sqrt(double a): Calcula raiz quadrada de um número
     * Math.pow(double a, double b): Eleva um número "a" a potência "b"
     * Math.abs(int a): Retorna o valor absoluto de um número;
     * Math.max (int a,int b): Retorna o maior de dois números
     * 
    */
    System.out.println(Math.sqrt(26));
    System.out.println(Math.sqrt(9));

    System.out.println(Math.pow(2,4));
    System.out.println(Math.pow(2,3));

    System.out.println(Math.abs(-10));
    System.out.println(Math.abs(10));

    System.out.println(Math.max(20,30));
    System.out.println(Math.max(14,15));

    double raizQuadrada = Math.sqrt(33);
    System.out.println("A raiz quadrada de 33 é: " + raizQuadrada );







  


        






    }

    public static String verificarAcesso(int idade,
     boolean temCarteira,
     boolean temHistoricoNegativo) {
         
       if(idade >= 18 && temCarteira && !temHistoricoNegativo){

        return "Acesso permitido!";

         }else if(idade >= 18 && temCarteira && temHistoricoNegativo) {

            return "Acesso negado : Possui Histórico negativo!";

         }else{
            return "Acesso negado: Critérios não atendidos";
         
         
         }



    }

    public static String obterDiaDaSemana(int dia){

       
          switch(dia){
         case 1:
              return "Segunda feira";
            case 2:
              return "Terça feira";
            case 3:
              return "Quarta feira";
            case 4:
              return "Quinta feira";
            case 5:
              return "Sexta feira";
            case 6:
              return "Sábado";
            case 7:
              return "Domingo";
            default:
              return "Dia inválido";
            
        }

    }

    public static void verificarAutenticacao(String usuario, String senha ){

        if(!usuario.equals("Admin") && !senha.equals("Senha segura")) {
            System.out.println("Autenticação falhou");
            System.exit(1);

        }

        System.out.println("Autenticação bem sucedida!");
    }

    /**
     * 
     * Calcula a média de três números inteiros
     * 
     * @param num1 O primeiro número/nota a ser enviado
     * @param num2 O segundo número/nota a ser enviado
     * @param num3 O terceiro número/nota a ser enviado
     * @return A média dos 3 números
     */

    public static double calcularMedia(int num1, int num2, int num3) {
           
        return (num1 + num2 + num3) /3 ;
    }

    public static void escopoLocal(int a) {
      System.out.println(globalVar);
      System.out.println(a);
    }


    
}
