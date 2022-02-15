
package Clases;

public class Marca {
    private int idMarca;
    private String nombre;
    private String idCategoria;
 
    public Marca() {
    }

    public Marca( int idMarca, String nombre, String idCategoria) {
        this.idMarca = idMarca;
        this.nombre = nombre;
        this.idCategoria = idCategoria;
    }

    
    
    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "Marca{" + "idMarca=" + idMarca + ", nombre=" + nombre + ", idCategoria=" + idCategoria + '}';
    }

     public void insertMarca(){
         
    }

     public void updateMarca(){
        
    }

     public void deleteMarca(){
       
    }
    
}
