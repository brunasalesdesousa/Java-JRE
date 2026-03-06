public class Metodos {
    public static void main(String[] args) {
      // ativarSoneca();   
      String mensagemDoAlarme = agendarAlarme(12, 30); // Argumentos
      System.out.println(mensagemDoAlarme);
    }

    /**
     * Sintaxe de declaração de métodos no Java:
     * <tipo do retorno do metodo> identificador(<tipo> parâmetros) {
     * <bloco de comandos>
     * }
     */
    static void ativarSoneca() {
      System.out.println("Só mais 5 minutinhos :P");
    }

    static String agendarAlarme(int horas, int minutos) { // parâmetros 
        // Seu alarme foi configurado às 12:30
       return "Seu alarme foi configurado às " + horas + ":" + minutos;
    }
}
