/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.aparatoselectricos;

/**
 *
 * @author Ana Carbonell Prieto
 */
public class Electrodomestico extends AparatoElectrico {
    private Color color;
    private ConsumoEnergetico consumo;
    private double precio;
    private String modelo;
    private String marca;
    private int peso;
    
    protected enum Color { BLANCO, NEGRO, ROJO, AZUL, GRIS };
    protected enum ConsumoEnergetico { A, B, C, D, E, F };

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
        return -1;
    }
}