package Clases;

/**
 *
 * @author zrisan
 */
public class TipoUsuario {
    private int idTipoUsuario;
    private String tipo;

    public TipoUsuario() {
    }

    public TipoUsuario(int idTipoUsuario, String tipo) {
        this.idTipoUsuario = idTipoUsuario;
        this.tipo = tipo;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
