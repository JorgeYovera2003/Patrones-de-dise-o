/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Adapter;

/**
 *
 * @author user
 */
public class Main_Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HerramientaAntigua herraAntigua = new HerramientaAntigua();
        
        HerramientaDiagnostico herraDiag = new AdaptadorDiagnostico(herraAntigua);
        
        herraDiag.ejecutarDiagnostico();
    }
    
}
