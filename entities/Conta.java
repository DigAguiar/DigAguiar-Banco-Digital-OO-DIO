package bancoDigitalOO.entities;

public class Conta {

    private final Long idConta;
    private String agenciaConta;
    private Usuario usuarioConta;
    private double saldoConta;


    public Conta(Long idConta, String agenciaConta, Usuario usuarioConta, double saldoConta) {
        this.idConta = idConta;
        this.agenciaConta = agenciaConta;
        this.usuarioConta = usuarioConta;
        this.saldoConta = saldoConta;
    }

    public void imprimirInformacoes () {
        System.out.println("Id da conta -> " + getIdConta() + "\n" +
                "Agencia -> " + getAgenciaConta() + "\n" +
                "Usuario -> " + getUsuarioConta() + "\n" +
                "Saldo -> " + getSaldoConta());
    }

    public void depositar (double valorDeposito) {
        setSaldoConta(getSaldoConta() + valorDeposito);
        System.out.println("Deposito realizado!");
    }

    public void sacar (double valorSaque) {
        if (valorSaque > getSaldoConta()) {
            System.out.println("Valor de saque não apropriado.");
        }else {
            setSaldoConta(getSaldoConta() - valorSaque);
            System.out.println("Saque realizado com sucesso.");
        }
    }


    public double getSaldoConta() {
        return this.saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Long getIdConta() {
        return idConta;
    }

    public String getAgenciaConta() {
        return agenciaConta;
    }

    public void setAgenciaConta(String agenciaConta) {
        this.agenciaConta = agenciaConta;
    }

    public Usuario getUsuarioConta() {
        return usuarioConta;
    }

    public void setUsuarioConta(Usuario usuarioConta) {
        this.usuarioConta = usuarioConta;
    }
}
