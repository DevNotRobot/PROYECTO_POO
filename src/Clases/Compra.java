
package Clases;

public class Compra {
    private int idCompra;
    private String fechaCompra;
    private double importe;
    private String comprobanteCompra;
    private String lote;
    private int idProveedor;
    private int idMarca;
    

    public Compra() {
    }

    public Compra( int idCompra, String fechaCompra, double importe, String comprobanteCompra, String lote, int idProveedor, int idMarca) {
        this.idCompra =  idCompra; 
        this.fechaCompra = fechaCompra;
        this.importe = importe;
        this.comprobanteCompra = comprobanteCompra;
        this.lote = lote;
        this.idProveedor = idProveedor;
        this.idMarca = idMarca;
    }
    
    

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getComprobanteCompra() {
        return comprobanteCompra;
    }

    public void setComprobanteCompra(String comprobanteCompra) {
        this.comprobanteCompra = comprobanteCompra;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", fechaCompra=" + fechaCompra + ", importe=" + importe + ", comprobanteCompra=" + comprobanteCompra + ", lote=" + lote + ", idProveedor=" + idProveedor + ", idMarca=" + idMarca + '}';
    }

     public void insertCompra(){
         
    }

     public void updateCompra(){
        
    }

     public void deleteCompra(){
       
    }
    
}
