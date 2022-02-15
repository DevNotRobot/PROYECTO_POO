 
package Clases;

/**
 *
 * @author zrisan
 */
public class Usuario {
    
    private int idUsuario;
    private String nombre;
    private String password;
    private String estado;
    private int IdTipoUsuario;
    private static int cuenta=1000;

    public Usuario() {
    }
    
    

    public Usuario( String nombre, String password, String estado, int IdTipoUsuario) {
        this.idUsuario = cuenta++;
        this.nombre = nombre;
        this.password = password;
        this.estado = estado;
        this.IdTipoUsuario = IdTipoUsuario;
    }
    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int aCuenta) {
        cuenta = aCuenta;
    }
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdTipoUsuario() {
        return IdTipoUsuario;
    }

    public void setIdTipoUsuario(int IdTipoUsuario) {
        this.IdTipoUsuario = IdTipoUsuario;
    }
    

    

   
}
