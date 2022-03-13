package bancodigital;

public class Main {
    public static void main(String[] args) {
        Cliente victor = new Cliente();
        victor.setCpf("435.467.275-43");
        victor.setNumeroCel("11986545265");
        victor.setNome("Victor");

        Conta cc = new ContaCorrente(victor);
        Conta poupanca = new ContaPoupanca(victor);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        cc.recargaCel(20, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        System.out.println(victor);

    }
}
