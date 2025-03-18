package secao15;

public class Funcionario {

    String nome;
    protected double salario;
    private String senha;

    public Funcionario(String nome, double salario, String senha){

        this.nome = nome;
        this.salario = salario;
        this.senha = senha;


    }

    public void exibirDados(){
        System.out.println("Nome: " + nome + ", salário: " + salario + " e senha: " + senha);
    }

    protected void aumentarSalario(double porcentagem) {

        this.salario += ((this.salario * porcentagem))/100;
        System.out.println("O salário agora é de: " + salario);

    }

    private boolean verificarSenha(String tentativaSenha) {
        return this.senha.equals(tentativaSenha);
    }

    public boolean autenticar(String tentativaSenha){
        // outras lógicas
        return verificarSenha(tentativaSenha);
    }
    
}
