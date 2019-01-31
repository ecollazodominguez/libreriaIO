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
        IO miIO=IO.crearIO(IO.Tipo.CONSOLA);
        miIO.imprimir(25.4f);
        IO otroIO=IO.crearIO(IO.Tipo.VENTANA);
        otroIO.imprimir(5);
    }
    
}
