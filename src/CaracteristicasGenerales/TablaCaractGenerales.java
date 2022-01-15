/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaracteristicasGenerales;

/**
 *
 * @author Chaima
 */
public class TablaCaractGenerales {

    private static final String[] Atributos = {""
        + "Comunicación de datos",
        "Funciones distribuidas",
        "Prestaciones",
        "Gran uso de la configuración",
        "Velocidad de las transacciones",
        "Entrada de datos en línea",
        "Diseño para la eficiencia del usuario final",
        "Actualización de datos en línea",
        "Complegidad del proceso lógico interno de la aplicación",
        "Reusabilidad del código",
        "Facilidad de instalación",
        "Facilidad de operación",
        "Localizaciones múltiples",
        "Facilidad de cambios"};

    private int[] influencias;

    public TablaCaractGenerales() {
        influencias = new int[14];
    }

    public final String[] getAtributos() {
        return Atributos;
    }

    public int getinfluencia(int posicion) {
        return influencias[posicion];
    }

    public void setinfluencia(int influencia, int posicion) {
        
        if (influencia >= 0 && influencia < 6) {
            influencias[posicion] = influencia;
        }
    }
    
    public int getsumainfluencias(){
        
        int suma=0;
        for(int i=0; i<14;i++){
            
            suma=suma+influencias[i];
            
        }
        return suma;
    }

}
