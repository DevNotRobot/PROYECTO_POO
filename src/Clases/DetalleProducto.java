
package Clases;

public class DetalleProducto {


    private String descripcion;
    private double precio;
    private int stock;
    private String color;
    private String talla;
    private String estado;
    private int idProducto;
    private int idCompra;

    public DetalleProducto() {
    }

    public DetalleProducto( String descripcion, double precio, int stock, String color, String talla, String estado, int idProducto,  int idCompra) {
              
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.color = color;
        this.talla = talla;
        this.estado = estado;
        this.idProducto = idProducto;
      
        this.idCompra = idCompra;
    }

    
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public void insertDetalleProducto(){
         
    }

     public void updateDetalleProducto(){
        
    }

     public void deleteDetalleProducto(){
       
    }

    

}