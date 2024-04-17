/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.tests;

import prog.ud7.aparatoselectricos.Computador;
import prog.ud7.aparatoselectricos.Electrodomestico.Color;
import prog.ud7.aparatoselectricos.Electrodomestico.ConsumoEnergetico;
import prog.ud7.aparatoselectricos.Lavadora;
import prog.ud7.aparatoselectricos.Movil;
import prog.ud7.aparatoselectricos.Movil.Memoria;
import prog.ud7.aparatoselectricos.Regleta;
import prog.ud7.aparatoselectricos.Television;
import prog.ud7.interfaces.Enchufable;

/**
 *
 * @author Ana Carbonell Prieto
 */
public class TestRegleta {
    
    public static void main(String[] args) {
        Enchufable[] aparatos = new Enchufable[4];
        
        aparatos[0] = new Lavadora(5, Color.BLANCO, ConsumoEnergetico.F, 100, "Bosch", "V1", 5, "1234A");
        aparatos[1] = new Television(45, Color.BLANCO, ConsumoEnergetico.F, 100, "LG", "SuperGuay", 5, "1234C");
        aparatos[2] = new Computador(2048, 5000, 1024, "1234E");
        aparatos[3] = new Movil(Memoria.M256, "Samsung", "Galaxy S21", "1234G");
        
        System.out.println("----------Crear regleta y conectar los cuatro aparatos----------\n");
        
        Regleta regleta = new Regleta();
        
        for (Enchufable aparato: aparatos) {
            regleta.enchufar(aparato);
        }
        
        System.out.println("\n----------Listar aparatos enchufados----------\n");
        
        regleta.listarConectados();
        System.out.println("\n Número de tomas libres: " + regleta.obtenerNumeroTomasLibres());
        
        System.out.println("\n----------Desconectar lavadora y televisión----------\n");
        
        regleta.desenchufar(aparatos[0]);
        regleta.desenchufar(aparatos[1]);
        
        System.out.println("\n----------Listar aparatos enchufados ----------\n");
        
        regleta.listarConectados();
        
        System.out.println("\n----------Crear móvil con número de serie 1234G ----------\n");
        
        Enchufable movil = new Movil(Memoria.M512, "Motorola", "S500", "1234G");
        System.out.println(movil);
        
        System.out.println("\n----------Enchufar móvil anterior y obtener mensaje de error ----------\n");
        
        regleta.enchufar(movil);
        
        System.out.println("\n----------Desconectar aparato no enchufado (la lavadora)----------\n");
        
        regleta.desenchufar(aparatos[0]);
    }
}
