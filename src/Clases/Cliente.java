
package Clases;

public class Cliente extends Persona {
        private int idCliente;
        private int idPersona;
        private static int cuenta=1000;

        
        
    public Cliente(String nombre, String tipoDocumento, String nroDocumento, String telefono) {
        super( nombre, tipoDocumento, nroDocumento, telefono);
        this.idCliente = cuenta++;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
     public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int aCuenta) {
        cuenta = aCuenta;
    }
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
}
