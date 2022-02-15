package Clases;

public class Persona {
    private int idPersona;
    private String nombre;
    private String tipoDocumento;
    private String nroDocumento;
    private String telefono;
    private static int cuenta=1000;

    public Persona(String nombre, String tipoDocumento, String nroDocumento, String telefono) {
        this.idPersona = cuenta++;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.telefono = telefono;
    }

    
    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", tipoDocumento=" + tipoDocumento + ", nroDocumento=" + nroDocumento + ", telefono=" + telefono + '}';
    }
    
    
}
