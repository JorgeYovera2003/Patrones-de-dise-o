/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Decorator;

/**
 *
 * @author user
 */
public class Main_decorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diagnostico diag = new DiagnosticoBasico();
        
        Diagnostico diagg = new DecoradorRegistro(new DecoradorTiempo(diag));
        
        diagg.ejecutar();
    }
    
}
