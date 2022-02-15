
package Clases;

public class Empleado extends Persona{

    private int idEmpleado;
    private int idPersona;
    private String cargo;
    private String estado;
    private int idUsuario;
    private static int cuenta=1000;

    public Empleado( String cargo, String estado, int idUsuario, String nombre, String tipoDocumento, String nroDocumento, String telefono) {
        super( nombre, tipoDocumento, nroDocumento, telefono);
        this.idEmpleado = cuenta++;
        this.cargo = cargo;
        this.estado = estado;
        this.idUsuario = idUsuario;
    }

    
    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int aCuenta) {
        cuenta = aCuenta;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }


}
