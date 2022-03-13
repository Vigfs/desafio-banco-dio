package bancodigital;

public interface Iconta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato ();

    void recargaCel (double valor, Conta contaDestino);

}
