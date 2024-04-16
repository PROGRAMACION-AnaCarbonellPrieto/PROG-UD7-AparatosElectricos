/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.tests;

import prog.ud7.aparatoselectricos.AparatoElectrico;
import prog.ud7.aparatoselectricos.Computador;
import prog.ud7.aparatoselectricos.Electrodomestico.Color;
import prog.ud7.aparatoselectricos.Electrodomestico.ConsumoEnergetico;
import prog.ud7.aparatoselectricos.Lavadora;
import prog.ud7.aparatoselectricos.Movil;
import prog.ud7.aparatoselectricos.Television;

/**
 *
 * @author Ana Carbonell Prieto
 */
public class TestAparatoElectrico {
    
    public static void main(String[] args) {
        AparatoElectrico[] aparatos = new AparatoElectrico[8];
        
        aparatos[0] = new Lavadora(5, Color.BLANCO, ConsumoEnergetico.F, 100, "Bosch", "V1", 5, "1234A");
        aparatos[1] = new Lavadora(12, Color.BLANCO, ConsumoEnergetico.F, 100, "Fagor", "F22", 5, "1234B");
        aparatos[2] = new Television(45, Color.BLANCO, ConsumoEnergetico.F, 100, "LG", "SuperGuay", 5, "1234C");
        aparatos[3] = new Television(14, Color.BLANCO, ConsumoEnergetico.F, 100, "Sony", "MásChulaA", 5, "1234D");
        aparatos[4] = new Computador(2048, 5000, 1024, "1234E");
        aparatos[5] = new Computador(1024, 10000, 2048, "1234F");
        aparatos[6] = new Movil(Movil.Memoria.M256, "Samsung", "Galaxy S21", "1234G");
        aparatos[7] = new Movil(Movil.Memoria.M512, "Iphone", "21", "1234H");
        
        verListado(aparatos);
    }
    
    private static void verListado(AparatoElectrico[] aparatos) {
        System.out.println("----------------Lista de aparatos eléctricos----------------");
        
        for (AparatoElectrico aparato: aparatos) {
            System.out.println("\n" + aparato);
        }
    }
}
