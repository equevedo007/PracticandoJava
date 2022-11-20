package com.itsolutioncompany.practicandojava.dao;

import com.itsolutioncompany.practicandojava.beans.ClientepropuestosnaturalBean;
import com.itsolutioncompany.practicandojava.interfaces.ClientepropuestosnaturalDAO;
import com.itsolutioncompany.practicandojava.utils.ConexionBD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLClientepropuestosnaturalDAO implements ClientepropuestosnaturalDAO {

    Connection cn=null;
    CallableStatement cs=null;
    ResultSet rs=null;
    ClientepropuestosnaturalBean objClientepropuestosnaturalBean=null;
    List<ClientepropuestosnaturalBean> ListaClientePropuestosNaturalDNI=null;

    @Override
    public List<ClientepropuestosnaturalBean> ListaClientePropuestosNaturalDNI(String DNI) {

        ListaClientePropuestosNaturalDNI = new ArrayList<ClientepropuestosnaturalBean>();

        try {
            ConexionBD  cnx = new ConexionBD();
            cn=cnx.getConeccionBD();
            String sql ="{call sp_ListaClientePropuestosNaturalDNI(?)}";
            cs=cn.prepareCall(sql);
            cs.setString(1, DNI);
            rs=cs.executeQuery();
            while (rs.next()){
                objClientepropuestosnaturalBean = new ClientepropuestosnaturalBean(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
                        rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
                ListaClientePropuestosNaturalDNI.add(objClientepropuestosnaturalBean);
            }

        }catch (Exception e){
            System.out.println("Error En Metodo : ListaClientePropuestosNaturalDNI");

        }finally {
            try {
                rs.close();
                cs.close();
                cn.close();
            }catch (SQLException e){
                System.out.println("Error En Cerrar Conexion : ListaClientePropuestosNaturalDNI");
            }
        }


        return ListaClientePropuestosNaturalDNI;
    }
}