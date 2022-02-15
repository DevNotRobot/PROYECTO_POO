/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;



import Clases.DetalleProducto;


/**
 *
 * @author Niccole
 */
public class Arreglo_detallecompra {
    DetalleProducto vec[]=new DetalleProducto[100];
    int indice;
    
    public Arreglo_detallecompra(){
        vec[0]= new DetalleProducto("Pantalon tela jean",50.00,50,"Azul","30","En Stock",1000,1000);
        vec[1]= new DetalleProducto("Casaca tela cuero",30.00,20,"Negro","M","En Stock",1001,1001);
        vec[2]= new DetalleProducto("Polo tela algodon",20.00,6,"Blanco","S","En Stock",1002,1002);
        vec[3]= new DetalleProducto("Blusa tela Nilon",25.00,10,"Plata","L","En Stock",1003,1003);
        vec[4]= new DetalleProducto("Falda tela Extranjera",40.00,7,"Marron","34","En Stock",1004,1004);
        indice=5;
    }
    
    public int tamaño(){
        return indice;
    }
    public DetalleProducto obtener(int pos){
        return vec[pos];
    }

    
    public void adicion(DetalleProducto ep){
        vec[indice]=ep;
        indice++;
    }
    
    //SOBRECARGA DE METODOS
    public DetalleProducto mostrarStock(int idProd ){
       
         DetalleProducto dt=null;
        for (int f=0;f<indice;f++){
            //comparar el codigo q esta en la tavbla con el codigo que esta passando
            if(vec[f].getIdProducto()==idProd && vec[f].getStock()>15){
                dt=vec[f];break;
            }
        }
        return dt;
      }
    
      public DetalleProducto mostrarStock(int idProd,int idComp){
       DetalleProducto bus=null;
        for (int f=0;f<indice;f++){
            //comparar el codigo q esta en la tavbla con el codigo que esta passando
            if(vec[f].getIdProducto()==idProd && vec[f].getStock()<=15 && vec[f].getIdCompra()==idComp){
                bus=vec[f];break;
            }
          }
        return bus;
      }
    
    public DetalleProducto busca(int cod){
        DetalleProducto bus=null;
        for (int f=0;f<indice;f++){
            //comparar el codigo q esta en la tavbla con el codigo que esta passando
            if(vec[f].getIdCompra()==cod){
                bus=vec[f];break;
            }
        }
        return bus;
    }
}
