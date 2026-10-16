/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Composite;

/**
 *
 * @author user
 */
public class Main_Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PaqueteMantenimiento hardware = new PaqueteMantenimiento("Revision de Hardware");

        ActualizacionDriver d = new ActualizacionDriver();
        hardware.agregarTarea(d);
        hardware.agregarTarea(new RevisionBateria());
        hardware.agregarTarea(new LimpiezaVentilador());

        PaqueteMantenimiento software
                = new PaqueteMantenimiento("Revisión de software");
        
        
        software.agregarTarea(new ActualizacionDriver());

        // Paquete principal que contiene a los otros dos paquetes.
        PaqueteMantenimiento completo
                = new PaqueteMantenimiento("Mantenimiento completo");
        completo.agregarTarea(hardware);
        completo.agregarTarea(software);

        // Una sola llamada ejecuta todo el árbol.
        completo.ejecutar();
    }

}
