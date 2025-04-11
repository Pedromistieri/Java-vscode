package secao17;

public class Motor {
    private int potencia;
    private String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void exibirInfo() {
        System.out.println("Motor tipo: " + tipo + ", potência: " + potencia + "cv");
    }
}

