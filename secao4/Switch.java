package secao4;

public class Switch {

    public static void main(String[]args){

        // 11 - Switch Case e Break

//Switch case para validar dia da semana baseado no número
// 1 = Domingo
// 7 = Sábado

int diaDaSemana = 4;
switch (diaDaSemana) {

    case 1:
    System.out.println("Domingo");
    break;

    case 2:
    System.out.println("Segunda-Feira");
    break;

    case 3:
    System.out.println("Terça-Feira");
    break;

    case 4:
    System.out.println("Quarta-Feira");
    break;

    
}

// if (diaDaSemana == 1) {} else if (diaDaSemana == 2) {}....

//12 - default = default é o else do switch

int n = 10;

switch (n) {
    case 1:
        System.out.println("É 1");
        break;
    case 2: 
        System.out.println("É 2");
        break;
    default:
      System.out.println("Número não encontrado");
        break;







}



// 13 switch sem break

 switch (1) {

    case 1:
    System.out.println("Executou 1");
    break;

    case 2:
    System.out.println("Executou 2");
    break;

    case 3:
    System.out.println("Executou 3");
    break;

    default:
    System.out.println("Executou 4");
    break;
 }
}
}

    


