package secao8;

public class Exercicios {

        public static void main(String[] args) {

    // Ex1  Converter temp celcius para fahrenheit
    double celcius = 25.0;
    double fahrenheit = converterTemperatura(celcius);
    System.out.println("A temperatura de " + celcius + " c é equivalente a " + fahrenheit + " F");

    //Ex 2 Função para calcular fatorial de um número
    System.out.println("O fatorial de 10 é: " + calcularFatorial(10));




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

}

