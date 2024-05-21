package bancoDigitalOO.entities;

public class Banco {

    private String nomeBanco;
    private String codigoBanco;

    public Banco(String nomeBanco, String codigoBanco) {
        this.nomeBanco = nomeBanco;
        this.codigoBanco = codigoBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }
}
