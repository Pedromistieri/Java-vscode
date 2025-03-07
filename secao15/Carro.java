package secao15;

public class Carro {
    
    //Atribrutos e propriedades
    String marca;
    String modelo;
    int ano; // 2010

    //Métodos
    void acelerar(){
        System.out.println("Estamos acelerando o carro!");

    }

    void exibirInfo(){
        System.out.println("Marca :" + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}
