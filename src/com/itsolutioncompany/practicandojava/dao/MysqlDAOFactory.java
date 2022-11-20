package com.itsolutioncompany.practicandojava.dao;

import com.itsolutioncompany.practicandojava.interfaces.ClientepropuestosnaturalDAO;

public class MysqlDAOFactory extends  DAOFactory{

    @Override
    public ClientepropuestosnaturalDAO getClientepropuestosnaturalDAO(){
        return new MySQLClientepropuestosnaturalDAO();
    }


}
