/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory_Method;

/**
 *
 * @author user
 */
public class InformeMantenimiento implements Informe{

    @Override
    public void generar() {
        System.out.println("Se ha generado un informe de mantenimiento.");
    }
    
    public void metodoPropio(){
        System.out.println("Soy metodo propio de informe mantenimiento");
    }
    
}
