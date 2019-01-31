/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaexemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class WinIO extends IO{

    public WinIO() {
    }


    @Override
    public void imprimir(float numero) {
        JOptionPane.showMessageDialog(null, numero);
    }

    @Override
    public void imprimir(int numero) {
        JOptionPane.showMessageDialog(null, numero);
    }
    
}
