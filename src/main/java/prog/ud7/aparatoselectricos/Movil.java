/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.aparatoselectricos;

/**
 *
 * @author Ana Carbonell Prieto
 */
public class Movil extends Dispositivo {
    private Memoria memoria;
    private String marca;
    private String modelo;
    
    private enum Memoria { MB64, MB128, MB256, MB512, GB1, GB2 };

    public Movil(Memoria memoria, String marca, String modelo, boolean conectadoAInteret, String numSerie, boolean tieneCorrienteElectrica, boolean estaEncendido) {
        super(conectadoAInteret, numSerie, tieneCorrienteElectrica, estaEncendido);
        this.memoria = memoria;
        this.marca = marca;
        this.modelo = modelo;
    }
}
