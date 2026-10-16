/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author user
 */
public class ServicioMack {
    private Diagnosticar diag;
    private Reparacion repa;
    private Informe info;
    
    public ServicioMack(){
        this.diag = new Diagnosticar();
        this.repa = new Reparacion();
        this.info = new Informe();
    }
    
    
    public void realizaServicio(){
        diag.diagnosticar();
        repa.reparando();
        info.generadorInforme();
    }
}
