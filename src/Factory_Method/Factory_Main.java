/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory_Method;

/**
 *
 * @author user
 */
public class Factory_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaInformes fabrica = new FabricaReparacion();
        
        fabrica.procesarInforme();
        
        fabrica = new FabricaDiagnostico();
        
        fabrica.procesarInforme();
        
        fabrica = new FacricaMantenimiento();
        
        fabrica.procesarInforme();
    }
    
    
    
}
