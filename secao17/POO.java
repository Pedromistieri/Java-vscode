package secao17;

public class POO {
    public static void main(String[] args) {
        Motor motor1 = new Motor(450, "V8");
        Carro carro1 = new Carro("Ford", "Mustang", motor1);
        carro1.exibirInfo();

        // 2 - Herança
        Cachorro Bruna = new Cachorro("Bruna");
        Bruna.latir();
        Bruna.emitirSom();

        Animal leao = new Animal("Shark");

        leao.emitirSom();

        // a subclasse tem acesso  a tudo da classe superclasse
        // e a superclasse não tem acesso a classe filha

        // 3 -  Calsse object
        pessoa Pedro = new pessoa("Pedro", 23);
        pessoa Matheus = new pessoa("Matheus", 33);

        System.out.println(Pedro.toString());
        System.out.println(Matheus.equals(Pedro));
        System.out.println(Pedro.hashCode());

        // 4 - Override 
        Quadrado q1 = new Quadrado(4);
        Circulo c1 = new Circulo(3.2);

        System.out.println(q1.calcularArea());
        System.out.println(c1.calcularArea());

        // 5 - Super
        Funcionario funcionario = new Funcionario("Pedro", 1980);

        Gerente gerente = new Gerente("Marcos",5000,1000);

        funcionario.exibirDetalhe();
        gerente.exibirDetalhe();

        System.out.println(funcionario.calcularBonus());

        System.out.println(gerente.calcularBonus());

        // 6 - Classe abstrata
        InstrumentoMusical Violao = new Violao("violão");
        InstrumentoMusical Bateria = new Bateria("Bateria");

        Violao.exibirDetalhe();
        Bateria.exibirDetalhe();

        Violao.tocar();
        Bateria.tocar();

        // 7 - Interfaces
        Pagamento cartao = new CartaoCredito();
        Pagamento transf = new TransferenciaBancaria(); 

        cartao.processarPagamento(100);
        cartao.exibirRecibo(100);

        transf.processarPagamento(250);
        transf.exibirRecibo(250);

            
    


    }
}
