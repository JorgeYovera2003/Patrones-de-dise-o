/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * Este archivo hace la comparacion de clonar superficialemente
 * a clonar profundamente. Dentro de este archivo hay mas de 1 clase.
 * Cuando la linea de codigo diga: class bla bla bla, significa q es otra clase
 * pero dentro del mismo archivo
 */


class Bateria { //1era clase
    String estado;

    public Bateria(String estado) {
        this.estado = estado;
    }
}

class FichaLaptop { // 2da clase, esta clase contiene a la clase 1
    String codigo;
    Bateria bateria; //fijate aqui

    public FichaLaptop(String codigo, Bateria bateria) {
        this.codigo = codigo;
        this.bateria = bateria;
    }

    // Copia superficial: comparte el mismo objeto Bateria.
    public FichaLaptop clonarSuperficial() {
        return new FichaLaptop(codigo, bateria);
    }

    // Copia profunda: crea también una Bateria independiente.
    public FichaLaptop clonarProfundo() {
        Bateria nuevaBateria = new Bateria(bateria.estado); //NUEVO OBJETO, NUEVA BATERIA
        return new FichaLaptop(codigo, nuevaBateria);
    }

    public void mostrar() {
        System.out.println("Laptop: " + codigo);
        System.out.println("Batería: " + bateria.estado);
        System.out.println("-------------------");
    }
}

public class Singleton_caso_importante {
    public static void main(String[] args) {

        // Creamos la ficha original.
        FichaLaptop original =
                new FichaLaptop("LAP-001", new Bateria("Buena"));

        // Creamos las dos clases de copia.
        FichaLaptop superficial = original.clonarSuperficial();//1era variable
        FichaLaptop profunda = original.clonarProfundo();//2da variable

        // Cambiamos el estado de la batería del original.
        original.bateria.estado = "Defectuosa";

        // Mostramos los tres objetos.
        System.out.println("ORIGINAL");
        original.mostrar();

        System.out.println("COPIA SUPERFICIAL");
        superficial.mostrar();

        System.out.println("COPIA PROFUNDA");
        profunda.mostrar();
    }
}
