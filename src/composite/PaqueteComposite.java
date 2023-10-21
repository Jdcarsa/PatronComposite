
package composite;

import java.util.ArrayList;


public class PaqueteComposite implements IComponente {

    private String nombrePaquete;
    private ArrayList <IComponente> paises;

    public PaqueteComposite(String nombrePaquete, ArrayList<IComponente> paises) {
        this.nombrePaquete = nombrePaquete;
        this.paises = paises;
    }
    
    public void addComponente(IComponente c){
        paises.add(c);
    }
    
    public void removeComponente(IComponente c){
        paises.remove(c);
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }
    
    @Override
    public void mostrarCaracteristicas() {
       for(IComponente c : paises){
           c.mostrarCaracteristicas();
       }
    }
    
    
    
    
    
}
