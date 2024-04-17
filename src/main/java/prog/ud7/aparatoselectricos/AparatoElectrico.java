/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prog.ud7.aparatoselectricos;

import java.util.Objects;
import prog.ud7.interfaces.Enchufable;

/**
 *
 * @author Ana Carbonell Prieto
 */
public abstract class AparatoElectrico implements Enchufable {
    private final boolean ENCENDIDA_CORRIENTE_DEFAULT = false;
    
    private String numSerie;
    private boolean tieneCorrienteElectrica;
    private boolean estaEncendido;

    public AparatoElectrico(String numSerie) {
        this.numSerie = numSerie;
        this.tieneCorrienteElectrica = ENCENDIDA_CORRIENTE_DEFAULT;
        this.estaEncendido = ENCENDIDA_CORRIENTE_DEFAULT;
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
    public void darEnergia() {
        this.tieneCorrienteElectrica = true;
    }

    @Override
    public void quitarEnergia() {
        this.tieneCorrienteElectrica = false;
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