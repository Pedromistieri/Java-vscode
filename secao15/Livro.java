package secao15;

public class Livro {

    private String título;
    private String autor;
    private double preco;
    
    //Estilo fellback
    public Livro() {
        this.título = "O retorno do jedi";
        this.autor = "George Lucas";
        this.preco = 16.99;
    }

    // Estilo Override
        public Livro(String título, String autor, double preco) {
            this.título = título;
            this.autor = autor;
            this.preco = preco;
    

}   

    public void exibirInfo(){
        System.out.println("Título: " + título + ", Autor: " + autor + ", preço: " + preco);
    }
    
}
