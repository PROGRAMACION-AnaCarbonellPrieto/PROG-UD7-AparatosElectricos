/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.tests;

import prog.ud7.aparatoselectricos.AparatoElectrico;
import prog.ud7.aparatoselectricos.Computador;
import prog.ud7.aparatoselectricos.Movil.Memoria;
import prog.ud7.aparatoselectricos.Electrodomestico.Color;
import prog.ud7.aparatoselectricos.Electrodomestico.ConsumoEnergetico;
import prog.ud7.aparatoselectricos.Movil;
import prog.ud7.aparatoselectricos.Regleta;
import prog.ud7.aparatoselectricos.Router;
import prog.ud7.aparatoselectricos.Television;

/**
 *
 * @author Ana Carbonell Prieto
 */
public class TestRouter {
    
    public static void main(String[] args) {
        AparatoElectrico[] aparatos = new AparatoElectrico[3];
        
        Television tv = new Television(45, Color.BLANCO, ConsumoEnergetico.F, 100, "LG", "SuperGuay", 5, "1234C");
        Computador pc = new Computador(2048, 5000, 1024, "1234E");
        Movil mv = new Movil(Memoria.M256, "Samsung", "Galaxy S21", "1234G");
        
        aparatos[0] = tv;
        aparatos[1] = pc;
        aparatos[2] = mv;
        
        System.out.println("----------Aparatos conectables creados ----------\n");
        
        for (AparatoElectrico aparato: aparatos) {
            System.out.println("\n" + aparato);
        }
        
        System.out.println("\n----------Encender televisión, móvil y ordenador ----------\n");
        
        for (AparatoElectrico aparato: aparatos) {
            aparato.activar();
        }
        
        System.out.println("\n----------Conectar televisión a una regleta y encender la TV ----------\n");
        
        Regleta regleta = new Regleta();
        
        regleta.enchufar(aparatos[0]);
        aparatos[0].activar();
        
        System.out.println("\n----------Crear router y emparejar los tres aparatos. Televisión no podrá por no tener habilitado Wifi ----------\n");
        
        Router router = new Router();
        
        router.emparejar(tv);
        router.emparejar(pc);
        router.emparejar(mv);
        
        System.out.println("\n----------Habilitar Wifi para televisión y emparejar con router ----------\n");
        
        tv.habilitarWifi();
        router.emparejar(tv);
        
        System.out.println("\n----------Desemparejar móvil y mostrar los aparatos emparejados ----------\n");
        
        router.desemparejar(mv);
        router.listarDispositivosEmparejados();
        
        System.out.println("\n----------Desenchufar televisión y listar aparatos emparejados ----------\n");
        
        router.desemparejar(tv);
        router.listarDispositivosEmparejados();
    }
}
