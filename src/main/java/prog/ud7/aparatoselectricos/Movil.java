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
        MB64("64 MB"), MB128("128 MB"), MB256("256 MB"), MB512("512 MB"), GB1("1 Gb"), GB2("2 Gb");
        
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
