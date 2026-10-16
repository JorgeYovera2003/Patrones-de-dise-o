/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 * Hasta el momento se ha visto
 * Singleton: una instancia compartida por distintas partes del programa.
 * Prototype: crear objetos nuevos copiando uno existente.
 * Ahora se verá: <Builder>
 * Este nos enseñará:
 * A construir un objeto paso a paso, eligiendo qué <datos> tendrá.
 * 
 * Imaginemos que este programa debe crear <Fichas de diagnostico>
 * con informacion como las qu están en los atributos. <Como un formulario
 * que te hacen llenar cuando realizas un tramite en algun banco
 * u hospital>. Hasta ahi todo bien, el problema aparece cuando
 * algunos datos son obligatorios y otros son <opcionales>
 * 
 * Por ejemplo, una laptop puede llegar al taller
 * sin que conozcas todavía su procesador o capacidad de almacenamiento.
 * Sin embargo, sí necesitas registrar su código y marca.
 * 
 * Entonces podriamos crear el constructor y que reciba los parametros que conozcamos
 * pero si fueran muchos parametros seria dificl recordar y en que orden iría.
 * <Entonces ahi entra builder> para crear  el objeto con datos que si conozcamos
 * 
 * 
 * <Entonces empecemos>
 * Vamos a crear una ficha de diagnóstico.
 * El código utiliza una clase interna llamada Builder,
 * que es la encargada de preparar los datos.
 */
public class FichaDiagnostico {

    // Datos de la ficha.
    private final String codigo;
    private final String marca;
    private final String modelo;
    private final String procesador;
    private final int memoriaRAM;
    private final int capacidadSSD;
    private final String observaciones;

    // Constructor privado: solo Builder construirá la ficha.
    private FichaDiagnostico(Builder objetoBuilder) {
        this.codigo = objetoBuilder.codigo;
        this.marca = objetoBuilder.marca;
        this.modelo = objetoBuilder.modelo;
        this.procesador = objetoBuilder.procesador;
        this.memoriaRAM = objetoBuilder.memoriaRAM;
        this.capacidadSSD = objetoBuilder.capacidadSSD;
        this.observaciones = objetoBuilder.observaciones;
    }

    // Clase encargada de preparar los datos antes de crear la ficha.
    public static class Builder {

        // Datos obligatorios.
        private final String codigo;
        private final String marca;

        // Datos opcionales, con valores iniciales.
        private String modelo = "No especificado";
        private String procesador = "No identificado";
        private int memoriaRAM = 0;
        private int capacidadSSD = 0;
        private String observaciones = "Sin observaciones";

        // Constructor del Builder: exige código y marca.
        public Builder(String codigo, String marca) {
            this.codigo = codigo;
            this.marca = marca;
        }

        // Permite agregar el modelo de la laptop.
        public Builder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        // Permite agregar el procesador.
        public Builder procesador(String procesador) {
            this.procesador = procesador;
            return this;
        }

        // Permite indicar la cantidad de RAM.
        public Builder memoriaRAM(int memoriaRAM) {
            this.memoriaRAM = memoriaRAM;
            return this;
        }

        // Permite indicar la capacidad del SSD.
        public Builder capacidadSSD(int capacidadSSD) {
            this.capacidadSSD = capacidadSSD;
            return this;
        }

        // Permite agregar observaciones del técnico.
        public Builder observaciones(String observaciones) {
            this.observaciones = observaciones;
            return this;
        }

        // Construye y devuelve la ficha definitiva.
        public FichaDiagnostico build() {
            return new FichaDiagnostico(this);
        }
    }

    // Muestra los datos de la ficha construida.
    public void mostrarFicha() {
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + memoriaRAM + " GB");
        System.out.println("SSD: " + capacidadSSD + " GB");
        System.out.println("Observaciones: " + observaciones);
    }

    
}

