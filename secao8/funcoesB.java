package secao8;

public class funcoesB {

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


    
}
