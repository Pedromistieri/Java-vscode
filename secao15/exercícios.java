package secao15;

public class exercícios {

  //Exercício 1 criando uma classe celular  

  public static void main(String[] args) {

    Celular iphone = new Celular();

  iphone.marca = " Apple";
  iphone.modelo = "Iphone 15";

  iphone.ligar();
  iphone.desligar();
  iphone.usar(10);
    

  // Exercício 2 -  Classe aluno com encapsulamento e cosntrutores
  aluno pedro = new aluno("Pedro", 123, 33.3);

  System.out.println(pedro.getNome());

  System.out.println(pedro.getNotaFinal());

  pedro.setNome("Pedro Augusto");

    pedro.setNotaFinal(50.5);

    pedro.exibirInfo();

  }

  

  
}
