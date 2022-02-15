/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Compra;

/**
 *
 * @author giuse
 */
public class ArregloCompras {
   Compra vec[]=new Compra[100];
    int indice;
    
    public ArregloCompras(){
        vec[0]= new Compra(1000,"05/02/2022",50.00,"005","02",1001,1001);
        vec[1]= new Compra(1001,"04/02/2022",30.00,"004","05",1002,1002);
        vec[2]= new Compra(1002,"03/02/2022",20.00,"003","01",1003,1003);
        vec[3]= new Compra(1003,"02/02/2022",25.00,"002","03",1004,1004);
        vec[4]= new Compra(1004,"01/02/2022",40.00,"001","04",1005,1005);
        indice=5;
    }
    
    public int tamaño(){
        return indice;
    }
    
    public int genCodigo(){
        if(indice==0)return 1000;
        else return vec[indice-1].getIdCompra()+1;
    }

    public Compra obtener(int pos){
        return vec[pos];
    }

    
    public void adicion(Compra ep){
        vec[indice]=ep;
        indice++;
    }
    
    public Compra busca(int cod){
        Compra bus=null;
        for (int f=0;f<indice;f++){
            //comparar el codigo q esta en la tavbla con el codigo que esta passando
            if(vec[f].getIdCompra()==cod){
                bus=vec[f];break;
            }
        }
        return bus;
    }
 
        
}
