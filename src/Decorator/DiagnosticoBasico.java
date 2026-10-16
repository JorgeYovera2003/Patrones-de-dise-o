/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author user
 */
public class DiagnosticoBasico implements Diagnostico{

    @Override
    public void ejecutar() {
        System.out.println("Diagnostico basico: revisando la laptop...");
    }
    
}
