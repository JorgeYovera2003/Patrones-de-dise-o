/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author user
 */
public class AdaptadorDiagnostico implements HerramientaDiagnostico{
    
    private HerramientaAntigua herramientaAntigua;
    
    public AdaptadorDiagnostico(HerramientaAntigua herramientaAntigua){
        this.herramientaAntigua = herramientaAntigua;
    }
    
    @Override
    public void ejecutarDiagnostico() {
        herramientaAntigua.iniciarRevision();
    }
    
}
