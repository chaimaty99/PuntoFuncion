/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementosFuncionales;

/**
 *
 * @author David
 */
public class EntradaExterna {
    
    public EntradaExterna(){
        
    }
    
    public String GetComplejidad(int Registros, int DatosElementales){
        
        String Compl = "";
        
        if(Registros <= 1){
            if(DatosElementales >= 1 && DatosElementales <= 15){
                Compl = "S";
            }
            else{
                if(DatosElementales > 15){
                    Compl = "M";
                }
            }
        }
        else{
            if(Registros == 2){
                if(DatosElementales >= 1 && DatosElementales <= 4){
                    Compl = "S";
                }
                else{
                    if(DatosElementales >= 5 && DatosElementales <= 15){
                        Compl = "M";
                    }
                    else{
                        if(DatosElementales > 15){
                            Compl = "C";
                        }
                    }
                }
            }
            else{
                if(Registros > 2){
                    if(DatosElementales >= 1 && DatosElementales <= 4){
                        Compl = "M";
                    }
                    else{
                        if(DatosElementales >= 5){
                            Compl = "C";
                        }
                      /* else{
                            if(DatosElementales > 15){
                                Compl = "C";
                            }
                        }*/
                    }    
                }
            }
        }
        
        return Compl;
    }
}
