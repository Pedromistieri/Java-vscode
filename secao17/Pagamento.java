package secao17;

interface Pagamento {

    //métoddo abstrato

    void processarPagamento(double valor);

    //método default
    default void exibirRecibo(double valor){
        System.out.println("Recibo do pagamento, com valor R$ " + valor);
    }


    
}
