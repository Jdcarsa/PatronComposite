
package composite;

import java.util.ArrayList;


public class PaqueteCiudad implements IComponente {

    private ArrayList <IComponente> ciudades = new ArrayList<>();

    public PaqueteCiudad() {
    }
    
    public void addComponente(IComponente c){
        ciudades.add(c);
    }
    
    public void removeComponente(IComponente c){
        ciudades.remove(c);
    }
    
    @Override
    public void mostrarCaracteristicas() {
       for(IComponente c : ciudades){
           c.mostrarCaracteristicas();
       }
    }
    
    
    
}
