public class Prog5 {
    
    public static void main(String[] args) {
        int planoPaciente = 1; // 1: Básico, 2: VIP

switch (planoPaciente) {
    case 1:
        System.out.println("Plano Básico: Acomodação em Enfermaria.");
    case 2:
        System.out.println("Plano VIP: Acomodação em Quarto Privativo.");
        break;
    default:
        System.out.println("Plano não identificado.");
        break;
}
    }
    
}
