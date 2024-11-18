package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Venta extends Transaccion{
   
    private Compra compra;

    /**
     * Constructor de la clase Venta
     * @param codigo
     * @param fechaTransaccion
     */
    public Venta(int codigo, LocalDate fechaTransaccion, Empleado empleado, Vehiculo vehiculo, Cliente cliente) {
        super(codigo, fechaTransaccion, empleado, vehiculo, cliente);
       
    }

    @Override
    public double calcularCosto() {
        double valorVenta = compra.getCosto() * (30/100);
        return valorVenta;
    }

    
    

}
