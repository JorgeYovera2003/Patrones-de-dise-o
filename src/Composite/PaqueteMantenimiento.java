/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;
import java.util.*;

/**
 *
 * @author user
 */
public class PaqueteMantenimiento implements TareaMantenimiento{
    private String nombre;
    
    private List<TareaMantenimiento> conjuntoTareas = new ArrayList<>();

    public PaqueteMantenimiento(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarTarea(TareaMantenimiento tarea){
        conjuntoTareas.add(tarea);
    }

    @Override
    public void ejecutar() {
        System.out.println("Iniciando paquete: " + nombre);
        
        for(TareaMantenimiento t: conjuntoTareas){
            t.ejecutar();
        }
    }
    
    
}
