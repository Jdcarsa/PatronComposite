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
import modelo.Pais;
import modelo.Tour;

/**
 *
 * @author IngSis
 */
public class Main {

    public static void main(String[] args) throws ParseException {

        PaqueteComposite paqPaises = new PaqueteComposite("Europa");
        IComponente pais1 = new Pais("Inglaterra");
        IComponente pais2 = new Pais("Roma");
        IComponente pais3 = new Pais("Francia");
        paqPaises.addComponente(pais1);
        paqPaises.addComponente(pais2);
        paqPaises.addComponente(pais3);
        Pais p = (Pais) pais1;
        PaqueteComposite paqCiudades = new PaqueteComposite(p.getNombrePais());
        Tour t = new Tour(1, "buen tour", "good tour", "5 estrellas tour ", 12);
        String textoFecha = "15/10/2024";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = formato.parse(textoFecha);
        IComponente ciudad1 = new Ciudad("madrid", "1200", "hotel 5 estrellas",
                t, true, fecha, fecha);
        paqCiudades.addComponente(ciudad1);
        System.out.println("" + paqPaises.getNombrePaquete());
        paqPaises.mostrarCaracteristicas();
        System.out.println("" + paqCiudades.getNombrePaquete());
        paqCiudades.mostrarCaracteristicas();
    }

}
