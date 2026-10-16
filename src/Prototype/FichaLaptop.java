/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author user
 */

public class FichaLaptop {

    // Características que tendrá cada ficha.
    private String codigo;
    private String marca;
    private int memoriaRAM;

    // Constructor: permite crear una ficha con sus datos iniciales.
    public FichaLaptop(String codigo, String marca, int memoriaRAM) {
        this.codigo = codigo;
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
    }

    // Método Prototype: crea una ficha nueva copiando los datos actuales.
    public FichaLaptop clonar() {
        return new FichaLaptop(codigo, marca, memoriaRAM);
    }

    // Cambia el código de la ficha.
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Cambia la cantidad de memoria RAM.
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    // Muestra los datos de la ficha.
    public void mostrarFicha() {
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("RAM: " + memoriaRAM + " GB");
        System.out.println("--------------------");
    }

    
}

