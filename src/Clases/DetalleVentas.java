package Clases;

import Clases.DetalleProducto;

public class DetalleVentas {
    
    DetalleProducto d= new DetalleProducto();
    private int cantidad;
    private double monto;
    private String idVenta;
    private int idProducto;    
    
  
    public DetalleVentas() {
    }

    public DetalleVentas(int cantidad, double monto, String idVenta) {
        this.cantidad = cantidad;
        this.monto = monto;
        this.idVenta = idVenta;
    }

    @Override
    public String toString() {
        return "DetalleVentas{" + "cantidad=" + cantidad + ", monto=" + monto + ", idVenta=" + idVenta + '}';
    }
    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    
     public void insertDetalleVenta(){
         
    }

     public void updateDetalleVenta(){
        
    }

     public void deleteDetalleVenta(){
       
    }
     
}
