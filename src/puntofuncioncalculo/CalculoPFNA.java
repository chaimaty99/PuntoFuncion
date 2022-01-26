/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntofuncioncalculo;

/**
 *
 * @author David
 */
public class CalculoPFNA {

    private int CFLI,  CFLE,  CCE, CEE, CSE;
    private int PFNA;
    
    public CalculoPFNA(int num1, int num2,int  num3,int num4,int num5) {
        this.CCE=num5;
        this.CEE=num3;
        this.CFLE=num2;
        this.CFLI=num1;
        this.CSE=num4;
        this.PFNA = CCE + CEE + CFLE + CFLI + CSE;
    
    }
    
    public CalculoPFNA(){
        
        
    }
    
    public int GetPFNA(){
        return PFNA;
    }
    
    
    public void tabla(){
        
        System.out.println("Descripcion                             |   Total P.F");
        System.out.println("Nº de entradas externas                 |   " + CEE );
        System.out.println("Nº de salidas externas                  |   " + CSE);
        System.out.println("Nº grupos logicos de datos internos     |   " + CFLI);
        System.out.println("Nº grupos logicos de datos de interfaz  |   " + CFLI );
        System.out.println("Nº de consultas externas                |   " + CCE);
        System.out.println("PFNA                                    |   " + PFNA);
        
    }
    
}
