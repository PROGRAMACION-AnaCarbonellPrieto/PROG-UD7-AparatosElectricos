/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.aparatoselectricos;

import prog.ud7.interfaces.Conectable;

/**
 *
 * @author Ana Carbonell Prieto
 */
public class Television extends Electrodomestico implements Conectable {
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

    @Override
    public boolean sePermiteConexion() {
        if (!this.estaEncendido || !this.estaWifiHabilitado) {
            System.out.printf("[%s] No se ha podido establecer la conexión (sin corriente, apagado o la interfaz wifi no está habilitada)\n", getClass().getSimpleName());
            return false;
        }

        return true;
    }

    @Override
    public void establecerConexion() {
        this.estaConectadaAInternet = true;
        System.out.printf("[%s] Aparato emparejado con éxito\n", getClass().getSimpleName());
    }

    @Override
    public void quitarConexion() {
        this.estaConectadaAInternet = false;
        System.out.printf("[%s] Aparato desemparejado con éxito\n", getClass().getSimpleName());
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s, %s, %s, Resolución: %d",
                super.toString(),
                (this.estaWifiHabilitado) ? "Wifi habilitado" : "Wifi deshabilitado",
                (this.estaConectadaAInternet) ? "Conectado a Internet" : "No conectado a Internet",
                this.resolucion
                );
    }
}
