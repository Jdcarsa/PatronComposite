
package composite;

import java.util.ArrayList;


public class PaqueteComposite implements IComponente {

    private String nombrePaquete;
    private ArrayList <IComponente> componentes = new ArrayList<>();

    public PaqueteComposite(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }
    
    public void addComponente(IComponente c){
        componentes.add(c);
    }
    
    public void removeComponente(IComponente c){
        componentes.remove(c);
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }
    
    @Override
    public void mostrarCaracteristicas() {
       for(IComponente c : componentes){
           c.mostrarCaracteristicas();
       }
    }
    
    
    
    
    
}
