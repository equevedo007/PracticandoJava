package com.itsolutioncompany.practicandojava.interfaces;

import com.itsolutioncompany.practicandojava.beans.ClientepropuestosnaturalBean;

import java.util.List;

public interface ClientepropuestosnaturalDAO {

    public abstract List<ClientepropuestosnaturalBean> ListaClientePropuestosNaturalDNI(String DNI);
    public abstract List<ClientepropuestosnaturalBean> ListaClientePropuestosNatural();

}
