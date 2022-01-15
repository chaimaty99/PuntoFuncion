/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementosFuncionales;

/**
 *
 * @author David
 */
public class SalidaExterna {
    
    public SalidaExterna(){
        
    }
    
    public String GetComplejidad(int Registros, int DatosElementales){
        
        String Compl = "";
        
        if(Registros <= 1){
            if(DatosElementales >= 1 && DatosElementales <= 19){
                Compl = "S";
            }
            else{
                if(DatosElementales > 19){
                    Compl = "M";
                }
            }
        }
        else{
            if(Registros > 1 && Registros < 4){
                if(DatosElementales >= 1 && DatosElementales <= 5){
                    Compl = "S";
                }
                else{
                    if(DatosElementales >= 6 && DatosElementales <= 19){
                        Compl = "M";
                    }
                    else{
                        if(DatosElementales > 19){
                            Compl = "C";
                        }
                    }
                }
            }
            else{
                if(Registros > 3){
                    if(DatosElementales >= 1 && DatosElementales <= 5){
                        Compl = "M";
                    }
                    else{
                        if(DatosElementales >= 6 && DatosElementales <= 19){
                            Compl = "C";
                        }
                       /* else{
                            if(DatosElementales > 19){
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
