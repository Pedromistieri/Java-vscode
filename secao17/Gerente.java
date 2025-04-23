package secao17;

public class Gerente extends Funcionario {

    private double  bonusAdicional;

    public Gerente(String nome,double salario, double bonusAdicional){
        super(nome, salario);

        this.bonusAdicional = bonusAdicional;
    }
    
    @Override
    public double calcularBonus() {
        return super.calcularBonus() + bonusAdicional;
    }

    @Override
    public void exibirDetalhe(){
        super.exibirDetalhe();
        System.out.println("Bonus adicional de: " + bonusAdicional);
    }

}
