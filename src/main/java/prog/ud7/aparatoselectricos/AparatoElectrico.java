/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prog.ud7.aparatoselectricos;

/**
 *
 * @author Ana Carbonell Prieto
 */
public abstract class AparatoElectrico {
    private final boolean ENCENDIDA_CORRIENTE_DEFAULT = false;
    
    private String numSerie;
    private boolean tieneCorrienteElectrica;
    private boolean estaEncendido;

    public AparatoElectrico(String numSerie) {
        this.numSerie = numSerie;
        this.tieneCorrienteElectrica = ENCENDIDA_CORRIENTE_DEFAULT;
        this.estaEncendido = ENCENDIDA_CORRIENTE_DEFAULT;
    }
}