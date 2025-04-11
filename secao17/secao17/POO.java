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

    }
}
