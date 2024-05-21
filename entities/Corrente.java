package bancoDigitalOO.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Corrente extends Conta{

    private double limite;

    public Corrente(Long idConta, String agenciaConta, Usuario usuarioConta, double saldoConta ) {
        super(idConta, agenciaConta, usuarioConta, saldoConta);
        this.limite = 500.00;
        System.out.print("Limite iniciado em $" + getLimite() + "\n");
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Limite -> " + getLimite() + "\n");
    }


    public void depositar (double valorDeposito) {
        super.depositar(valorDeposito);
    }

    @Override
    public void sacar (double valorSaque) {
        if (getSaldoConta() > valorSaque) {
            setSaldoConta(getSaldoConta()-valorSaque);
            System.out.println("Valor da conta suficiente, saque realizado com sucesso.");
        }else if ( (getSaldoConta() + getLimite()) >= valorSaque ) {

            System.out.println(valorSaque- getSaldoConta());
            BigDecimal bd = new BigDecimal(valorSaque - getSaldoConta());
            bd = bd.setScale(2, RoundingMode.HALF_UP);

            double temp = bd.doubleValue();
            setSaldoConta(0);

            setLimite( (getLimite() - temp) );
            System.out.println("Saque realizado, com uso do limite");
        } else {
            System.out.println("Valor de saque além do limite.");
        }

    }

    public void aumentarLimite (double limite) {
        this.limite += limite;
        System.out.println("Limite aumentado -> " + this.limite);

    }

    public void diminuirLimite (double limite) {
        if (this.limite < limite) {
            System.out.println("Limite insuficiente para diminuicao!");
        }else {
            this.limite -= limite;
            System.out.println("Limite diminuido em -> " + limite);
        }
    }


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
