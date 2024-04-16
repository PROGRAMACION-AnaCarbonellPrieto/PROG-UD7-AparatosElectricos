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
    private final static Color COLOR_DEFAULT = Color.BLANCO;
    private final static ConsumoEnergetico CONSUMO_DEFAULT = ConsumoEnergetico.F;
    private final static double PRECIO_DEFAULT = 100;
    private final static int PESO_DEFAULT = 5;
    
    private final int PRECIO_A = 100;
    private final int PRECIO_B = 80;
    private final int PRECIO_C = 60;
    private final int PRECIO_D = 50;
    private final int PRECIO_E = 30;
    private final int PRECIO_F = 10;
    
    private Color color;
    private ConsumoEnergetico consumo;
    private double precio;
    private String modelo;
    private String marca;
    private int peso;
    
    public enum Color { BLANCO, NEGRO, ROJO, AZUL, GRIS };
    public enum ConsumoEnergetico { A, B, C, D, E, F };

    public Electrodomestico(Color color, ConsumoEnergetico consumo, double precio, String modelo, String marca, int peso, String numSerie) {
        super(numSerie);
        this.color = color;
        this.consumo = consumo;
        this.precio = precio;
        this.modelo = modelo;
        this.marca = marca;
        this.peso = peso;
    }
    
    public Electrodomestico(String modelo, String marca, String numSerie) {
        this(COLOR_DEFAULT, CONSUMO_DEFAULT, PRECIO_DEFAULT, modelo, marca, PESO_DEFAULT, numSerie);
    }
    
    public double obtenerPrecioVenta() {
        switch (this.consumo) {
            case A:
                return this.precio + PRECIO_A;
            case B:
                return this.precio + PRECIO_B;
            case C:
                return this.precio + PRECIO_C;
            case D:
                return this.precio + PRECIO_D;
            case E:
                return this.precio + PRECIO_E;
            default:
                return this.precio + PRECIO_F;
        }
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s, Marca: %s, Modelo:'%s', Tipo Consumo: %s, Color: %s, Precio Base: %.0f, Precio Final: %.1f",
                super.toString(),
                this.marca,
                this.modelo,
                this.consumo,
                this.color,
                this.precio,
                obtenerPrecioVenta()
                );
    }
}