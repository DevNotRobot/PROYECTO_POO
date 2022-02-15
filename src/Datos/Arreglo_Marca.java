/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Marca;


/**
 *
 * @author giuse
 */
public class Arreglo_Marca {
    Marca vec[]=new Marca[100];
    int indice;
    
    
    public Arreglo_Marca(){
       vec[0]= new Marca(1000,"Mango","Polo");
        vec[1]= new Marca(1001,"Zara","Blusa");
        vec[2]= new Marca(1002,"JoaquinMiro","Casaca");
        vec[3]= new Marca(1003,"BanaraRepublic","Pantalon");
        vec[4]= new Marca(1004,"Forever21","Falda");
        indice=5;
    }
    
    public int tamaño(){
        return indice;
    }
    
       public int genCodigo(){
        if(indice==0)return 1000;
        else return vec[indice-1].getIdMarca()+1;
    }
       
    public Marca obtener(int pos){
        return vec[pos];
    }

    
    public void adicion(Marca ep){
        vec[indice]=ep;
        indice++;
    }
    
    public Marca busca(int cod){
        Marca bus=null;
        for (int f=0;f<indice;f++){
            //comparar el codigo q esta en la tavbla con el codigo que esta passando
            if(vec[f].getIdMarca()==cod){
                bus=vec[f];break;
            }
        }
        return bus;
    }
 

}
