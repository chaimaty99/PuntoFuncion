/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISBSG;

/**
 *
 * @author David
 */
public class TablaDuracion {
    
    public void MostrarTablaDuracion(){
        System.out.println("Características relacionadas con la duracion");
        System.out.println("PC");
        System.out.println("Multi");
        System.out.println("4GL");
        System.out.println("Nuevo");
        System.out.println("PC-4GL");
        System.out.println("Multi-4GL");
        System.out.println("PC-4GL-Nuevo");
        System.out.println("Multi-4GL-Nuevo");
    }
    
    public double SeleccionarDuracion(String d, double PFA){
        
        double Duracion = 0;
        
        switch(d){
            case "PC":
                Duracion = 0.503*(Math.pow(PFA, 0.409));
                break;
            case "Multi":
                Duracion = 0.679*(Math.pow(PFA, 0.341));
                break;
            case "4GL":
                Duracion = 0.578*(Math.pow(PFA, 0.393));
                break;
            case "Nuevo":
                Duracion = 0.739*(Math.pow(PFA, 0.359));
                break;
            case "PC-4GL":
                Duracion = 0.348*(Math.pow(PFA, 0.471));
                break;
            case "Multi-4GL":
                Duracion = 0.366*(Math.pow(PFA, 0.451));
                break;
            case "PC-4GL-Nuevo":
                Duracion = 0.250*(Math.pow(PFA, 0.515));
                break;
            case "Multi-4GL-Nuevo":
                Duracion = 0.240*(Math.pow(PFA, 0.518));
                break;
        }
        
        return Duracion;
    }
}
