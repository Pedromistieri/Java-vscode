package secao15;

public class produto {

    private String nome;
    private double preco;

    public void setNome(String nome){

        if(nome != null && !nome.isEmpty() && nome.length() > 3){
            this.nome = nome;
        }else{
            System.out.println("O nome enviado não atende os critérios.");
        }
    }

    public String getNome(){
        return nome.toUpperCase();
    }

    public void setPreco(double preco){
        if(preco > 0 ){
            this.preco = preco;
        }else {
            System.out.println("O preço precisa ser positivo.");

        }
    }

    public String getPreco(){
        return String.format("R$%.2f", preco);
    }

   
    public String getProdutoInfo(){
        return "Nome: " + this.getNome() + ", Preço: " + this.getPreco();
    }

    public void aplicarDesconto(double porcentaem){

        if(porcentaem > 0 && porcentaem <= 100){

            double desconto =  calcularDesconto(porcentaem);

           double precoFinal = this.preco - desconto;

           this.setPreco(precoFinal);

            System.out.println("Desconto de " + porcentaem + "% aplicado!");

            System.out.println(this.getProdutoInfo());

        }else{
            System.out.println("Porcentagem inválida.");
        }

    }
    private double calcularDesconto (double porcentaem){

        return(this.preco * porcentaem)/ 100;
    }
}
