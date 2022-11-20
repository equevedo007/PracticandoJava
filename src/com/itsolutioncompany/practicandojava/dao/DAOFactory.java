package com.itsolutioncompany.practicandojava.dao;

import com.itsolutioncompany.practicandojava.interfaces.ClientepropuestosnaturalDAO;

public abstract class DAOFactory {

    public static final int MYSQL=1;

    public static DAOFactory getDAOFactory(int edinson){

        switch (edinson) {
            case MYSQL:

                return new MysqlDAOFactory();

            default:
                return null;
        }

    }


    public abstract ClientepropuestosnaturalDAO getClientepropuestosnaturalDAO();
}
