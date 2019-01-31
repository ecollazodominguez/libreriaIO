    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaexemplo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class IO implements MetodosComunes {

    /**
     * Variable para indicar que será por consola
     */
    public final static int CONSOLA = 1;

    /**
     * Variable para indicar que será por ventana
     */
    public final static int VENTANA = 2;

    /**
     * Variable para indicar que será número int
     */
    public final static int INT = 3;

    /**
     * Variable para indicar que será número float
     */
    public final static int FLOAT = 4;

    enum Tipo {
        CONSOLA,
        VENTANA
    }
    /**
     * Método para introducir un número mediante teclado, int o float y se devuelva
     * @param conVen Introducimos Consola o Ventana dependiendo de donde
     * queramos que se muestre el método
     * @param intFloat Introducimos Int o Float dependiendo del número que
     * queramos
     * @return devuelve el número int introducido
     */
    public static float introducir(int conVen, int intFloat) {
        Scanner ler = new Scanner(System.in);
        float numero = 0;
        int marcador = 0;

        switch (intFloat) {
            case FLOAT:
                marcador = 0;
                break;
            case INT:
                marcador = 1;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error. Elige INT o FLOAT");
        }

        switch (conVen) {
            case CONSOLA:
                System.out.println("Introduzca número");
                numero = ler.nextFloat();
                if (marcador == 1) {
                    return (int) numero;
                } else {
                    return numero;
                }
            case VENTANA:
                numero = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca número"));

                if (marcador == 1) {
                    return (int) numero;
                } else {
                    return numero;
                }
            default:
                JOptionPane.showMessageDialog(null,"Error. Elige CONSOLA o VENTANA");
        }
        return numero;
    }

    /**
     *Método para introducir un número mediante teclado, int y se devuelva
     * @param conVen Introducimos Consola o Ventana dependiendo de donde
     * queramos que se muestre el método
     * @return devuelve el número int indicado
     */
    public static int introducirInt(int conVen) {
        Scanner ler = new Scanner(System.in);
        int numero = 0;

        switch (conVen) {
            case CONSOLA:
                System.out.println("Introduzca número");
                numero = ler.nextInt();
                return numero;
            case VENTANA:
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca número"));
                return numero;
            default:
                JOptionPane.showMessageDialog(null,"Error. Elige CONSOLA o VENTANA");
        }
        return numero;
    }

    /**
     *Método para introducir un número mediante teclado, float y se devuelva
     * @param conVen Introducimos Consola o Ventana dependiendo de donde
     * queramos que se muestre el método
     * @return devuelve el número float indicado
     */
    public static float introducirFloat(int conVen) {
        Scanner ler = new Scanner(System.in);
        float numero = 0;

        switch (conVen) {
            case CONSOLA:
                System.out.println("Introduzca número");
                numero = ler.nextFloat();
                return numero;
            case VENTANA:
                numero = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca número"));
                return numero;
            default:
                JOptionPane.showMessageDialog(null,"Error. Elige CONSOLA o VENTANA");
        }
        return numero;
    }

    /**
     *Método para introducir un número int y una pregunta mediante teclado y se devuelva el int
     * @param conVen Introducimos Consola o Ventana dependiendo de donde
     * queramos que se muestre el método
     * @param msg Escribimos un String que se mostrará al pedir número
     * @return devuelve el número int indicado
     */
    public static int introducirInt(int conVen, String msg) {
        Scanner ler = new Scanner(System.in);
        int numero = 0;

        switch (conVen) {
            case CONSOLA:
                System.out.println(msg);
                numero = ler.nextInt();
                return numero;
            case VENTANA:
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
                return numero;
            default:
                JOptionPane.showMessageDialog(null,"Error. Elige CONSOLA o VENTANA");
        }
        return numero;
    }

    /**
     * Método para introducir un número float y una pregunta mediante teclado y se devuelva el float
     * @param conVen Introducimos Consola o Ventana dependiendo de donde
     * queramos que se muestre el método
     * @param msg Escribimos un String que se mostrará al pedir número
     * @return devuelve el número float indicado
     */
    public static float introducirFloat(int conVen, String msg) {
        Scanner ler = new Scanner(System.in);
        float numero = 0;

        switch (conVen) {
            case CONSOLA:
                System.out.println(msg);
                numero = ler.nextFloat();
                return numero;
            case VENTANA:
                numero = Float.parseFloat(JOptionPane.showInputDialog(null, msg));
                return numero;
            default:
                JOptionPane.showMessageDialog(null,"Error. Elige CONSOLA o VENTANA");
        }
        return numero;
    }

    static public IO crearIO(Tipo tipo) {
        IO IOCreado;
        switch (tipo) {
            // creamos un dialogo de consola
            case CONSOLA:
                IOCreado = new ConsIO();
                break;
            // creamos un dialogo de ventana
            case VENTANA:
                IOCreado = new WinIO();
                break;
            default:
                IOCreado = null;
        }
        
        return IOCreado;

    }
    /**
     * Muestra en consola o ventana el número int almacenado en la variable.
     * @param numero Escribimos la variable donde se contiene el número int que
     * queremos que se muestre
     * @param ConVen Indicamos si lo hacemos por Consola o Ventana
     */
    public void imprimir(int numero) {
        }

    /**
     *Muestra en consola o ventana el número float almacenado en la variable.
     * @param numero Escribimos la variable donde contiene el número float
     * que queremos que se muestre
     * @param ConVen Indicamos si lo hacemos por Consola o Ventana
     */

    public void imprimir(float numero) {
    }
}
