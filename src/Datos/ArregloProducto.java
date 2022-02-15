/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Producto;

/**
 *
 * @author giuse
 */
public class ArregloProducto {
    Producto vec[]=new Producto[100];
    int indice;
    
    public ArregloProducto(){
        vec[0]= new Producto(1000,"Pantalon Jean");
        vec[1]= new Producto(1001,"Casaca Cuero");
        vec[2]= new Producto(1002,"Blusa Blonda");
        vec[3]= new Producto(1003,"Polo DC");
        vec[4]= new Producto(1004,"Falda Australiana");
        indice=5;
    }
    
    public Producto busca(int cod){
        Producto bus=null;
        for (int f=0;f<indice;f++){
            //comparar el codigo q esta en la tavbla con el codigo que esta passando
            if(vec[f].getIdProducto()==cod){
                bus=vec[f];break;
            }
        }
        return bus;
    }
    public int tamaño(){
        return indice;
    }
    public int genCodigo(){
        if(indice==0)return 1000;
        else return vec[indice-1].getIdProducto()+1;
    }

    public Producto obtener(int pos){
        return vec[pos];
    }

    
    public void adicion(Producto ep){
        vec[indice]=ep;
        indice++;
    }
}
