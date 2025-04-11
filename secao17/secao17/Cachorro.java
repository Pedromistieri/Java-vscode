package secao17;

public class Cachorro extends Animal {

    // é obrigado usar as propriedades da classe pai - super
    public Cachorro(String nome ){
        super(nome);
    }

    public void latir(){
        System.out.println(nome + " está latindo! ");
    }
    
}
