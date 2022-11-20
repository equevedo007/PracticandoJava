package com.itsolutioncompany.practicandojava.test;

import com.itsolutioncompany.practicandojava.servicio.ServicioClientepropuestosnatural;
import com.itsolutioncompany.practicandojava.utils.ConexionBD;

public class Main {
    public static void main(String[] args) {

        ConexionBD cn = new ConexionBD();
        cn.getConeccionBD();

        ServicioClientepropuestosnatural servicio = new ServicioClientepropuestosnatural();

        System.out.println("Total de Lista es : " +servicio.ListaClientePropuestosNaturalDNI("43532434").size());

    }
}