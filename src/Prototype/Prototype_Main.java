/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prototype;

/**
 *
 * @author user
 */
public class Prototype_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creamos la ficha que servirá como modelo.
        FichaLaptop modelo
                = new FichaLaptop("MODELO", "Lenovo", 8);

        // Creamos un nuevo objeto copiando el modelo.
        FichaLaptop laptop1 = modelo.clonar();
        

        // Creamos otra copia independiente del modelo.
        FichaLaptop laptop2 = modelo.clonar();

        // Asignamos un código propio a cada laptop.
        laptop1.setCodigo("LAP-001");
        laptop2.setCodigo("LAP-002");

        // Modificamos la RAM de la segunda laptop.
        laptop2.setMemoriaRAM(16);

        // Mostramos el modelo y las dos copias.
        System.out.println("FICHA ORIGINAL");
        modelo.mostrarFicha();

        System.out.println("PRIMERA COPIA");
        laptop1.mostrarFicha();

        System.out.println("SEGUNDA COPIA");
        laptop2.mostrarFicha();

        // Comprobamos si son el mismo objeto.
        System.out.println(modelo == laptop1);
        System.out.println(laptop1 == laptop2);
    }

}
