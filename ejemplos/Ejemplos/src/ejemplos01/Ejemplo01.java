/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        //String miCiudad = obtenerCiudadMayuscula("Loja");
        //System.out.printf("%s\n", miCiudad);
        obtenerMultiplicacion(7, 50);
        
        String miMensaje = obtenerMultiplicacionDos(7, 50);
        System.out.printf("%s\n",miMensaje);
    }
    
    public static String obtenerMultiplicacionDos(int tabla, int limite) {
        String cadenaFinal = "";
        int resultado;
        for (int i = 1; i <= limite; i++) {
            resultado = tabla * i;
            cadenaFinal = String.format("%s%d * %d = %d\n",
                     cadenaFinal, tabla, i, resultado);
        }
        return cadenaFinal ;
    }

    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }

    public static void obtenerMultiplicacion(int tabla, int limite) {
        String cadenaFinal = "";
        int resultado;
        for (int i = 1; i <= limite; i++) {
            resultado = tabla * i;
            cadenaFinal = String.format("%s%d * %d = %d\n",
                     cadenaFinal, tabla, i, resultado);
        }
        System.out.printf("%s\n", cadenaFinal);
    }

    public static String obtenerNombre() {
        return "Luis";
    }

}
