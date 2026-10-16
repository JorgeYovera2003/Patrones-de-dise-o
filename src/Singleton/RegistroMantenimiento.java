/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;
import java.util.ArrayList;

/**
 *
 * @RegistroMantenimiento:
 * En castellano:
 * @Clase: es el molde que define cómo será un objeto.
 * @Instancia: es el objeto concreto que se crea a partir de ese molde.
 * @Patrón de diseño:
 * es una solución reutilizable para un problema habitual al programar.
 * Única instancia:
 * significa que el programa utiliza un solo objeto de esa clase, en lugar de crear varios.
 * Ejemplo en un taller de mantenimiento de laptops:
 * Imagina un programa que utiliza un registro central para guardar
 * los trabajos realizados en cada laptop:
 * limpieza, cambio de pasta térmica, ampliación de RAM, etc.
 * Si varias partes del programa crean sus propios registros,
 * podrías terminar con información repartida en distintos lugares.
 * @Class RegistroMantenimiento es una clase encargada de manejar
 * este problema. Creando el objeto dentro de ella mediante
 * metodos privado.
 */

public class RegistroMantenimiento {
    
    /***
     * La siguiente linea nos permite que la clase
     * guarde su unica instancia que compartirá el
     * programa. No saben que es una instancia?
     * Lean de nuevo el primer comentario de esta clase.
     */
    private static RegistroMantenimiento instancia =
            new RegistroMantenimiento(); //Luis, se podia hacer esto? si, se puede.
    
    
    
    /*Necesitamos un "conjunto" donde esta clase pueda guardar los registros(trabajos)
    el conjunto se llamara "repositorio".*/
    private static ArrayList<String> repositorio = new ArrayList<>();
    
    
    /**
     * <Lo que sigue>
     * Es el constructor privado. Porque privado? porque solo esta clase 
     * podrá crear los objetos "registro" que en este caso 
     * me refiero a la linea 37.
     * otras clases no podrán
     * utilizar "new RegistroMantenimiento()" directamente.
     */
    private RegistroMantenimiento(){
        System.out.println("Registro central  iniciado");
        
    }
    
    /***
     * <Siguiente metodo>
     * Este metodo permite que la clase entregue la unica instancia que esta crea
     * será estatico para cuando la llamemos desde otro lado del programa
     * solo lo hagamos con esta sintaxis:
     * NombreDeLaClase.nombreDelMetodo();
     */
    
    public static RegistroMantenimiento getInstancia(){
        return instancia;
    }
    
    /***
     * <Este:>
     * Este metodo permitirá registrar/guardar un trabajo de mantenimiento
     * que se haya realizado. En este caso, el ArrayList @repositorio
     * que se encuentra en la linea 43 (segun mi IDE) guarda puro "String"
     * pero en una aplicacion/implementacion real del codigo
     * para un proyecto, es probable que guardaramos otra clase no diversos String
     * Puede ser que queramos guardar "trabajos" realizados. 
     * Entonces, tendriamos que tener una clase Trabajo que permita crear
     * objetos trabajos para poder guardarlos en este ArrayList creado en
     * esta clase. Pero como les digo, en esta ocasion solo guarda String
     * para simular.
     * 
     * <Importante>: Menciona que este metodo @registrarTrabajo
     * necesita 2 requisitos o parametros para ejecutarse.
     * @param codigoLaptop: En este caso es String para realizar la simulacion
     * como sabran, algunas estructras de datos necesitan <Clave> y <Valor>
     * para guardar objetos. Supongamos que este es el caso.
     * <En cristiano>: El metodo @registrarTrabajo necesita 2 parametros/parametros
     * el equipo(en este caso laptop) que se ha trabajo y el trabajo que se le ha realizado
     * para asi CREAR el registro y guardar.
     */
    public void registrarTrabajo(String codigoLaptop, String trabajo){
        //Entonces
        //Simulamos la creacion del registro (sumamos ambos String)
        String registro = codigoLaptop +" - "+trabajo; //se puede hacer eso Luis? si.
        //Se puede sumar/concatener 2 String de esta manera. Tambien existe
        //la clase StringBuilder, averiguen, es importante esa clase.
        
        //PASO 2 AÑADIMOS EL REGISTRO A LA LISTA (EN ESTE CASO NUESTRO ARRAYLIST)
        repositorio.add(registro);
        
        //nos aseguramos de informa que se ha registrado con éxito.
        System.out.println("Trabajo realizado: " + registro);
        
        
    }
    
    /**
     * Este metodo nos mostrará todos los trabajos realizados.
     * Recordemos que los trabajos son objetos/instancias que
     * se manejan/manipulan dentro de esta clase.
     */
    public void mostrarTrabajos(){
        //siempre comprobar si la lista está vaci
        if(repositorio.isEmpty()){
            System.out.println("No hay trabajos registrados");
            return; //hacemos q el metodo termine aqui.
        }
        
        /**
         * <Bloque de codigo que se ejecuta en caso la lista
         * no esté vacía>. Como es una lista entonces vamos a recorrer con
         * for (segun la cantidad de datos q tengamos registrados
         */
        
        for(int i= 0; i <repositorio.size(); i++){
            System.out.println(repositorio.get(i));
        }
        
    }
    
    /**
     * Final de  la  clase, ahora se programará el main para este caso
     * y se pueda ejecutar la clase y demostrar
     * la implementacion de "singleton".
     */
    
    
}
