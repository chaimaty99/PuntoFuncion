/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntofuncioncalculo;

import CaracteristicasGenerales.CaractGenerales;

/**
 *
 * @author Chaima
 */
public class AjusteFinalPFA {
    
    CalculoPFNA pfna = new CalculoPFNA();
    CaractGenerales Carg=new CaractGenerales();
    private double FA;
    private double PFA;
    
    public AjusteFinalPFA(CalculoPFNA pfna,CaractGenerales caracg){
        this.pfna=pfna;
        this.Carg=caracg;
    }
    
    public double calcularFA(){
        
        FA=0.65+(0.01*Carg.getSVA());
        return FA;
    }
    
    public double calculoPFA(){
        
        PFA=pfna.GetPFNA()*FA;
        
        return PFA;
    }
    
    public double GetPFA(){
        
        return PFA;
    }
    
    public double mostrarAjusteFinal(){
        
        //double ResPFA = calculoPFA();
        
        System.out.println("\n");
        System.out.println("-----------AJUSTE FINAL-----------");
        System.out.println("       FA = " + calcularFA());
        System.out.println("       PFA = " + calculoPFA() + "\n\n");
        
        return calculoPFA();
    }
    
}
