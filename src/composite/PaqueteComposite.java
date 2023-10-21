
package composite;

import java.util.ArrayList;


public class PaqueteComposite implements  IComposite {

    private String nombrePaquete;
    private ArrayList <IComponente> paises;

    public PaqueteComposite(String nombrePaquete, ArrayList<IComponente> paises) {
        this.nombrePaquete = nombrePaquete;
        this.paises = paises;
    }
    
    @Override
    public void agregar(IComponente componente){
        paises.add(componente);
    }
    
    @Override
    public void eliminar(IComponente componente){
        paises.remove(componente);
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
