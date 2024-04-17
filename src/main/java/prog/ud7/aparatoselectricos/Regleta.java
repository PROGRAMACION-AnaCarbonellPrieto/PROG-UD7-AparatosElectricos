/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.aparatoselectricos;

import java.util.Objects;
import prog.ud7.interfaces.Enchufable;

/**
 *
 * @author Ana Carbonell Prieto
 */
public class Regleta {
    private final int APARATOS_MAX = 10;
    
    private Enchufable[] aparatos;

    public Regleta() {
        this.aparatos = new Enchufable[APARATOS_MAX];
    }
    
    public boolean enchufar(Enchufable aparato) {
        if (buscarAparato(aparato) != -1) {
            System.out.printf("[%s] El aparato ya está enchufado a la regleta\n", aparato.getClass().getSimpleName());
            return false;
        }
        
        for (int i = 0; i < this.aparatos.length; i++) {
            if (this.aparatos[i] == null) {
                this.aparatos[i] = aparato;
                aparato.darEnergia();
                return true;
            }
        }

        System.out.printf("La regleta está llena\n", aparato.getClass().getSimpleName());
        return false;
    }
    
    public boolean desenchufar(Enchufable aparato) {
        int indice = buscarAparato(aparato);
        
        if (indice != -1) {
            this.aparatos[indice] = null;
            aparato.quitarEnergia();
            return true;
        }
        
        System.out.printf("[%s] El aparato no está enchufado a la regleta\n", aparato.getClass().getSimpleName());
        return false;
    }
    
    public int obtenerNumeroTomasLibres() {
        int contador = 0;
        
        for (Enchufable aparato: this.aparatos) {
            if (aparato == null) contador++;
        }
        
        return contador;
    }
    
    public void listarConectados() {
        for (Enchufable aparato: this.aparatos) {
            if (aparato != null) {
                System.out.println("\n" + aparato);
            }
        }
    }
    
    private int buscarAparato(Enchufable aparato) {
        for (int i = 0; i < this.aparatos.length; i++) {
            if (Objects.equals(aparatos[i], aparato)) return i;
        }
        
        return -1;
    }
}
