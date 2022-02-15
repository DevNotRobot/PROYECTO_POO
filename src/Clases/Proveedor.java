
package Clases;

public class Proveedor {
    private int idProveedor;
    private String razonSocial;
    private String ruc;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String razonSocial, String ruc, String telefono) {
        this.idProveedor = idProveedor;
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.telefono = telefono;
    }
    
    

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", razonSocial=" + razonSocial + ", ruc=" + ruc + ", telefono=" + telefono + '}';
    }

    public void insertProveedor(){
         
    }

    public void updateProveedor(){
        
    }

    public void deleteProveedor(){
       
    }

}
