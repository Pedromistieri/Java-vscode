package secao8;

public class Exercicios {

        public static void main(String[] args) {

    // Ex1  Converter temp celcius para fahrenheit
    double celcius = 25.0;
    double fahrenheit = converterTemperatura(celcius);
    System.out.println("A temperatura de " + celcius + " c é equivalente a " + fahrenheit + " F");

    //Ex 2 Função para calcular fatorial de um número
    System.out.println("O fatorial de 10 é: " + calcularFatorial(10));

    // Ex 3 Função com if-else para verificar Paridade

    System.out.println(verificarParidade(10));
    System.out.println(verificarParidade(101));

    // Ex 4 Função com Switch para classificar notas
    System.out.println(classificarNota(11));
    System.out.println(classificarNota(10));
    System.out.println(classificarNota(8));
    System.out.println(classificarNota(3));





    }

    //Funções 
    public static double converterTemperatura(double celcius){

        return(celcius * 9/5) + 32 ;
    }
    
    public static int calcularFatorial(int numero){

        if(numero == 0 || numero == 1){
            return 1;


        }else{
            return numero * calcularFatorial(numero - 1);

        }
    }

    public static String verificarParidade(int x) {

        if(x % 2 == 0){
            return " O número " + x + " é par! ";

        }else{

            return " O número " + x + " NÃO é par! ";


        }


    }

        public static String classificarNota(int nota){

            if(nota < 0 || nota > 10){
                return "Nota invalida!";
            }

            switch (nota) {
                case 10:
                case 9:
                  return "A";
                case 8:  
                  return "B";
                case 7:  
                  return "C";
                case 6:  
                  return "D";
                 default:
                    return "F";
            }

        }
}

