package secao15;

public class PessoasImutavel {

    private String nome;
        private final int idade;
    
        public PessoasImutavel(String nome, int idade){
    
            this.nome = nome;
            this.idade = idade;
    
        }
    
        public String getNome(){
            this.nome = "Teste";
        return this.nome;

    }

    public int getIdade(){
        return this.idade;
    }

}
