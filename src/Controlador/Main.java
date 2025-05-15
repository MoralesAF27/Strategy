/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(250);

        // Pago con PayPal
        pedido.setPagoStrategy(new PayPalStrategy("usuario@correo.com", "contrasena123"));
        pedido.procesarPedido();

        // Pago con tarjeta de crédito
        pedido.setPagoStrategy(new TarjetaCreditoStrategy("Juan Pérez", "1234567890123456", "123", "12/25"));
        pedido.procesarPedido();

        // Pago con criptomoneda
        pedido.setPagoStrategy(new CriptoStrategy("1A2b3C4d5E6f7G8h9I0j"));
        pedido.procesarPedido();
    }
}
