/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resultado;

/**
 *
 * @author David
 */
public class Complejidad {
    
    private static int SIMPLE = 1;
    private static int MEDIA = 2;
    private static int COMPLEJA = 3;
    private int c;

    private Complejidad(int c) {
        this.c = c;
    }

    public int getComplejidad() {
        return c;
    }
    
}

