package com.itsolutioncompany.practicandojava.test;

import com.itsolutioncompany.practicandojava.beans.ClientepropuestosnaturalBean;
import com.itsolutioncompany.practicandojava.servicio.ServicioClientepropuestosnatural;
import com.itsolutioncompany.practicandojava.utils.ConexionBD;

public class Main {
    public static void main(String[] args) {

        ConexionBD cn = new ConexionBD();
        cn.getConeccionBD();

        ServicioClientepropuestosnatural servicio = new ServicioClientepropuestosnatural();

        ClientepropuestosnaturalBean objClientepropuestosnaturalBean = new ClientepropuestosnaturalBean();

        System.out.println(servicio.ListaClientePropuestosNatural().size());

        for ( ClientepropuestosnaturalBean cliente :servicio.ListaClientePropuestosNatural()) {
            System.out.println(cliente.getNombrescompleto02());

        }

    }
}