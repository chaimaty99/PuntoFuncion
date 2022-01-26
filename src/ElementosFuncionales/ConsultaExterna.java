/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementosFuncionales;

/**
 *
 * @author Chaima
 */
public class ConsultaExterna {

    public ConsultaExterna() {

    }

    public String GetComplejidad(String ComplejidadEE, String ComplejidadSE) {

        String Compl = "";

        if (ComplejidadEE == "C") {
            Compl = ComplejidadEE;
        } else {
            if (ComplejidadSE == "C") {
                Compl = ComplejidadSE;
            } else {
                if (ComplejidadEE == "M") {
                    Compl = ComplejidadEE;
                } else {
                    if (ComplejidadSE == "M") {
                        Compl = ComplejidadSE;
                    } else {
                        if (ComplejidadEE == "S") {
                            Compl = ComplejidadEE;
                        } else {
                            if (ComplejidadSE == "S") {
                                Compl = ComplejidadSE;
                            }
                        }
                    }
                }

                
            }
        }
        return Compl;
    }
}
