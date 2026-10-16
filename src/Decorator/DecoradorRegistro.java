/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author user
 */
public class DecoradorRegistro extends DiagnosticoDecorador{
    
    public DecoradorRegistro(Diagnostico diag) {
        super(diag);
    }
    
    @Override
    public void ejecutar() {
        System.out.println("[log] iniciando el diagnostico");
        
        super.ejecutar();
        
        System.out.println("Finaliznado ejecucion");
    }
}
