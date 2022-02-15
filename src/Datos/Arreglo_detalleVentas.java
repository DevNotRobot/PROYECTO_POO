
package Datos;

import Clases.Ventas;
import Clases.DetalleVentas;
import Clases.Persona;


public class Arreglo_detalleVentas {
    DetalleVentas vec[]=new DetalleVentas[100];
    int indice;

    public Arreglo_detalleVentas(){
        vec[0]= new DetalleVentas(50, 20.50, "001");
        vec[1]= new DetalleVentas(60, 30.40, "002");
        vec[2]= new DetalleVentas(70, 105.50, "003");
        vec[3]= new DetalleVentas(80, 150.30, "004");
        vec[4]= new DetalleVentas(90, 170.40, "005");
        indice=5;

    }

    public int tamaño(){
        return indice;
    }
    
    
    public DetalleVentas obtener(int pos){
        return vec[pos];
    }
       
    public void agregar(DetalleVentas ep){
        vec[indice]=ep;
        indice++;
    }
    public void adiciona(DetalleVentas p){
        vec[indice]=p;
        indice++;
  
    }
  
}
