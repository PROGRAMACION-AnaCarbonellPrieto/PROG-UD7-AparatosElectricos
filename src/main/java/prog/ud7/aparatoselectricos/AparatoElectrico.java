/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prog.ud7.aparatoselectricos;

/**
 *
 * @author Ana Carbonell Prieto
 */
public abstract class AparatoElectrico {
    private String numSerie;
    private boolean tieneCorrienteElectrica;
    private boolean estaEncendido;

    public AparatoElectrico(String numSerie, boolean tieneCorrienteElectrica, boolean estaEncendido) {
        this.numSerie = numSerie;
        this.tieneCorrienteElectrica = tieneCorrienteElectrica;
        this.estaEncendido = estaEncendido;
    }
}