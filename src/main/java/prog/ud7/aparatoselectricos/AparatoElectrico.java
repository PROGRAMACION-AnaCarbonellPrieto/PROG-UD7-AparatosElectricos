/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prog.ud7.aparatoselectricos;

import prog.ud7.interfaces.Encendible;

/**
 *
 * @author Ana Carbonell Prieto
 */
public abstract class AparatoElectrico implements Encendible {
    private final boolean ENCENDIDA_CORRIENTE_DEFAULT = false;
    
    private String numSerie;
    protected boolean tieneCorrienteElectrica;
    protected boolean estaEncendido;

    public AparatoElectrico(String numSerie) {
        this.numSerie = numSerie;
        this.tieneCorrienteElectrica = ENCENDIDA_CORRIENTE_DEFAULT;
        this.estaEncendido = ENCENDIDA_CORRIENTE_DEFAULT;
    }

    @Override
    public void darEnergia() {
        this.tieneCorrienteElectrica = true;
        System.out.printf("[%s] Aparato enchufado\n", getClass().getSimpleName());
    }

    @Override
    public void quitarEnergia() {
        this.tieneCorrienteElectrica = false;
        System.out.printf("[%s] Aparato desenchufado\n", getClass().getSimpleName());
    }

    @Override
    public void activar() {
        this.estaEncendido = true;
        System.out.printf("[%s] Aparato encendido\n", getClass().getSimpleName());
    }

    @Override
    public void desactivar() {
        this.estaEncendido = false;
        System.out.printf("[%s] Aparato apagado\n", getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return String.format(
                "[%s] Núm.Serie: %s (%s), %s",
                getClass().getSimpleName(),
                this.numSerie,
                (this.tieneCorrienteElectrica) ? "Con corriente eléctrica" : "Sin corriente eléctrica",
                (this.estaEncendido) ? "Está encendido" : "No está encendido"
                );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        
        if (!(obj instanceof AparatoElectrico)) {
            return false;
        }
        
        AparatoElectrico aparato = (AparatoElectrico) obj;
        return aparato.numSerie.equals(this.numSerie);
    }
}