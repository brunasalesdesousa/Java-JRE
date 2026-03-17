import java.util.Scanner;

public class iApp {
    
    public static void main(String[] args) {
    
    double peso;
    double altura;
    double imc;

    Scanner leia = new Scanner(System.in);

    System.out.println("Digite seu peso  :" );
    peso = leia.nextDouble();

    System.out.println("Digite sua altura  :");
    altura = leia.nextDouble();

    imc = peso / (altura * altura);

    System.out.println("Seu imc é  :" +imc);

    leia.close();
    

    }
    

    
}

    

