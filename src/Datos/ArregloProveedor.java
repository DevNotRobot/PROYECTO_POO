/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Proveedor;

/**
 *
 * @author giuse
 */
public class ArregloProveedor {
    Proveedor vec[]=new Proveedor[100];
    int indice;
    
    public ArregloProveedor(){
        vec[0]= new Proveedor(1000,"Sidney","1524852365","74852245");
        vec[1]= new Proveedor(1001,"Corp. ATL","1258745698","44351842");
        vec[2]= new Proveedor(1002,"Indutexa","21453698752","74850994");
        vec[3]= new Proveedor(1003,"Pionier","52369852147","1587459822");
        vec[4]= new Proveedor(1004,"Tandem","85214785236","58963258");
        indice=5;
    }
    
    public int tamaño(){
        return indice;
    }
    public Proveedor obtener(int pos){
        return vec[pos];
    }
    
    public int genCodigo(){
        if(indice==0)return 1000;
        else return vec[indice-1].getIdProveedor()+1;
    }

    
    public void adicion(Proveedor ep){
        vec[indice]=ep;
        indice++;
    }
    
    public Proveedor busca(int cod){
        Proveedor bus=null;
        for (int f=0;f<indice;f++){
            //comparar el codigo q esta en la tavbla con el codigo que esta passando
            if(vec[f].getIdProveedor()==cod){
                bus=vec[f];break;
            }
        }
        return bus;
    }
}
