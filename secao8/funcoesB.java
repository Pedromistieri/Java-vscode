package secao8;

public class funcoesB {

    public static void main(String[] args) {
        
        // 5 - funções com condicionais
        String r1 = verificarAcesso(19, true, true);

        System.out.println(r1);

        String r2 = verificarAcesso(25, false, true);

        System.out.println(r2);






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

    
    
}
