/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaracteristicasGenerales;

import java.util.Scanner;

/**
 *
 * @author Chaima
 */
public class CaractGenerales {

    private int[] influencias;
    Tabla tabla;

    public CaractGenerales() {
        influencias = new int[14];
    }

    public int getinfluencia(int posicion) {
        return influencias[posicion];
    }

    public void setinfluencia(int influencia, int posicion) {
        
        if (influencia >= 0 && influencia < 6) {
            influencias[posicion] = influencia;
        }
    }
    
    public int getSVA(){
        
        int suma=0;
        for(int i=0; i<14;i++){
            
            suma=suma+influencias[i];
            
        }
        return suma;
    }

    public void pedirinfluencias(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("\n");
        System.out.println("------------------AJUSTE DE CARACTERÍSTICAS GENERALES--------------------------");
        System.out.println("Indica el valor de la influencia de la comunicacion de deatos del proyecto ");
        setinfluencia(sc.nextInt(),0);
        System.out.println("Indica el valor de la influencia de las funciones distribuidas del proyecto: ");
        setinfluencia(sc.nextInt(),1);
        System.out.println("Indica el valor de la influencia de las prestaciones del proyecto: ");
        setinfluencia(sc.nextInt(),2);
        System.out.println("Indica el valor de la influencia del gran uso de la configuracion del proyecto: ");
        setinfluencia(sc.nextInt(),3);
        System.out.println("Indica el valor de la influencia de la velocidad de las transacciones del proyecto: ");
        setinfluencia(sc.nextInt(),4);
        System.out.println("Indica el valor de la influencia de la entrada de datos en linea del proyecto: ");
        setinfluencia(sc.nextInt(),5);
        System.out.println("Indica el valor de la influencia del diseño para la eficiencia del usuario final del proyecto: ");
        setinfluencia(sc.nextInt(),6);
        System.out.println("Indica el valor de la influencia de la actualizacion de datos en linea del proyecto: ");
        setinfluencia(sc.nextInt(),7);
        System.out.println("Indica el valor de la influencia de la complejidad del proceso logico interno de la aplicacion del proyecto: ");
        setinfluencia(sc.nextInt(),8);
        System.out.println("Indica el valor de la influencia de la reusabilidad del codigo del proyecto: ");
        setinfluencia(sc.nextInt(),9);
        System.out.println("Indica el valor de la influencia de la facilidad de instalacion del proyecto: ");
        setinfluencia(sc.nextInt(),10);
        System.out.println("Indica el valor de la influencia de la facilidad de operacion del proyecto: ");
        setinfluencia(sc.nextInt(),11);
        System.out.println("Indica el valor de la influencia de las localizaciones multiples del proyecto: ");
        setinfluencia(sc.nextInt(),12);
        System.out.println("Indica el valor de la influencia de la facilidad de cambios del proyecto: ");
        setinfluencia(sc.nextInt(),13);
        
        tabla = new Tabla(influencias, getSVA());
        tabla.mostrarTabla();
        
    }
    
    
    
    
}
