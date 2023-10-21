
package modelo;

import composite.IComponente;

public class Pais implements IComponente{
     private String nombrePais;

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombrePais=" + nombrePais + '}';
    }

    
    @Override
    public void mostrarCaracteristicas() {
       System.out.println(toString());
    }
     
   
}
