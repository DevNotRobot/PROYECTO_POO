package Datos;

import Clases.Cliente;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Arreglo_Cliente {
   Cliente vec[]=new Cliente[100];
    int indice;
   
    public Arreglo_Cliente(){
        vec[0]= new Cliente( "Juan", "DNI", "78200514", "910124578");
        vec[1]= new Cliente("Ariana","DNI","44351842","916058876");
        vec[2]= new Cliente("Helio","DNI","74850994","931037416");
        vec[3]= new Cliente("Carlitos","PASAPORTE","1587459822","987526987");
        vec[4]= new Cliente("Kaella","DNI","58963258","999999991");
        indice=5;
    }
      
    public int genCodigo(){
        if(indice==0)return 1000;
        else return vec[indice-1].getIdCliente()+1;
    }
    public int tamaño(){
        return indice;
    }
    public Cliente obtener(int pos){
        return vec[pos];
    }
    public void adiciona(Cliente p){
        vec[indice]=p;
        indice++;
        
    }
       
     public Cliente busca(int cod){
         Cliente bus=null;
        for (int f=0;f<indice;f++){
            //comparar el codigo q esta en la tabla con el codigo que esta pasando
            if(vec[f].getIdCliente()==cod){
                bus=vec[f];break;
            }
        }
        return bus;
    }
        
    
     
}
    


