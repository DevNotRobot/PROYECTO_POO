
package Clases;

public class Categoria {
    private int idCategoria;
    private String nombre;
    private static int cuenta=1000;

    public Categoria() {
    }

    public Categoria( String nombre) {
        this.idCategoria = cuenta++;
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return idCategoria;
    } 
    

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     public void insertCategoria(){
         
    }

     public void updateCategoria(){
        
    }

     public void deleteCategoria(){
       
    }
}
