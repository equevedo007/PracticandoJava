package com.itsolutioncompany.practicandojava.servicio;

import com.itsolutioncompany.practicandojava.beans.ClientepropuestosnaturalBean;
import com.itsolutioncompany.practicandojava.dao.DAOFactory;
import com.itsolutioncompany.practicandojava.interfaces.ClientepropuestosnaturalDAO;
import com.itsolutioncompany.practicandojava.utils.Constantes;

import java.util.List;

public class ServicioClientepropuestosnatural {

    DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DE_DATOS);
    ClientepropuestosnaturalDAO objClientepropuestosnaturalDAO = fabrica.getClientepropuestosnaturalDAO();

    public List<ClientepropuestosnaturalBean> ListaClientePropuestosNaturalDNI(String DNI){
        List<ClientepropuestosnaturalBean> lista=null;
        lista=objClientepropuestosnaturalDAO.ListaClientePropuestosNaturalDNI(DNI);
        return lista;

    }

}
