/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.aparatoselectricos;

/**
 *
 * @author Ana Carbonell Prieto
 */
public class Television extends Electrodomestico {
    private final int RESOLUCION_DEFAULT = 20;
    private final boolean WIFI_INTERNET_DEFAULT = false;
    
    private final int RESOLUCION_MAX = 40;
    private final double PORCENTAJE_PRECIO = 1.3;
    
    private int resolucion;
    private boolean estaWifiHabilitado;
    private boolean estaConectadaAInternet;

    public Television(int resolucion, Color color, ConsumoEnergetico consumo, double precio, String modelo, String marca, int peso, String numSerie) {
        super(color, consumo, precio, modelo, marca, peso, numSerie);
        this.resolucion = resolucion;
        this.estaWifiHabilitado = WIFI_INTERNET_DEFAULT;
        this.estaConectadaAInternet = WIFI_INTERNET_DEFAULT;
    }
    
    public Television(String modelo, String marca, String numSerie) {
        super(modelo, marca, numSerie);
        this.resolucion = RESOLUCION_DEFAULT;
        this.estaWifiHabilitado = WIFI_INTERNET_DEFAULT;
        this.estaConectadaAInternet = WIFI_INTERNET_DEFAULT;
    }

    @Override
    public double obtenerPrecioVenta() {
        return (this.resolucion > RESOLUCION_MAX) ? super.obtenerPrecioVenta() * PORCENTAJE_PRECIO : super.obtenerPrecioVenta();
    }
}
