package secao15;

public class Carro {
    
    //Atribrutos e propriedades
    String marca;
    String modelo;
    int ano; // 2010

    double velocidadeAtual = 0;
    boolean motorLigado = false;

    //Métodos
    void acelerar(){
        System.out.println("Estamos acelerando o carro!");

    }

    void exibirInfo(){
        System.out.println("Marca :" + marca + ", Modelo: " + modelo + ", Ano: " + ano);


    }

    // 3 - Métodos
    void ligarMotor(){

        if(!motorLigado){
            motorLigado = true;
            System.out.println("Ligando o motor...");


        }else{
            System.out.println("O motor já está ligado");
        }

    }

    void aumentarVelocidade(double incremento){
        if(motorLigado){

            velocidadeAtual += incremento;
            System.out.println("A velocidade atual é: " + velocidadeAtual);

        }else{
            System.out.println("Precisa ligar o motor");
        }
    }

}
