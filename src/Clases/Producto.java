
package Clases;

public class Producto {
    private int idProducto;
    private String nombre;


    public Producto() {
    }

    public Producto( int idProducto, String nombre) {

        this.idProducto = idProducto;
        this.nombre = nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String añadirProducto(String nombre){
        return nombre ;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + '}';
    }

    public void insertProducto(){
         
    }

    public void updateProducto(){
        
    }

    public void deleteProducto(){
       
    }
    
    
    
}
