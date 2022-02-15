package Datos;

import Clases.Usuario;

/**
 *
 * @author zrisan
 */
public class Arreglo_Usuario {
    Usuario vec[] = new Usuario[100];
    int indice;
    
    public Arreglo_Usuario(){
        vec[0]= new Usuario( "Juan@utp.com", "1234", "ACTIVO",1000);
        vec[1]= new Usuario("Karla@utp.com","1234","ACTIVO",1001);
        vec[2]= new Usuario("Kevin@utp.com","1234","ACTIVO",1002);
        
        indice=3;
    }
    
    public int tamaño(){
        return indice;
    }
    
    public int genCodigo(){
        if(indice==0){
            return 1000;
        }else{
            return vec[indice-1].getIdUsuario()+1;
        }
    }
    
    public Usuario obtener(int pos){
        return vec[pos];
    }
    
    public void adicion(Usuario usu){
        vec[indice]=usu;
        indice++;
    }
    
    public Usuario busca(int cod){
        Usuario bus=null;
        for (int f=0;f<indice;f++){
            //comparar el codigo q esta en la tavbla con el codigo que esta passando
            if(vec[f].getIdUsuario()==cod){
                bus=vec[f];break;
            }
        }
        return bus;
    }
}
