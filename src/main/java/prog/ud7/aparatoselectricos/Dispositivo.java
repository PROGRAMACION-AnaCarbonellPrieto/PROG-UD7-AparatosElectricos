/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.aparatoselectricos;

/**
 *
 * @author Ana Carbonell Prieto
 */
public abstract class Dispositivo extends AparatoElectrico {
    private final boolean INTERNET_DEFAULT = false;
    
    private boolean conectadoAInteret;
    
    public Dispositivo(String numSerie) {
        super(numSerie);
        this.conectadoAInteret = INTERNET_DEFAULT;
    }
}
