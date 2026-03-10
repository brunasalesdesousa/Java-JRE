import java.util.Scanner;

public class produtoComEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int produto;

        System.out.println("Digite o primeiro número inteiro: ");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        numero3 = scanner.nextInt();

        produto = numero1 * numero2 / numero3;

        System.out.println("O produto dos numeros é: " + produto);

        scanner.close();
    }
}
