package control;

import composite.PaqueteComposite;
import java.util.Scanner;

public class Controller {

    public void crearPaquete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del paquete continental a crear: ");
        String nombre = sc.next();
        PaqueteComposite paqPaises = new PaqueteComposite(nombre);
    }
}
