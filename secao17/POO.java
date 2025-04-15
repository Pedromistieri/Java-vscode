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

    }
}
