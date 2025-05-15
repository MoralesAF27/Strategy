/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andre
 */
public class CriptoStrategy implements PagoStrategy {
    private String direccionBilletera;

    public CriptoStrategy(String direccionBilletera) {
        this.direccionBilletera = direccionBilletera;
    }

    @Override
    public void pagar(int monto) {
        System.out.println(monto + " pagado usando billetera de Criptomonedas.");
        // Aquí iría la lógica real de procesamiento de criptomonedas
    }
}
