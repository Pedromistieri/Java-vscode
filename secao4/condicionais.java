package secao4;

public class condicionais {

    public static void main(String[]args){
    
        //1- Boolean
boolean isTrue = true;

boolean isFalse = false;

//System.out.println(isTrue);

//System.out.println(isFalse);

//2-Operadores de comparação

int x = 10;

System.out.println(x == 10);
System.out.println(x > 10);
System.out.println(x >= 10);
System.out.println(x < 10);
System.out.println(x <= 10);
System.out.println(x != 11); //!= 'Significa diferente de'

// 3 - Atribuição e comparação

int n = 5;
int m = 10;
System.out.println(n == 12);
System.out.println(n);
System.out.println(n == m);


/*4- Comparação de Strings
 * equals() compara o conteúdo das strings
 * equalsignoreCase() variante de equals() que ignora diferenças entre maiúsculas e minúscula.
 * 
 */
String str1 = "java";
String str2 = new String("java");

System.out.println(str1);
System.out.println(str2);

System.out.println(str1 == str2);

System.out.println(str1 == "java");

System.out.println(str1.equals(str2));

System.out.println(str1.equals("java"));

String str3 = "JAVA";

System.out.println(str1.equals(str3));

//java == JAVA (false) > java == java
System.out.println(str1.equalsIgnoreCase(str3));

//5 - IF
int numero = 10;

//baseado em uma comparação, eu executo algo
if(numero > 15) {

    System.out.println("O número é maior que 5");
}

//if com strings
String texto = "Teste";

//Se a função retorna um booleano eu posso usar no if

if(texto.equals("Teste")) {

    System.out.println("O texto é: Teste");


}

// Declaração do if(comparação ou retorno de booleano) {O que srá executado...}

// 6 - else
int q = 7;

if(q > 10){
    System.out.println("q é maior que 10!");

}else{
    System.out.println("Coloque um número maior que 10!");
}

// Todo else precisa de um if, mas nem todo if precisa de um else

if(texto.equals("Teste2")){
    
    System.out.println("O tesxto é: teste");
} else{

    System.out.println("O texto não é igual");
}

double nota = 10;
if(nota == 10){
    System.out.println("Parabéns você tirou nota máxima, parabéns!");

}else if (nota >= 9) {

    System.out.println("Nota muito boa, parabéns!");

}else if(nota >= 7){
    System.out.println("Nota na média, cuidado..");
} else{
    System.out.println("Sua nota foi abaixo da média, melhore!");
}

int num = 5;

if(num > 3 && num < 5){
    System.out.println("Alguma coisa");

} else if(num == 5){
    System.out.println("Outra coisa");
}
// Escolha a situação que você quer que mais ocorra
// Melhorar a lógica, deixe a comparação mais específica

//1 - condicional ternária
int numeroa = 101;
String  resultado = ( numeroa % 2 == 0) ? "par" : "impar";

System.out.println(resultado);

// condicional ternária sintaxe = ?expressão 1 : expressão 2
// se for verdadeira  retorna expressão 1 e se for falsa retorna expressão 2
// CONDIÇÃO x > 5 ? EXPRESSÃO  SE É TRUE "OK" : EXPRESSÃO SE É FALSE "NÃO OK"

// IF ENCADEADO
int idade = 18;
boolean temCarteira = true;

if(idade >= 18){
    if(temCarteira){
        System.out.println("Pode dirigir!");

    }else{
        System.out.println("Precisa de habilitação para dirigir");
    }
}else{
    System.out.println("menor de idade, não pode dirigir!");
}

//  3 - Ordem de precedência dos operadores lógicos
/*o parenteses () tem a maior ordem de precedência
 * depois vem o NOT "!"
 * Em terceiro vem o AND "&&""
 * por último vem o O "||"
 */
boolean a = true;
boolean b = false;
boolean c = true;

// true and false =>  false and true = true
boolean resultado2 = a && b || c;
System.out.println(resultado2);


// TRUE OU FALSE = TRUE AND TRUE = TRUE
boolean resultado3 = a || b && c;
System.out.println(resultado3);

// NOT(TRUE OU FALSE) FALSE AND TRUE = FALSE
Boolean resultado4 = !(a || b) && c;
System.out.println(resultado4);

//(NOT TRUE OR FALSE) AND TRUE
//(FALSE OR FALSE) AND TRUE
//FALSE AND TRUE
//FALSE
boolean resultado5 = (!a||b) && c;
System.out.println(resultado5);


}

    }

