/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISBSG;

/**
 *
 * @author David
 */
public class TablaEsfuerzo {
    
    public void MostrarTablaEsfuerzo(){
        System.out.println("Características relacionadas con el esfuerzo");
        System.out.println("MF");
        System.out.println("MR");
        System.out.println("PC");
        System.out.println("Multi");
        System.out.println("3GL");
        System.out.println("4GL");
        System.out.println("GenAp");
        System.out.println("Mantenimiento");
        System.out.println("Nuevo");
        System.out.println("MF-3GL");
        System.out.println("MF-4GL");
        System.out.println("MF-GenAp");
        System.out.println("MR-3GL");
        System.out.println("MR-4GL");
        System.out.println("PC-3GL");
        System.out.println("PC-4GL");
        System.out.println("Multi-3GL");
        System.out.println("Multi-4GL");
        System.out.println("MF-3GL-Mantenimiento");
    }
    
    public double SeleccionarEsfuerzo(String e, double PFA){
        
        double Esfuerzo = 0;
        
        switch(e){
            case "MF": 
                Esfuerzo = 49.02*(Math.pow(PFA, 0.736));
                break;
            case "MR":
                Esfuerzo = 78.88*(Math.pow(PFA, 0.646));
                break;
            case "PC":
                Esfuerzo = 48.90*(Math.pow(PFA, 0.661));
                break;
            case "Multi":
                Esfuerzo = 16.01*(Math.pow(PFA, 0.865));
                break;
            case "3GL":
                Esfuerzo = 54.65*(Math.pow(PFA, 0.717));
                break;
            case "4GL":
                Esfuerzo = 29.50*(Math.pow(PFA, 0.758));
                break;
            case "GenAp":
                Esfuerzo = 68.11*(Math.pow(PFA, 0.660));
                break;
            case "Mantenimiento":
                Esfuerzo = 52.58*(Math.pow(PFA, 0.683));
                break;
            case "Nuevo":
                Esfuerzo = 39.05*(Math.pow(PFA, 0.731));
                break;
            case "MF-3GL":
                Esfuerzo = 65.37*(Math.pow(PFA, 0.705));
                break;
            case "MF-4GL":
                Esfuerzo = 52.09*(Math.pow(PFA, 0.640));
                break;
            case "MF-GenAp":
                Esfuerzo = 65.68*(Math.pow(PFA, 0.692));
                break;
            case "MR-3GL":
                Esfuerzo = 126.3*(Math.pow(PFA, 0.565));
                break;  
            case "MR-4GL":
                Esfuerzo = 65.35*(Math.pow(PFA, 0.694));
                break;
            case "PC-3GL":
                Esfuerzo = 60.46*(Math.pow(PFA, 0.648));
                break;
            case "PC-4GL":
                Esfuerzo = 36.48*(Math.pow(PFA, 0.694));
                break;
            case "Multi-3GL":
                Esfuerzo = 19.82*(Math.pow(PFA, 0.666));
                break;
            case "Multi-4GL":
                Esfuerzo = 6.49*(Math.pow(PFA, 0.983));
                break;
            case "MF-3GL-Mantenimiento":
                Esfuerzo = 83.27*(Math.pow(PFA, 0.650));
                break;
            default: 
                System.out.println("Error al introducir la caracteristica");
        }
        
        return Esfuerzo;
    }
}
