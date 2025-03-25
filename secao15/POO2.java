package secao15;

import java.util.Arrays;

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
    
        // 2 - Classe imutável 

        PessoasImutavel joaquin = new PessoasImutavel("Joaquin", 23);

        System.out.println(joaquin.getIdade());
        System.out.println(joaquin.getNome());

        //joaquin.nome = "Teste";

         // 3 - Encapsulamento de Arrays

         String[] meusAlunos = {"Matheus", "João", "Maria"};

         Turma novaTurma = new Turma(meusAlunos);

         System.out.println(Arrays.toString(novaTurma.getAlunos()));

         String[] outrosAlunos = {"Aluno 1", "Aluno 2"};

         novaTurma.setAlunos(outrosAlunos);

         System.out.println(Arrays.toString(novaTurma.getAlunos()));


    }

  
}
