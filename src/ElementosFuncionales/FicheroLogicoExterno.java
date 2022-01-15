/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementosFuncionales;

/**
 *
 * @author David
 */
public class FicheroLogicoExterno {
    
    public FicheroLogicoExterno(){
        
    }
    
    public String GetComplejidad(int Registros, int DatosElementales){
        
        String Compl = "";
        
        if(Registros == 1){
            if(DatosElementales >= 1 && DatosElementales <= 50){
                Compl = "S";
            }
            else{
                if(DatosElementales > 50){
                    Compl = "M";
                }
            }
        }
        else{
            if(Registros > 1 && Registros < 6){
                if(DatosElementales >= 1 && DatosElementales <= 19){
                    Compl = "S";
                }
                else{
                    if(DatosElementales >= 20 && DatosElementales <= 50){
                        Compl = "M";
                    }
                    else{
                        if(DatosElementales > 50){
                            Compl = "C";
                        }
                    }
                }
            }
            else{
                if(Registros > 5){
                    if(DatosElementales >= 1 && DatosElementales <= 19){
                        Compl = "M";
                    }
                    else{
                        if(DatosElementales >= 20){
                            Compl = "C";
                        }
                      /*  else{
                            if(DatosElementales > 50){
                                Compl = "C";
                            }
                       */ }
                    }    
                }
            }
        }
        
        return Compl;
    }
}
