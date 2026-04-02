import java.util.Scanner;

public class CenarioA {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double pulsacao;

        System.out.println("Digite os batimentos por minuto: ");
        pulsacao = leia.nextDouble();
       
        if (pulsacao < 60) {
            System.out.println("Bradicardia");
        } else if (pulsacao >= 60 && pulsacao <= 100) {
            System.out.println("Normal");
        } else {
            System.out.println("Taquicardia");
        }

        leia.close();
    }
}


     
     //Desenvolva a lógica de classificação de risco por pulsação. Se a pulsação for menor que 60, o sistema exibe “Bradicardia”; se estiver entre 60 e 100, exibe “Normal”; e se for acima de 100, exibe “Taquicardia”. Lembre-se da ordem das perguntas para não gerar conflitos.