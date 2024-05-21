package bancoDigitalOO;

import bancoDigitalOO.entities.Corrente;
import bancoDigitalOO.entities.Poupanca;
import bancoDigitalOO.entities.Usuario;

public class Main {
    public static void main(String[] args) {

        Corrente conta1 = new Corrente(1L,"SSDB",
                new Usuario("Diogo",20),2000.00);

        Poupanca conta2 = new Poupanca(2L,"SSAX",
                new Usuario("Bruno", 23), 5000.00);

        conta1.imprimirInformacoes();
        conta1.depositar(200.20);
        conta1.sacar(2400.00);
        conta1.imprimirInformacoes();


//        conta2.imprimirInformacoes();
//        conta2.depositar(200.20);
//        conta2.sacar(5400.00);
//        conta2.imprimirInformacoes();

    }
}
