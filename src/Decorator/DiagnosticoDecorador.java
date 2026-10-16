/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author user
 */
public abstract class DiagnosticoDecorador implements Diagnostico{
    protected Diagnostico diag;

    public DiagnosticoDecorador(Diagnostico diag) {
        this.diag = diag;
    }
    
    @Override
    public void ejecutar() {
        diag.ejecutar();
    }
}
