/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaexemplo;

/**
 *
 * @author ecollazodominguez
 */
public class Libreriaexemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero = IO.introducir(IO.VENTANA,IO.INT);
        IO.imprimir(numero, IO.VENTANA);
        System.out.println(numero);
                
        int numero2 = IO.introducirInt(IO.VENTANA);
        IO.imprimir(numero2, IO.CONSOLA);
        
        int numero3 = IO.introducirInt(IO.VENTANA,"¿Qué edad tienes?");
        IO.imprimir(numero3, IO.VENTANA);
    }
    
}
