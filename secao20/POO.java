package secao20;

public class POO {
    public static void main(String[] args) {
        Motor motor1 = new Motor(450, "V8");
        Carro carro1 = new Carro("Ford", "Mustang", motor1);
        carro1.exibirInfo();
    }
}
