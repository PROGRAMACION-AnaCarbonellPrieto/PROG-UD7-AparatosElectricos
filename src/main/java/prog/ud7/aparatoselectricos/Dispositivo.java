/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.aparatoselectricos;

/**
 *
 * @author Ana Carbonell Prieto
 */
public class Dispositivo extends AparatoElectrico {
    private boolean conectadoAInteret;

    public Dispositivo(boolean conectadoAInteret, String numSerie, boolean tieneCorrienteElectrica, boolean estaEncendido) {
        super(numSerie, tieneCorrienteElectrica, estaEncendido);
        this.conectadoAInteret = conectadoAInteret;
    }
}
