package secao2;

public class variavel {
    public static void main(String[] args) {
        
        // 1 - O que são variáveis
        // tipo -> nome -> -> valor;
        String nome = "João";

        // nome  -> "Pedro"
        System.out.println(nome);

        // 2- Atribuição de variável com outra
        String teste = "teste";

        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 999999999999999999L;
        // Quando se usa o long deve se colocar um L no final do número

        //int numeroGrandeDois = numeroGrande;

        System.out.println(numeroGrande);
        //concatenar = unir textos!

        // 4 -Strings
        String firstName = "Pedro";
        String lastName = "Augusto";

        System.out.println("Pedro Augusto");

        System.out.println(firstName + " " + lastName);

        System.out.println("O nome dele é:"  + firstName);

        String fullName = firstName + " " + lastName;
        //Concatenação  = operador + nas strings , para uni-las
        System.out.println(fullName);

        // 5 - char
        char letra = 'A';

        System.out.println(letra);

        char simbolo = '%';

        System.out.println(simbolo);

        //6 - int = Armazenar números inteiros

        int n = 42;
     System.out.println(n + 5);
     System.out.println(n / 5);  
     System.out.println(n * 5);  

     int soma = n + 12;
     System.out.println(soma);

     /*7 - Long usado para armazenar números inteiros muito grandes
     Ele ocupa 8 bytes de memória
     Ideal para cálculos de financeiro e de tempo.
     */ 
    long populaçãoMundial = 780000000000L;
    System.out.println(populaçãoMundial);

    long grandeNumero = 1_000_000L;
    System.out.println(grandeNumero + 10000000);

    /*8- double 
É um tipo de dado primitivo usado para armazenar números de ponto flutuante com dupla precisão
 */ 
double preco = 19.99;

System.out.println(preco);

System.out.println(preco - 12);

System.out.println(preco * 2);

double pi = 3.141_592_123;

System.out.println(pi);

// 9 - Operadores Aritméticos
// Módulo(%): Resto da divisão de dois valores.
int soma2 = 12 + 5;
System.out.println(soma2);

System.out.println(10 - 5);

System.out.println(10 * 5);

System.out.println(10 / 5);
// para ter um resultado quebrado (1,5), pelo menos um 1 número da divisão tem que ser double
System.out.println(10.0/3);

System.out.println(10 % 3);

/*incremento(++): incrementa o valor de uma variável em 1; 
Decremento(--):Decremento o valor de uma variável em 1;
Atribuição aditiva(+=): Some e atribui o resultado a uma variável;
Atribuição subtrativa(-=); Subtrai e atribui o resultado a uma variável;
*/ 
int x = 5;
x++;
x++;
x++;
x++;
System.out.println(x);

int y = 5;
y--;
System.out.println(y);

int a = 10;
a += 5;
System.out.println(a);

int b = 10;
b -= 5;
System.out.println(b);

b -= a;
System.out.println(b);


//11 - type cAsting

//implicito (Widening)

int  numero2 = 42;

long numerolong = numero2;

double numeroDouble = numero2;

System.out.println(numerolong);

System.out.println(numeroDouble);

//Explicito (narrowing)
double valorDouble = 9.75;

int valorInt = (int) valorDouble;

System.out.println(valorInt);

//casting de chaar para int

//char letraA = 'A';
//int codigoAscii = (int) letra2;

//System.out.println(codigoAscii);

// Exercício 1
int valorOriginal = 10;
int valorDobrado = valorOriginal * 2;
System.out.println(valorDobrado);

//Exercício 2
char letra1 = 'B';
int codigoAscii = (int) letra1;

System.out.println(codigoAscii);

//Exercício 3

double valorDouble1 = 15.75;
double valorDouble2 = 20.40;
double soma3 = valorDouble1 + valorDouble2;
System.out.println(soma3);

//Exercício 4
long valorLong = 2_000_000_000L;

int valorInt2 = (int) valorLong;
System.out.println(valorInt2);

//Exercicio 5
String Saudacao = "Olá mundo!";
String mensagem = Saudacao + " Bem vindo ao java";
System.out.println(mensagem);

// 12 - constantes
final int DIAS_DA_SEMANA = 7;
System.out.println("Dias da semana: " + DIAS_DA_SEMANA);

//13 - Var
var z = 10;
System.out.println(z);

// z teste
z = 5;

var texto2 = "teste";

var doubleTeste = 2.0;

System.out.println(texto2);

System.out.println(doubleTeste);

/*14 - Scanner 
nextLine() : Lê uma linha inteira de texto
nextInt() : Lê um valor inteiro
nextDouble() : Lê um valor decimal
next() : Lê uma palavra.
*/ 
    
         
        
         

    


       
    }

}
