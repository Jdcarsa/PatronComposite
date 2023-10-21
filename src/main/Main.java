/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import composite.IComponente;
import composite.PaqueteComposite;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Ciudad;
import composite.Pais;
import java.util.ArrayList;
import modelo.Tour;

/**
 *
 * @author IngSis
 */
public class Main {

    public static void main(String[] args) throws ParseException {
 
        ArrayList<IComponente> paises = new ArrayList<>();
        ArrayList<IComponente> ciudades = new ArrayList<>();
        ArrayList<IComponente> ciudades2 = new ArrayList<>();
        PaqueteComposite paqPaises = new PaqueteComposite("Europa",paises);
        IComponente pais1 = new Pais("Inglaterra",ciudades);
        IComponente pais2 = new Pais("Roma",ciudades2);
        paqPaises.addComponente(pais1);
        paqPaises.addComponente(pais2);
        Pais p = (Pais) pais1;
        Tour t = new Tour(1, "buen tour", "good tour", "5 estrellas tour ", 12);
        String textoFecha = "15/10/2024";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = formato.parse(textoFecha);
        IComponente ciudad1 = new Ciudad("Londres", "1200", "hotel 5 estrellas",
                t, true, fecha, fecha);
        System.out.println(""+ paqPaises.getNombrePaquete());
        p.addComponente(ciudad1);
        paqPaises.mostrarCaracteristicas();
    }

}
