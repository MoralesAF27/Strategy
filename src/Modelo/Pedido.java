/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andre
 */
public class Pedido {
    private int monto;
    private PagoStrategy pagoStrategy;

    public Pedido(int monto) {
        this.monto = monto;
    }

    public void setPagoStrategy(PagoStrategy pagoStrategy) {
        this.pagoStrategy = pagoStrategy;
    }

    public void procesarPedido() {
        if (pagoStrategy == null) {
            throw new IllegalStateException("No se ha definido una estrategia de pago.");
        }
        pagoStrategy.pagar(monto);
    }
}
