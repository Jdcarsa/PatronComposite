package composite;

import java.util.ArrayList;

public class Pais implements IComponente {

    private String nombrePais;
    private ArrayList<IComponente> ciudades;

    public Pais(String nombrePais, ArrayList<IComponente> ciudades) {
        this.nombrePais = nombrePais;
        this.ciudades = ciudades;
    }

    public void addComponente(IComponente c) {
        ciudades.add(c);
    }

    public void removeComponente(IComponente c) {
        ciudades.remove(c);
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
        for (IComponente c : ciudades) {
            c.mostrarCaracteristicas();
        }
    }

}
