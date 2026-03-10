public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("TESTE DA REGRA DE DESCONTO\n");
        

        // Unidade 2 - aula 6 - atividade 2

        // Caso 1: premium  = sim, valor = 200
        testarCaso("caso1", true, 200.00, 15);

        // Caso 2: premium  = não, valor = 200
        testarCaso("caso2", false, 200.00, 15);

        // Caso 3: premium  = sim, valor = 199.99
        testarCaso("caso3", true, 199.99, 0);

    }   
    public static void testarCaso(String nomeCaso, boolean premium, double valorCompra,int descontoEsperado) {
        double percentualDesconto = 0;

        if (valorCompra >= 200) {
            if (premium) {
                percentualDesconto = 15;
            } else {
                percentualDesconto = 5;
            }     
        } else {
            percentualDesconto = 0;
        }

        double valorFinal = valorCompra - (valorCompra * percentualDesconto / 100);

        System.out.println(nomeCaso);
        System.out.println("Cliente premium: " + premium);
        System.out.println("Valor original: " + valorCompra);
        System.out.println("Desconto esperado: " + descontoEsperado + "%");
        System.out.println("Desconto aplicado: " + percentualDesconto + "%");
        System.out.println("Valor final: R$ " + String.format("%.2f, valorFinal"));
        System.out.println("-------------------------------------");
    }
}
