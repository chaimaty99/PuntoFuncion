/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package puntofuncioncalculo;

import ElementosFuncionales.ConsultaExterna;
import ElementosFuncionales.EntradaExterna;
import ElementosFuncionales.FicheroLogicoExterno;
import ElementosFuncionales.FicheroLogicoInterno;
import ElementosFuncionales.SalidaExterna;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class PuntoFuncionCalculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int FLI, FLE, CE, EE, SE;
        int RFLI, RFLE, RCE, REE, RSE;
        
        
        String complFLI = "";
        int complfli=0;
        String complFLE = "";
        int complfle=0;
        String complEE = "";
        int complee=0;
        String complSE = "";
        int complse=0;
        String complCE = "";
        int complce=0;
        
        ConsultaExterna ConsultaExterna = new ConsultaExterna();
        EntradaExterna EntradaExterna = new EntradaExterna();
        SalidaExterna SalidaExterna = new SalidaExterna();
        FicheroLogicoExterno FicheroLogicoExterno = new FicheroLogicoExterno();
        FicheroLogicoInterno FicheroLogicoInterno = new FicheroLogicoInterno();
        
        
        System.out.println("Ficheros referenciados en ficheros logicos internos:");
        RFLI = sc.nextInt();
        System.out.println("Datos elementales de ficheros logicos internos: ");
        FLI = sc.nextInt();
        System.out.println("Ficheros referenciados en ficheros logicos externos:");
        RFLE = sc.nextInt();
        System.out.println("Datos elementales de ficheros logicos externos: ");
        FLE = sc.nextInt();
        System.out.println("Ficheros referenciados en consultas externas:");
        RCE = sc.nextInt();
        System.out.println("Datos elementales de consultas externas: ");
        CE = sc.nextInt();
        System.out.println("Ficheros referenciados en entradas externas:");
        REE = sc.nextInt();
        System.out.println("Datos elementales de entradas externas: ");
        EE = sc.nextInt();
        System.out.println("Ficheros referenciados en salidas externas: ");
        RSE = sc.nextInt();
        System.out.println("Datos elementales de salidas externas: ");
        SE = sc.nextInt();
        
        //Obtengo la complejidad una vez que he introducido el numero de datos elementales y registros de cada elemento funcional
        
        complFLE = FicheroLogicoExterno.GetComplejidad(RFLE, FLE);
        complFLI = FicheroLogicoInterno.GetComplejidad(RFLI, FLI);
        complEE = EntradaExterna.GetComplejidad(REE, EE);
        complSE = SalidaExterna.GetComplejidad(RSE, SE);
        complCE = ConsultaExterna.GetComplejidad(complEE, complSE);
        
        if(complFLE=="S"){
            complfle=5;
        }else if(complFLE=="M"){
            complfle=7;
        }else complfle=10;
        
        if(complFLI=="S"){
            complfli=7;
        }else if(complFLI=="M"){
            complfle=10;
        }else complfli=15;
        
        if(complSE=="S"){
            complse=4;
        }else if(complSE=="M"){
            complse=5;
        }else complse=7;
        
        if(complEE=="S"){
            complee=3;
        }else if(complEE=="M"){
            complee=4;
        }else complee=6;
        
        if(complCE=="S"){
            complce=3;
        }else if(complCE=="M"){
            complce=4;
        }else complce=6;
        
        
        int num1=RFLI*complfli;
        int num2=RFLE*complfle;
        int num3=REE*complee;
        int num4=RSE*complse;
        int num5=RCE*complce;
        
        
        
        System.out.println("\n\nComplejidad calculada con exito");
        CalculoPFNA pfna=new CalculoPFNA(num1,num2,num3,num4,num5);
        
        
    }
    
}
