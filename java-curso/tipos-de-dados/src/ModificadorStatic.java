public class ModificadorStatic {
    public static void main(String[] args) {
        // Static: 
        // 1. Quando não precisamos de objetos!
        // 2. Constants (valores que não mudam, como ex: PI)
        // 3. Classes utilitárias que não dependem de objetos

        // Conta contaJoao = new Conta();
        // Conta contaMaria = new Conta();

        // Conta.depositarContaConjunta(100.0);
        // contaMaria.depositarConta(100.0);

        // System.out.println(Conta.saldoContaConjunta);
        // System.out.println(contaJoao.saldo);
        // System.out.println(contaMaria.saldo);

        // System.out.println(Conta.TAXA_SERVICOS);
        Conta contaJoao = new Conta();
        contaJoao.depositarConta(1.555);
        System.out.println(Math.floor(contaJoao.saldo));
        
    }
}
