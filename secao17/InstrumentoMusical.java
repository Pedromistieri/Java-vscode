package secao17;

abstract class InstrumentoMusical {

    protected String nome;

    public InstrumentoMusical(String nome){
        this.nome = nome;
    }

    //Tem que ser implementado na subclasse
    public abstract void tocar();

    // concreto: pode ser herdado
    public void exibirDetalhe(){
        System.out.println("Instrumento: " + nome);
        
    }
    
    
}
