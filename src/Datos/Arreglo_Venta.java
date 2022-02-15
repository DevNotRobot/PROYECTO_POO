package Datos;

import Clases.Ventas;

public class Arreglo_Venta {
     Ventas vec[]=new Ventas[100];
    int indice;
    
    public Arreglo_Venta(){
        vec[0]= new Ventas(101, "01/06/2020", 1550.50, "BOLETA", "", "Karla", "Lopez");
        vec[1]= new Ventas(102, "03/04/2019", 1650.30, "BOLETA", "", "Kevin", "Martinez");
        vec[2]= new Ventas(103, "04/08/2018", 1390.50, "FACTURA", "", "Juan Carlos", "Flores");
        vec[3]= new Ventas(104, "06/02/2021", 1200.70, "FACTURA", "", "Maria", "Oviedo");
        vec[4]= new Ventas(105, "09/09/2020", 1800.90, "BOLETA", "", "Rolando", "Saavedra");
        indice=5;
    }
    
    public int tamaño(){
        return indice;
    }
    public Ventas obtener(int pos){
        return vec[pos];
    }
    
     public int genCodigo(){
        if(indice==0)return 100;
        else return vec[indice-1].getIdVenta()+1;
    }

    
    public void adicion(Ventas ep){
        vec[indice]=ep;
        indice++;
    }
    
    public Ventas busca(int cod){
        Ventas bus=null;
        for (int f=0;f<indice;f++){
            //comparar el codigo q esta en la tabla con el codigo que esta passando
            if(vec[f].getIdVenta()==cod){
                bus=vec[f];break;
            }
        }
        return bus;
    }
    
 
}