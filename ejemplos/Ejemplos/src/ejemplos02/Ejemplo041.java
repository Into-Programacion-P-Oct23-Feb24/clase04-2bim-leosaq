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
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        int[][] arreglo1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3 = new int[3][3];
        
        for (int f = 0; f < arreglo1.length; f++) {
            for (int c = 0; c < arreglo1[f].length; c++) {
                arreglo3[f][c] = obtenerMultiplicacion(arreglo1[f][c],
                        arreglo2[f][c]);
                /*
                Utilizo estos ciclos for para poder recorrer y declarar los 
                valores que voy a usar para la funcion de arreglo3
                */
            }
        }
        for (int f = 0; f < arreglo1.length; f++) {
            for (int c = 0; c < arreglo1.length; c++) {
                System.out.printf("%s\t",arreglo1[f][c]);
                /*
                Utilizo los ciclos for para recorrer la matriz y asi poder 
                presentarla, uso \t que equivale a un TAB de teclado y con ello
                puedo presentar de forma visual las 3 columnas | | |
                */
            }
            System.out.println("");
            //Uso este print para 
        }
        System.out.println("\n");
        for (int f = 0; f < arreglo2.length; f++) {
            for (int c = 0; c < arreglo2.length; c++) {
                System.out.printf("%s\t", arreglo2[f][c]);
            }
            System.out.println("");
        }
        System.out.println("\nEl resultado de la multiplicacion es:\n");
        for (int f = 0; f < arreglo3.length; f++) {
            for (int c = 0; c < arreglo3.length; c++) {
                System.out.printf("%s\t", arreglo3[f][c]);
            }
            System.out.println("");
        }

    }

    public static int obtenerMultiplicacion(int a, int b) {
        int operacion;
        operacion = a * b;
        return operacion;
        /*
            FUNCION implementada para hacer la multiplicacion de las matrices 
        */
    }

}
