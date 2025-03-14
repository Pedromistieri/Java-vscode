package secao15;

public class POO {

    public static void main(String[] args) {

        //1 - criar classe /
        // Criação de carro.java

        //2 - Instancianddo a classe
        Carro fusca = new Carro();

        //Acessar props e metodos
        //NOMEOBJETO.PROP E NOMEBJETO.MÉTODO()
        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.ano = 1964;

        fusca.acelerar();
        fusca.exibirInfo();

        Carro carro2 = new Carro();

        carro2.marca = "Fiat";

        carro2.exibirInfo();
        
        System.out.println(fusca == carro2);

        // 3 - Métodos 
        fusca.aumentarVelocidade(10.0);

        fusca.ligarMotor();

        fusca.aumentarVelocidade(20.0);

        fusca.aumentarVelocidade(30.0);


        System.out.println(fusca.motorLigado);

        // 4 - Criando propriedades
        pessoa joao = new pessoa();

        joao.setNome("joão");

        System.out.println("O nome do joão é: " + joao.getNome());

        joao.setIdade(23);

        System.out.println(joao.getIdade());

        System.out.println("O joão tem " + joao.getIdade() + " Anos");

        // 5 - Setters
        contaBancaria ContaDaAna = new contaBancaria();

        ContaDaAna.setTitular("Ana");

        ContaDaAna.setSaldo(1000);

        ContaDaAna.exibirInfo();

    System.out.println(ContaDaAna.getTitular());

    System.out.println(ContaDaAna.getSaldo());     
    
    // 6 - Lógica em get e set
    produto camisa =  new produto();

    camisa.setNome("Camisa regata");

    System.out.println(camisa.getNome());

    camisa.setPreco(29.999999999);

    System.out.println(camisa.getPreco());

    // 7- Método dentro de método 
        System.out.println(camisa.getProdutoInfo());

        camisa.aplicarDesconto(0);

        // 8 - Constructor 

        Livro meuLivro = new Livro("Harry Potter" , "J K Rowlling", 31.90);
        meuLivro.exibirInfo();

        Livro meuLivro2 = new Livro();

        meuLivro2.exibirInfo();

;    }

}
