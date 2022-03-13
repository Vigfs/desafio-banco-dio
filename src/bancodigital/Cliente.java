package bancodigital;

public class Cliente {

    private String nome;
    private String cpf;
    private String numeroCel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroCel() {
        return numeroCel;
    }

    public void setNumeroCel(String numeroCel) {
        this.numeroCel = numeroCel;
    }

    @Override
    public String toString() {
        return "\nCliente: " +
                "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nNumero de Celular: " + numeroCel;
    }
}
