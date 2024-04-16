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
    private final int CARGA_DEFAULT = 7;
    
    private final int CARGA_MAX = 10;
    private final int AUMENTO_PRECIO = 50;
    
    private int carga;
    
    public Lavadora(int carga, Color color, ConsumoEnergetico consumo, double precio, String modelo, String marca, int peso, String numSerie) {
        super(color, consumo, precio, modelo, marca, peso, numSerie);
        this.carga = carga;
    }
    
    public Lavadora(String modelo, String marca, String numSerie) {
        super(modelo, marca, numSerie);
        this.carga = CARGA_DEFAULT;
    }

    @Override
    public double obtenerPrecioVenta() {
        return (this.carga > CARGA_MAX) ? super.obtenerPrecioVenta() + AUMENTO_PRECIO : super.obtenerPrecioVenta();
    }
}
