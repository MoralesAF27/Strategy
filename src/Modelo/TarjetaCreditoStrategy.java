/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andre
 */
public class TarjetaCreditoStrategy implements PagoStrategy {
    private String nombre;
    private String numeroTarjeta;
    private String cvv;
    private String fechaExpiracion;

    public TarjetaCreditoStrategy(String nombre, String numeroTarjeta, String cvv, String fechaExpiracion) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void pagar(int monto) {
        System.out.println(monto + " pagado con tarjeta de crédito/débito.");
    }
}
