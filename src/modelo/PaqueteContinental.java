
package modelo;

import java.util.ArrayList;


public class PaqueteContinental {
    
    private String nombrePaquete;
    private ArrayList<Pais> paises = new ArrayList<>();

    public PaqueteContinental(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }
    
    
}
