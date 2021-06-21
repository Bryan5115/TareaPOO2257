/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora2257;

import ico.fes.general.Compu;
import ico.fes.hardware.CPU;
import ico.fes.hardware.Monitor;
import ico.fes.hardware.Mouse;
import ico.fes.hardware.Teclado;

/**
 *
 * @author user
 */
public class Computadora2257 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Compu nuevaComputadora= new Compu();
        nuevaComputadora.setCpu(new CPU("Intel", "i5", 200));
            nuevaComputadora.setTeclado(new Teclado("X starter", "Gamer", 70, 9));
            nuevaComputadora.setRaton(new Mouse("X starter", "Gamer", "De cable"));
            nuevaComputadora.setPantalla(new Monitor("ASUS", "VG2245H", 5));
            nuevaComputadora.setMarca("ASUS");
            nuevaComputadora.setModelo("Gamer");
            System.out.println(nuevaComputadora);
            
        
    }
    
}
