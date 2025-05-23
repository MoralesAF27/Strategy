/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andre
 */
public class PayPalStrategy implements PagoStrategy {
    private String correo;
    private String contrasena;

    public PayPalStrategy(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Override
    public void pagar(int monto) {
        System.out.println(monto + " pagado usando PayPal.");
    }
}
