/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.max;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class JUnitMax {

    public static void main(String[] args) {
        
        //Menú Principal
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do {
            menu();
            opcion = teclado.nextInt();
            
            switch(opcion){
                
                case 1:
                    correcto();
                    break;
                case 2:
                    test1();
                    break;
                case 3:
                    test2();
                    break;
                case 4:
                    test3();
                    break;
                case 5:
                    test4();
                    break;
                case 6:
                    test5();
                    break;
                case 7:
                    test6();
                    break;
                case 8:
                    System.out.println("\nFin de la ejecución.");
                    cerrar();
                    break;
                default:
                    System.out.println("\nElige una opción válida.");
                    break;
            }
        }
        while(opcion != 8);

    }
    
    public static void menu() {
        
        System.out.println("\n ~ JUnit Test Menu ~ \n");
        System.out.println("1. Realizar TODAS las Pruebas [CORRECTO].");        
        System.out.println("2. Realizar PRUEBA #1 [Array Vacío]");
        System.out.println("3. Realizar PRUEBA #2 [Array con un Elemento]");        
        System.out.println("4. Realizar PRUEBA #3 [Array con Varios Elementos]");    
        System.out.println("5. Realizar PRUEBA #4 [Array Desordenado]");    
        System.out.println("6. Realizar PRUEBA #5 [Array Variado con Números Negativos]");    
        System.out.println("7. Realizar PRUEBA #6 [Array NULL]");
        System.out.println("8. Salir.");
        System.out.print("\nIntroduce una opción: \n");
    }
    
    public static void correcto() {
        
        //PRUEBA 1 (Array Vacío)
        System.out.println("\n----------- PRUEBA 1 -----------");
        System.out.println("DESCRIPCIÓN: Array Vacío\n");
        int[] a = {};
        int max1 = MasGrande.max(a);

        System.out.println("Valor esperado: 0");
        System.out.println("Valor obtenido: " + max1+"\n");

        if (max1 == 0) {
            System.out.println("Prueba realizada correctamente.");
        } else {
            System.out.println("Error, los resultados no son los esperados.");
        }
        System.out.println("--------------------------------\n");

        
        //PRUEBA 2 (Array con un Elemento)
        System.out.println("\n----------- PRUEBA 2 -----------");
        System.out.println("DESCRIPCIÓN: Array con un Elemento\n");
        int[] b = {5};
        int max2 = MasGrande.max(b);

        System.out.println("Valor esperado: 5");
        System.out.println("Valor obtenido: " + max2+"\n");

        if (max2 == 5) {
            System.out.println("Prueba realizada correctamente.");
        } else {
            System.out.println("Error, los resultados no son los esperados.");
        }
        System.out.println("--------------------------------\n");
        
        
        //PRUEBA 3 (Array con Varios Elementos)
        System.out.println("\n----------- PRUEBA 3 -----------");
        System.out.println("DESCRIPCIÓN: Array con Varios Elementos\n");

        int[] c = {1, 3, 5};
        int max3 = MasGrande.max(c);

        System.out.println("Valor esperado: 5");
        System.out.println("Valor obtenido: " + max3+"\n");

        if (max3 == 5) {
            System.out.println("Prueba realizada correctamente.");
        } else {
            System.out.println("Error, los resultados no son los esperados.");
        }
        System.out.println("--------------------------------\n");
        
        
        //PRUEBA 4 (Array con Varios Elementos Desordenados)
        System.out.println("\n----------- PRUEBA 4 -----------");
        System.out.println("DESCRIPCIÓN: Array con Varios Elementos desordenados\n");

        int[] d = {1, 5, 7, 3};
        int max4 = MasGrande.max(d);

        System.out.println("Valor esperado: 7");
        System.out.println("Valor obtenido: " + max4+"\n");

        if (max4 == 7) {
            System.out.println("Prueba realizada correctamente.");
        } else {
            System.out.println("Error, los resultados no son los esperados.");
        }
        System.out.println("--------------------------------\n");
        
        
        //PRUEBA 5 (Array con Varios Elementos y Números Negativos)
        System.out.println("\n----------- PRUEBA 5 -----------");
        System.out.println("DESCRIPCIÓN: Array con Varios Elementos y Números Negativos\n");

        int[] e = {4, -6, 9, -8, 1};
        int max5 = MasGrande.max(e);

        System.out.println("Valor esperado: 9");
        System.out.println("Valor obtenido: " + max5+"\n");

        if (max5 == 9) {
            System.out.println("Prueba realizada correctamente.");
        } else {
            System.out.println("Error, los resultados no son los esperados.");
        }
        System.out.println("--------------------------------\n");
        
        //PRUEBA 6 (Array Nulo)
        System.out.println("\n----------- PRUEBA 6 -----------");
        System.out.println("DESCRIPCIÓN: Array Nulo\n");

        try {
            int[] f = null;
            int max6 = MasGrande.max(f);

            System.out.println("Valor esperado: null");
            System.out.println("Valor obtenido: " + max6+"\n");

            Integer nulo = null;

            if (max6 != nulo) {
                System.out.println("Error, los resultados no son los esperados.");
            }

        } catch (NullPointerException n) {
            System.out.println("Prueba realizada correctamente.");
        }
        System.out.println("--------------------------------\n");

    }
    
    public static void test1() {
        
        //PRUEBA 1 (Array Vacío)
        System.out.println("\n----------- PRUEBA 1 -----------");
        System.out.println("DESCRIPCIÓN: Array Vacío\n");
        int[] a = {};
        int max1 = MasGrande.max(a);

        System.out.println("Valor esperado: 0");
        System.out.println("Valor obtenido: " + max1 + "\n");

        if (max1 == 0) {
            System.out.println("Prueba realizada correctamente.");
        } else {
            System.out.println("Error, los resultados no son los esperados.");
        }
        System.out.println("--------------------------------\n");

    }
    
    public static void test2() {

        //PRUEBA 2 (Array con un Elemento)
        System.out.println("\n----------- PRUEBA 2 -----------");
        System.out.println("DESCRIPCIÓN: Array con un Elemento\n");
        int[] b = {5};
        int max2 = MasGrande.max(b);

        System.out.println("Valor esperado: 5");
        System.out.println("Valor obtenido: " + max2 + "\n");

        if (max2 == 5) {
            System.out.println("Prueba realizada correctamente.");
        } else {
            System.out.println("Error, los resultados no son los esperados.");
        }
        System.out.println("--------------------------------\n");

    }
    
    public static void test3() {
        
        //PRUEBA 3 (Array con Varios Elementos)
        System.out.println("\n----------- PRUEBA 3 -----------");
        System.out.println("DESCRIPCIÓN: Array con Varios Elementos\n");

        int[] c = {1, 3, 5};
        int max3 = MasGrande.max(c);

        System.out.println("Valor esperado: 5");
        System.out.println("Valor obtenido: " + max3 + "\n");

        if (max3 == 5) {
            System.out.println("Prueba realizada correctamente.");
        } else {
            System.out.println("Error, los resultados no son los esperados.");
        }
        System.out.println("--------------------------------\n");
        
    }
    
    public static void test4() {
        
        //PRUEBA 4 (Array con Varios Elementos Desordenados)
        System.out.println("\n----------- PRUEBA 4 -----------");
        System.out.println("DESCRIPCIÓN: Array con Varios Elementos desordenados\n");

        int[] d = {1, 5, 7, 3};
        int max4 = MasGrande.max(d);

        System.out.println("Valor esperado: 7");
        System.out.println("Valor obtenido: " + max4 + "\n");

        if (max4 == 7) {
            System.out.println("Prueba realizada correctamente.");
        } else {
            System.out.println("Error, los resultados no son los esperados.");
        }
        System.out.println("--------------------------------\n");
        
    }

    public static void test5() {

        //PRUEBA 5 (Array con Varios Elementos y Números Negativos)
        System.out.println("\n----------- PRUEBA 5 -----------");
        System.out.println("DESCRIPCIÓN: Array con Varios Elementos y Números Negativos\n");

        int[] e = {4, -6, 9, -8, 1};
        int max5 = MasGrande.max(e);

        System.out.println("Valor esperado: 9");
        System.out.println("Valor obtenido: " + max5 + "\n");

        if (max5 == 9) {
            System.out.println("Prueba realizada correctamente.");
        } else {
            System.out.println("Error, los resultados no son los esperados.");
        }
        System.out.println("--------------------------------\n");

    }
    
    public static void test6() {

        //PRUEBA 6 (Array Nulo)
        System.out.println("\n----------- PRUEBA 6 -----------");
        System.out.println("DESCRIPCIÓN: Array Nulo\n");

        try {
            int[] f = null;
            int max6 = MasGrande.max(f);

            System.out.println("Valor esperado: null");
            System.out.println("Valor obtenido: " + max6 + "\n");

            Integer nulo = null;

            if (max6 != nulo) {
                System.out.println("Error, los resultados no son los esperados.");
            }

        } catch (NullPointerException n) {
            System.out.println("Prueba realizada correctamente.");
        }
        System.out.println("--------------------------------\n");

    }
    
    public static void cerrar() {
        exit(0);
    }
}
