/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.aparatoselectricos;

import java.util.Objects;

import prog.ud7.interfaces.Conectable;

/**
 *
 * @author Ana Carbonell Prieto
 */
public class Router extends AparatoElectrico {
    private final int CONEXIONES_MAX = 5;

    private Conectable[] conexiones;

    public Router(String numSerie) {
        super(numSerie);
        this.conexiones = new Conectable[CONEXIONES_MAX];
    }

    public boolean emparejar(Conectable aparato) {
        if (!comprobarRouterEncendido()) return false;
        
        if (buscarConexion(aparato) != -1) {
            System.out.printf("[%s] El aparato ya está conectado al router\n", aparato.getClass().getSimpleName());
            return false;
        }
        
        if (!aparato.sePermiteConexion()) return false;

        for (int i = 0; i < this.conexiones.length; i++) {
            if (this.conexiones[i] == null) {
                this.conexiones[i] = aparato;
                aparato.establecerConexion();
                return true;
            }
        }

        System.out.printf("El router está lleno\n", aparato.getClass().getSimpleName());
        return false;
    }

    public boolean desemparejar(Conectable aparato) {
        if (!comprobarRouterEncendido()) return false;
        
        int indice = buscarConexion(aparato);

        if (indice != -1) {
            this.conexiones[indice] = null;
            aparato.quitarConexion();
            return true;
        }

        System.out.printf("[%s] El aparato no está enchufado al router\n", aparato.getClass().getSimpleName());
        return false;
    }

    public int obtenerNumeroDeDispositivosEmparejados() {
        int contador = 0;
        
        for (Conectable aparato: this.conexiones) {
            if (aparato != null) contador++;
        }
        
        return contador;
    }

    public void listarDispositivosEmparejados() {
        if (!comprobarRouterEncendido()) return;
        
        for (Conectable aparato: this.conexiones) {
            if (aparato != null) {
                System.out.println("\n" + aparato);
            }
        }
    }

    public void actualizarDispositivosEmparejados() {
        if (!comprobarRouterEncendido()) return;
        
        for (Conectable aparato: this.conexiones) {
            if (aparato != null && !aparato.sePermiteConexion()) {
                aparato.quitarConexion();
            }
        }
    }

    private int buscarConexion(Conectable aparato) {
        for (int i = 0; i < this.conexiones.length; i++) {
            if (Objects.equals(this.conexiones[i], aparato)) return i;
        }

        return -1;
    }
    
    private boolean comprobarRouterEncendido() {
        if (!this.estaEncendido) {
            System.out.println("El router no está disponible (sin corriente o no encendido)");
            return false;
        }
        
        return true;
    }
    
    @Override
    public void activar() {
        if (this.tieneCorrienteElectrica) {
            super.activar();
        } else {
            System.out.printf("[%s] No se puede encender (no hay corriente)\n", getClass().getSimpleName());
        }
    }
}
