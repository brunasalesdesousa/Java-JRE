public class App {
    public static void main(String[] args)  {
        // Tipos eiros - byte, short, int, long int
        // int numero1 = 1;
        // int numero2 = 2;
        // int soma = numero1 + numero2;
        // System.out.println(soma);

        // Tipos decimais - float, double
        // double numero1 = 1.5;
        // double numero2 = 1.5;
        // operadores aritméticos:
        // 1 - Adição: +
        // 2 - Subtração: - 
        // 3 - Multiplição: *
        // 4 - Divisão: /
        // double soma = numero1 + numero2;
        // System.out.println(soma);

        
        // Char e boolean
        // char operador = '+';

        // double numero1 = 2.5;
        // double numero2 = 2.5;

        // double resultado = soma(numero1, numero2);
        // System.out.println(operador + ":" + resultado);
        
        // boolean ehIgual = numero1 == numero2;
        // System.out.println(ehIgual);
        
        // Tipos primitivos:
        // Valores padrão:
        // int = 0, floats = o.0, doubles = 0.0, booleans = false

        // Tipos de referência:
        //<TipoDaClasse> identificador = new TipoDaClasse(); 
        // valor padrão: null

        Calculadora calculadora = new Calculadora(1.5, 3.5);
        Calculadora calculadora2 = new Calculadora(6.5, 3.5);
        Calculadora calculadora3 = new Calculadora(1.5, 7.5);
        System.out.println(calculadora.soma());
        System.out.println(calculadora2.soma());
        System.out.println(calculadora3.soma());
    }

    static double soma(double numero1, double numero2)  {
        return numero1 + numero2;
    }
}
