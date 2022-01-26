/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaracteristicasGenerales;

/**
 *
 * @author chaim
 */
public class Tabla {
    
    private int inf[];
    int suma;
    
    public Tabla(int influencias[], int suma){
        
        for (int i = 0; i < influencias.length; i++) {
            inf[i] = influencias[i];
        }
        
        this.suma = suma;
        
    }
    
    public void mostrarTabla(){
        
        System.out.println("                           Atributos                          |        Influencia");
        System.out.println("1. Comunicación de datos                                             " + inf[0]);
        System.out.println("2. Funciones distribuidas                                            " + inf[1]);
        System.out.println("3. Prestaciones                                                      " + inf[2]);
        System.out.println("4. Gran uso de la configuración                                      " + inf[3]);
        System.out.println("5. Velocidad de las transacciones                                    " + inf[4]);
        System.out.println("6. Entrada de datos en línea                                         " + inf[5]);
        System.out.println("7. Diseño para la eficiencia del usuario final                       " + inf[6]);
        System.out.println("8. Actualización de datos en línea                                   " + inf[7]);
        System.out.println("9. Complegidad del proceso lógico interno de la aplicación           " + inf[8]);
        System.out.println("10. Reusabilidad del código                                          " + inf[9]);
        System.out.println("11. Facilidad de instalación                                         " + inf[10]);
        System.out.println("12. Facilidad de operación                                           " + inf[11]);
        System.out.println("13. Localizaciones múltiples                                         " + inf[12]);
        System.out.println("14. Facilidad de cambios                                             " + inf[13]);
        System.out.println("                                                           Suma      " + suma);
        
        
    }


    
    
}
