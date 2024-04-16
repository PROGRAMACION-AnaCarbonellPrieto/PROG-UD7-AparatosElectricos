/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.aparatoselectricos;

/**
 *
 * @author Ana Carbonell Prieto
 */
public abstract class Electrodomestico extends AparatoElectrico {
    private Color color;
    private ConsumoEnergetico consumo;
    private double precio;
    private String modelo;
    private String marca;
    private int peso;
    
    protected enum Color { BLANCO, NEGRO, ROJO, AZUL, GRIS };
    protected enum ConsumoEnergetico { A, B, C, D, E, F };

    public Electrodomestico(String modelo, String marca, String numSerie, boolean tieneCorrienteElectrica) {
        super(numSerie, tieneCorrienteElectrica, false);
        this.color = Color.BLANCO;
        this.consumo = ConsumoEnergetico.F;
        this.precio = 100;
        this.modelo = modelo;
        this.marca = marca;
        this.peso = 5;
    }
    
    public Electrodomestico(Color color, ConsumoEnergetico consumo, double precio, String modelo, String marca, int peso, String numSerie, boolean tieneCorrienteElectrica, boolean estaEncendido) {
        super(numSerie, tieneCorrienteElectrica, estaEncendido);
        this.color = color;
        this.consumo = consumo;
        this.precio = precio;
        this.modelo = modelo;
        this.marca = marca;
        this.peso = peso;
    }
    
    public double obtenerPrecioVenta() {
        switch (this.consumo) {
            case A:
                return this.precio + 100;
            case B:
                return this.precio + 80;
            case C:
                return this.precio + 60;
            case D:
                return this.precio + 50;
            case E:
                return this.precio + 30;
            default:
                return this.precio + 10;
        }
    }
}