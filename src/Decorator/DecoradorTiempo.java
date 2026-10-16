/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author user
 */
public class DecoradorTiempo extends DiagnosticoDecorador {

    public DecoradorTiempo(Diagnostico diagnostico) {
        super(diagnostico);
    }

    @Override
    public void ejecutar() {
        long inicio = System.currentTimeMillis();

        super.ejecutar();

        long duracion = System.currentTimeMillis() - inicio;
        System.out.println("[TIEMPO] Duración: " + duracion + " ms");
    }
}
