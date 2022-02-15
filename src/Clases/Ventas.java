package Clases;

import javax.swing.JTextArea;

public class Ventas {
    private int idVenta;
    private String fechaVenta;
    private double importe;
    private String comprobanteVenta;
    private String observaciones;
    private String idEmpleado;
    private String idCliente;

    public Ventas() {
    }

    public Ventas(int idVenta, String fechaVenta, double importe, String comprobanteVenta, String observaciones, String idEmpleado, String idCliente) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.importe = importe;
        this.comprobanteVenta = comprobanteVenta;
        this.observaciones = observaciones;
        this.idEmpleado = idEmpleado;
        this.idCliente = idCliente;
    }
    
      @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fechaVenta=" + fechaVenta + ", importe=" + importe + ", comprobanteVenta=" + comprobanteVenta + ", observaciones=" + observaciones + ", idCliente=" + idCliente + ", idEmpleado=" + idEmpleado + '}';
    }

     public void insertVentas(){
         
    }

     public void updateVentas(){
        
    }

     public void deleteVentas(){
       
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getComprobanteVenta() {
        return comprobanteVenta;
    }

    public void setComprobanteVenta(String comprobanteVenta) {
        this.comprobanteVenta = comprobanteVenta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    
    public void metodoMostrar(JTextArea at, Cliente nombre, Cliente nroDocumento,Empleado nombreEmp,Producto nombreProd){ 
        
        at.setText("----------------------");
        at.append("--------BOLETA--------");
        at.append("----------------------");
        at.append("Nombre:"+ nombre);
        at.append("DNI:"+nroDocumento);
        at.append("Empleado:"+nombreEmp);
        at.append("--Descripcion--");
        at.append("Producto:"+ nombreProd);
        at.append("Total:"+importe);
        at.append("----------------------");
        at.append("----------------------");
    } 
    

}

