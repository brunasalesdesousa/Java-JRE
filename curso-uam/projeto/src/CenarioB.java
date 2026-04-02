import java.util.Scanner;

public class CenarioB {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int recepcao;

        System.out.println("Digite a opção desejada: ");
        recepcao = leia.nextInt();

        switch (recepcao) {
            case 1:
                System.out.println("Emergência");
            break;
            case 2:
                System.out.println("Consulta de Rotina");
            break;
            case 3:
                System.out.println("Retirada de Exames");
            break;
            default:
                System.out.println("Opção não Identificada");
            break;
        }
        leia.close();
    }
}

