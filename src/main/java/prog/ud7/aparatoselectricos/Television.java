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
    private int resolucion;
    private boolean estaWifiHabilitado;
    private boolean estaConectadaAInternet;

    public Television(int resolucion, boolean estaWifiHabilitado, boolean estaConectadaAInternet, Color color, ConsumoEnergetico consumo, double precio, String modelo, String marca, int peso, String numSerie, boolean tieneCorrienteElectrica, boolean estaEncendido) {
        super(color, consumo, precio, modelo, marca, peso, numSerie, tieneCorrienteElectrica, estaEncendido);
        this.resolucion = resolucion;
        this.estaWifiHabilitado = estaWifiHabilitado;
        this.estaConectadaAInternet = estaConectadaAInternet;
    }

    @Override
    public double obtenerPrecioVenta() {
        return super.obtenerPrecioVenta();
    }
}
