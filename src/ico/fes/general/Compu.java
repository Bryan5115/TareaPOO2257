/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.general;

import ico.fes.hardware.CPU;
import ico.fes.hardware.Monitor;
import ico.fes.hardware.Mouse;
import ico.fes.hardware.Teclado;

/**
 *
 * @author user
 */
public class Compu {
    private String marca;
    private String modelo;
    private Teclado teclado;
    private Mouse raton;
    private Monitor pantalla;
    private CPU cpu;

    public Compu() {
    }

    public Compu(String marca, String modelo, Teclado teclado, Mouse raton, Monitor pantalla, CPU cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.teclado = teclado;
        this.raton = raton;
        this.pantalla = pantalla;
        this.cpu = cpu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Compu{" + "marca=" + marca + ", modelo=" + modelo + ", teclado=" + teclado + ", raton=" + raton + ", pantalla=" + pantalla + ", cpu=" + cpu + '}';
    }
    
}
