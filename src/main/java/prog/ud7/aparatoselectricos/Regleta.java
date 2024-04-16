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
        return false;
    }
    
    public boolean desenchufar(Enchufable aparato) {
        return false;
    }
    
    public int obtenerNumeroTomasLibres() {
        return -1;
    }
    
    public void listarConectados() {
        
    }
}
