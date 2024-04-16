/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.aparatoselectricos;

/**
 *
 * @author Ana Carbonell Prieto
 */
public class Computador extends Dispositivo {
    private int memoriaRam;
    private double velocidadCPU;
    private int tamanyoHDD;

    public Computador(int memoriaRam, double velocidadCPU, int tamanyoHDD, boolean conectadoAInteret, String numSerie, boolean tieneCorrienteElectrica, boolean estaEncendido) {
        super(conectadoAInteret, numSerie, tieneCorrienteElectrica, estaEncendido);
        this.memoriaRam = memoriaRam;
        this.velocidadCPU = velocidadCPU;
        this.tamanyoHDD = tamanyoHDD;
    }
}
