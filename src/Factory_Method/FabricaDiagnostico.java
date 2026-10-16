/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory_Method;

/**
 *
 * @author user
 */
public class FabricaDiagnostico extends FabricaInformes{

    @Override
    public Informe generarInforme() {
        return new InformeDeDiagnostico();
    }
    
}
