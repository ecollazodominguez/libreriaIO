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
public class ConsIO extends IO {

    public ConsIO() {
    }

    
    @Override
    public void imprimir(float numero) {
        System.out.println(numero);
    }

    @Override
    public void imprimir(int numero) {
        System.out.println(numero);
    }
    
}
