/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Builder;

/**
 *
 * @author user
 */
public class Builder_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Construimos una ficha con varios datos.
        FichaDiagnostico ficha1 = new FichaDiagnostico.Builder(
                "LAP-001", "Lenovo")
                .modelo("ThinkPad E14")
                .procesador("Intel Core i5")
                .memoriaRAM(16)
                .capacidadSSD(512)
                .observaciones("Carcasa con golpes")
                .build();

        // Construimos otra ficha utilizando solo los datos obligatorios.
        FichaDiagnostico ficha2 = new FichaDiagnostico.Builder(
                "LAP-002", "HP")
                .build();

        System.out.println("PRIMERA FICHA");
        ficha1.mostrarFicha();

        System.out.println("\nSEGUNDA FICHA");
        ficha2.mostrarFicha();
    }  

}
