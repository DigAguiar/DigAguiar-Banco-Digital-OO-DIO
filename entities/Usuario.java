package bancoDigitalOO.entities;

public class Usuario {

    private String nomeUsuario;
    private int idadeUsuario;

    public Usuario(String nomeUsuario, int idadeUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.idadeUsuario = idadeUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getIdadeUsuario() {
        return idadeUsuario;
    }

    public void setIdadeUsuario(int idadeUsuario) {
        this.idadeUsuario = idadeUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", idadeUsuario=" + idadeUsuario +
                '}';
    }
}
