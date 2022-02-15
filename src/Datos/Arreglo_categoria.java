/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Categoria;

/**
 *
 * @author giuse
 */
public class Arreglo_categoria {
    Categoria vec[]=new Categoria[100];
    int indice;
    
    public Arreglo_categoria(){
        vec[0]= new Categoria("Falda");
        vec[1]= new Categoria("Pantalon");
        vec[2]= new Categoria("Blusa");
        vec[3]= new Categoria("Polo");
        vec[4]= new Categoria("Casaca");
        indice=5;
    }
    
    public int tamaño(){
        return indice;
    }
    public Categoria obtener(int pos){
        return vec[pos];
    }

    
    public void adicion(Categoria ep){
        vec[indice]=ep;
        indice++;
    }
    
    public Categoria busca(int cod){
        Categoria bus=null;
        for (int f=0;f<indice;f++){
            //comparar el codigo q esta en la tavbla con el codigo que esta passando
            if(vec[f].getIdCategoria()==cod){
                bus=vec[f];break;
            }
        }
        return bus;
    }
 
        
}
