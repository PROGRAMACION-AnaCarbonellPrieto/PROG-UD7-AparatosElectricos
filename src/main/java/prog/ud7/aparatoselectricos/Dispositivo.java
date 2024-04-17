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
public abstract class Dispositivo extends AparatoElectrico implements Conectable {
    private final boolean INTERNET_DEFAULT = false;
    
    private boolean conectadoAInteret;
    
    public Dispositivo(String numSerie) {
        super(numSerie);
        this.conectadoAInteret = INTERNET_DEFAULT;
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s, %s",
                super.toString(),
                (this.conectadoAInteret) ? "Conectado a Internet" : "No conectado a Internet"
                );
    }

    @Override
    public boolean sePermiteConexion() {
        if (!this.estaEncendido) {
            System.out.printf("[%s] No se ha podido establecer la conexión (apagado)\n", getClass().getSimpleName());
            return false;
        }

        return true;
    }

    @Override
    public void establecerConexion() {
        this.conectadoAInteret = true;
        System.out.printf("[%s] Aparato emparejado con éxito\n", getClass().getSimpleName());
    }

    @Override
    public void quitarConexion() {
        this.conectadoAInteret = false;
        System.out.printf("[%s] Aparato desemparejado con éxito\n", getClass().getSimpleName());
    }
}
