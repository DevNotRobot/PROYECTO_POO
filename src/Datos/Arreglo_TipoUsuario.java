package Datos;

import Clases.TipoUsuario;

/**
 *
 * @author zrisan
 */
public class Arreglo_TipoUsuario {
    TipoUsuario vec[] = new TipoUsuario[100];
    int indice;
    
    public Arreglo_TipoUsuario() {
        vec[0]= new TipoUsuario(1001, "Administrador");
        vec[1]= new TipoUsuario(1002, "Cajero");
        indice=2;
    }
    
     public int tamaño(){
        return indice;
    }
    public TipoUsuario obtener(int pos){
        return vec[pos];
    }

    
    public void agregar(TipoUsuario ep){
        vec[indice]=ep;
        indice++;
    }
}
