
package composite;

import java.util.ArrayList;


public class Composite implements IComponente {

    private ArrayList <IComponente> componets = new ArrayList<>();

    public Composite() {
    }
    
    public void addComponente(IComponente c){
        componets.add(c);
    }
    
    public void removeComponente(IComponente c){
        componets.remove(c);
    }
    
    @Override
    public void mostrarCaracteristicas() {
       for(IComponente c : componets){
           c.mostrarCaracteristicas();
       }
    }
    
    
    
}
