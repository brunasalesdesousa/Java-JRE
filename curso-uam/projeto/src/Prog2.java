import java.util.Scanner;
// unidade 3 - aula 5 
public class Prog2 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        String texto, palavra;

        System.out.println("Digite algum texto:");
        texto = leitor.nextLine();
        System.out.println("O texto está contendo: " +texto.toUpperCase());

        System.out.println("Digite uma palavra:");
        palavra = leitor.nextLine();
        System.out.println("A palavra é: " +palavra.toUpperCase());

        texto = texto.replace("JAVA", palavra);
        System.out.println("O texto está contendo: "+texto);

        //ou : texto = "Alguma coisa";
        // texto = texto.toUpperCase();
        // System.out.println("O texto está contendo: " +texto);

        
    }
}
