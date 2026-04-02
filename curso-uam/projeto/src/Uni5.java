

public class Uni5 {
    
        public static void main(String[] args) {
            double valorCompra = 550.00;
            double desconto = 0;
            double valorFinal;
    
            if (valorCompra >= 500) {
                desconto = 20;
            } else if (valorCompra >= 200) {
                desconto = 10;
            } else {
                desconto = 0;
            }
    
            valorFinal = valorCompra - (valorCompra * desconto / 100);
    
            System.out.println("Valor da compra: R$ " + valorCompra);
            System.out.println("Desconto concedido: " + desconto + "%");
            System.out.println("Valor final: R$ " + valorFinal);
        }
    }

