/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.aparatoselectricos;

/**
 *
 * @author Ana Carbonell Prieto
 */
public class Lavadora extends Electrodomestico {
    private int carga;
    
    public Lavadora(int carga, Color color, ConsumoEnergetico consumo, double precio, String modelo, String marca, int peso, String numSerie, boolean tieneCorrienteElectrica) {
        super(color, consumo, precio, modelo, marca, peso, numSerie, tieneCorrienteElectrica, false);
        this.carga = 7;
    }

    public Lavadora(int carga, Color color, ConsumoEnergetico consumo, double precio, String modelo, String marca, int peso, String numSerie, boolean tieneCorrienteElectrica, boolean estaEncendido) {
        super(color, consumo, precio, modelo, marca, peso, numSerie, tieneCorrienteElectrica, estaEncendido);
        this.carga = carga;
    }

    @Override
    public double obtenerPrecioVenta() {
        return (this.carga > 10) ? super.obtenerPrecioVenta() + 50 : super.obtenerPrecioVenta();
    }
}
