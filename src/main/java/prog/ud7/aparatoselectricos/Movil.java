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
    
    public Movil(Memoria memoria, String marca, String modelo, String numSerie) {
        super(numSerie);
        this.memoria = memoria;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s, Memoria: %s, Marca: %s, Modelo: %s",
                super.toString(),
                this.memoria,
                this.marca,
                this.modelo
                );
    }
    
    public enum Memoria {
        M64("64 MB"), M128("128 MB"), M256("256 MB"), M512("512 MB"), M1("1 Gb"), M2("2 Gb");
        
        private String memoria;

        private Memoria(String memoria) {
            this.memoria = memoria;
        }

        @Override
        public String toString() {
            return this.memoria;
        }
    };
}
