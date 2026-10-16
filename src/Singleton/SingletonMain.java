/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton;

/**
 *
 * @author user
 */
public class SingletonMain {

    /**
     * Usualmente se iniciamos creando objetos no?
     * <"NombreDeLaClase variable = new NombreDeLaClase();">
     * bueno, esta vez es diferente, solo llamamos a la clase y al metodo que
     * maneja al objeto ya creado. Luis donde se crea el objeto? se crea dentro
     * de la misma imagen. Pero esa instancia la debemos guardar en una variable
     * del mismo tipo de la clase. Por ejemplo si queremos guardar valores
     * enteros creamos variables de tipo int, bueno en este caso, neccesitamos
     * algo que maneje una instancia o valor que sea de tipo
     * <"RegistroMantenimiento"> entonces...? Creemos la variable de ese tipo.
     * Recordemos que el metodo @getInstancia es estatico por lo que no
     * neccesita de objetos exsitentes para acceder a el. Solo basta con llamar
     * a su clase y ya.
     */
    public static void main(String[] args) {
        
        //otrorga/entrega/devuelve un objeto de la clase ya creado
        RegistroMantenimiento registro1
                = RegistroMantenimiento.getInstancia(); 
        
        
        
        

        // Registra un trabajo para una laptop.
        registro1.registrarTrabajo(
                "LAP-001",
                "Limpieza interna y cambio de pasta térmica"
        );

        // Solicita nuevamente la misma instancia.
        RegistroMantenimiento registro2
                = RegistroMantenimiento.getInstancia();

        // Registra otro trabajo usando la segunda referencia.
        registro2.registrarTrabajo(
                "LAP-002",
                "Ampliación de memoria RAM"
        );

        // Comprueba si ambas referencias apuntan al mismo objeto.
        System.out.println(
                "¿Es el mismo objeto? " + (registro1 == registro2)
        );

        // Muestra los trabajos guardados en el registro central.
        registro1.mostrarTrabajos();
    }

}
