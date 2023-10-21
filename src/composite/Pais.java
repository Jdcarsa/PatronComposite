package composite;

import java.util.ArrayList;

public class Pais implements IComposite {

    private String nombrePais;
    private ArrayList<IComponente> ciudades;

    public Pais(String nombrePais, ArrayList<IComponente> ciudades) {
        this.nombrePais = nombrePais;
        this.ciudades = ciudades;
    }

    @Override
    public void agregar(IComponente componente) {
        ciudades.add(componente);
    }

    @Override
    public void eliminar(IComponente componente) {
        ciudades.remove(componente);
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
