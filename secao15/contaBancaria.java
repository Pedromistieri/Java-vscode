package secao15;

public class contaBancaria {

    private String titular;
    private double saldo;

    public void setTitular(String titular){

        //lógica para validar ou manipular
        if(titular != null  && !titular.isEmpty()){

            this.titular = titular;

        }else{
            System.out.println("Nome do titular é invalido");
        }

    }

    public void setSaldo(double saldo){

        if(saldo >= 0){
            this.saldo = saldo;
            
        }else{
            System.out.println("O valor precisa ser positivo");
        }

    }
    public void exibirInfo(){

        System.out.println("Titular: " + titular +  ", Saldo: R$" + saldo);
            
    }

    public String getTitular(){

        return titular;

    }

    public String getSaldo(){
        return "R$ " + saldo;
    }
    
}
