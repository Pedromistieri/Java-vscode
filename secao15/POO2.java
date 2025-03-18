package secao15;

public class POO2 {

    public static void main(String[] args) {

         // 1 - níveis de acesso

   Funcionario  funcionario1 = new Funcionario("Pedro", 1520.00, "123");

   funcionario1.exibirDados();

   funcionario1.nome = "teste";
   funcionario1.salario = 2000;
   // funcionario1.senha = "2001";

   funcionario1.exibirDados();

   funcionario1.aumentarSalario(10);

   // System.out.println(funcionario1.verificarSenha());

   if(funcionario1.autenticar("123")) {
    System.out.println("Usuário entrou no sistema");
   }
    
        
    }

  
}
