 package Datos;

import Clases.Empleado;

/**
 *
 * @author zrisan
 */
public class Arreglo_Empleado {
    Empleado vec[] = new Empleado[100];
    int indice;

    public Arreglo_Empleado() {
        vec[0]= new Empleado("ADMINISTRADOR", "ACTIVO", 1000, "Juan Montez", "DNI", "74800251", "910457821");
        vec[1]= new Empleado("CAJERO 1", "ACTIVO", 1001, "Karla Montez", "DNI", "28800251", "999457821");
        vec[2]= new Empleado( "CAJERO 2", "ACTIVO", 1002, "Kevin Perez", "DNI", "54800251", "955457821");
        indice = 3;
    }
    
    public int tamaño(){
        return indice;
    }
    
    public Empleado obtener(int pos){
        return vec[pos];
    }
    
    public void adicion(Empleado emp){
        vec[indice]=emp;
        indice++;
    }
     
    public Empleado busca(int cod){
        Empleado bus=null;
        for (int f=0;f<indice;f++){
            //comparar el codigo q esta en la tavbla con el codigo que esta passando
            if(vec[f].getIdEmpleado()==cod){
                bus=vec[f];break;
            }
        }
        return bus;
    }
     
     
    
}
