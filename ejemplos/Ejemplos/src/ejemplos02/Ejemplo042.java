/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo042 {

    public static void main(String[] args) {
        // 
        int[][] arreglo1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3 = new int[3][3];
        int[][] arreglo4 = new int[3][3]; // Agrego otra variable para agregar 
                                          // la matriz que se va a sumar 

        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo3[i][j] = obtenerMultiplicacion(arreglo1[i][j],
                        arreglo2[i][j]);
            }
        }
        
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo4[i][j] = obtenerSuma(arreglo1[i][j],
                        arreglo2[i][j],arreglo3[i][j]);
                
                /*
                Agregue dos ciclos for para recorrer el arreglo que va a 
                obtener los datos de la suma es decir queden guardados en 
                arreglo4
                */
            }
        }

        obtenerReporte(arreglo1);
        obtenerReporte(arreglo2);
        obtenerReporte(arreglo3);
        obtenerReporte(arreglo4); //Agrego PROCEDIMIENTO que va llama
                                         // a su procedimiento y presenta en 
                                         //pantalla
    }
    
    public static int obtenerSuma(int a, int b, int c) {
        int operacion;
        operacion = a + b + c;
        return operacion;
        /*
        Creo un nuevo PROCEDIMIENTO que haga la operacion de suma de los 3 arreglos
        */

    }
    

    public static void obtenerReporte(int[][] arreglo1) {
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }

    public static int obtenerMultiplicacion(int a, int b) {
        int operacion;
        operacion = a * b;
        return operacion;

    }

}
