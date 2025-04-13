package secao17;

public class pessoa {

    private String nome;
    private int idade;

    public pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    // override - sobrescrita
    @Override
    public String toString(){
        return "Nome: " + nome + ", idade: " + idade;

    }

    
}
