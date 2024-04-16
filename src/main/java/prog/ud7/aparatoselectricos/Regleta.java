/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.aparatoselectricos;

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
        if (obtenerNumeroTomasLibres() == 0 || buscarAparato(aparato) != -1) return false;
        
        for (int i = 0; i < aparatos.length; i++) {
            if (aparatos[i] == null) {
                aparatos[i] = aparato;
                aparato.darEnergia();
                break;
            }
        }
        
        return true;
    }
    
    public boolean desenchufar(Enchufable aparato) {
        int indice = buscarAparato(aparato);
        
        if (indice != -1) {
            aparatos[indice] = null;
            aparato.quitarEnergia();
            return true;
        }
        
        return false;
    }
    
    public int obtenerNumeroTomasLibres() {
        int contador = 0;
        
        for (Enchufable aparato: aparatos) {
            if (aparato == null) contador++;
        }
        
        return contador;
    }
    
    public void listarConectados() {
        
    }
    
    private int buscarAparato(Enchufable aparato) {
        for (int i = 0; i < aparatos.length; i++) {
            if (aparatos[i].equals(aparato)) return i;
        }
        
        return -1;
    }
}
