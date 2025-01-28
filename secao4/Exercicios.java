package secao4;
import java.util.Scanner;




public class Exercicios {
    
    public static void main(String[]args){ 
        //Exercício 1
        Scanner scanner = new Scanner(System.in);

      //  System.out.println("Insira o preço do produto: ");

       //double preco = scanner.nextDouble();

      // if(preco < 50  ){
       // System.out.println("Este produto está bem barato!");
      // }else if (preco >= 50 &&  preco <= 100 ){
       // System.out.println("Este produto está na média");

      // }else{
       // System.out.println("Este produto está caríssimo!");
      // }

       // Exercíco 2 

      // System.out.println("Ensira o nome de usuário: ");

       //String usuario = scanner.next();

       //System.out.println("Digite a senha do usuário ");

      // String senha = scanner.next();

       //String => equals

     // if(usuario.equals("admin") && senha.equals("1234")){

       // System.out.println("Acesso permitido.");


      // }else{
        //  System.out.println("Acesso negado");

      // }

//Exercíco 3

//System.out.println("Digite um número: ");

//int numero = scanner.nextInt();

//String resultado = "";

//if (numero % 2 == 0) {
   // resultado = "par";
//}else{
  //  resultado = "ímpar";
//}
//System.out.println("O número é : " + resultado );

       //Exercício 4
       System.out.println("Insira um número de 1 a 7 (Refenete aos dias da semana): ");

      int dia = scanner.nextInt();
      switch (dia) {
        case 1:
        case 7:
        System.out.println("Final de semana");
            
            break;


            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            System.out.println("Dia de semana");
            break;

       default:
        System.out.println("Número invalido");
            break;
      }

       }



       



       }

       


       
    
