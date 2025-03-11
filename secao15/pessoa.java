package secao15;

public class pessoa {

    private String nome;
    private int idade;

    public void setNome(String nome){
        //this -> objeto
        this.nome = nome;

}

    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        //this -> objeto
        this.idade = idade;

}

    public int getIdade(){
        return idade;
    }
}
