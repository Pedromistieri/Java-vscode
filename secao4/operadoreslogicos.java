package secao4;

public class operadoreslogicos {
    
public static void main(String[] args) {
    

    // 8 - AND
    int idade = 18;
    boolean temcarteiraDeMotorista = true;

    //true == true > true(Variável)

    
    System.out.println(idade >= 18 && temcarteiraDeMotorista);
    System.out.println(idade >= 18 && temcarteiraDeMotorista == true);

    boolean carteiraVencida = false;

    System.out.println(idade >= 18 && temcarteiraDeMotorista && carteiraVencida == false );

    int a = 10;
    int b = 20;

    //true && true => true
    if(a > 5 && b > 10){
        System.out.println("Deu certo!");
    }

    //false && true => true (curto circuito)

    if(a > 55 && b > 10){
        System.out.println("Deu certo2");
    }


    //  9 - or para o or basta só um dos lados ser true, tendo 1 true será true
    boolean estaChovendo = false;
    boolean temGuardaChuva = true;

    System.out.println(estaChovendo|| temGuardaChuva);

    System.out.println(10 > 20 || 100 > 200);

   int idade2 = 16;
   boolean eMembro = true;
// o usuário pode participar do clube
// ele precisa ter 16 > 16  anos ou ser membro 

if (idade2 > 16 || eMembro){
    System.out.println("Você pode entrar!");
} else{
System.out.println("Entrada negada!");
}

// 10 - operador not "!"

System.out.println(estaChovendo);

System.out.println(!estaChovendo);

System.out.println(estaChovendo || !temGuardaChuva);

System.out.println(estaChovendo || temGuardaChuva);

System.out.println(!(estaChovendo || temGuardaChuva));

System.out.println((estaChovendo || temGuardaChuva));



}
}