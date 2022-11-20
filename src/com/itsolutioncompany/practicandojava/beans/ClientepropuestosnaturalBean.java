package com.itsolutioncompany.practicandojava.beans;

import java.io.Serializable;

public class ClientepropuestosnaturalBean implements Serializable {

    private  int idclientepropuestosjuridico;
    private  String razonsocial01;
    private  String razonsocial02;
    private  String numerodocumento01;
    private  String numerodocumento02;
    private  String correo;
    private  String tipococumento;
    private  String telefono;
    private  String actividad;

    public ClientepropuestosnaturalBean(int idclientepropuestosjuridico,
                                        String razonsocial01,
                                        String razonsocial02,
                                        String numerodocumento01,
                                        String numerodocumento02,
                                        String correo,
                                        String tipococumento,
                                        String telefono,
                                        String actividad) {
        this.idclientepropuestosjuridico = idclientepropuestosjuridico;
        this.razonsocial01 = razonsocial01;
        this.razonsocial02 = razonsocial02;
        this.numerodocumento01 = numerodocumento01;
        this.numerodocumento02 = numerodocumento02;
        this.correo = correo;
        this.tipococumento = tipococumento;
        this.telefono = telefono;
        this.actividad = actividad;
    }

    public int getIdclientepropuestosjuridico() {
        return idclientepropuestosjuridico;
    }

    public void setIdclientepropuestosjuridico(int idclientepropuestosjuridico) {
        this.idclientepropuestosjuridico = idclientepropuestosjuridico;
    }

    public String getRazonsocial01() {
        return razonsocial01;
    }

    public void setRazonsocial01(String razonsocial01) {
        this.razonsocial01 = razonsocial01;
    }

    public String getRazonsocial02() {
        return razonsocial02;
    }

    public void setRazonsocial02(String razonsocial02) {
        this.razonsocial02 = razonsocial02;
    }

    public String getNumerodocumento01() {
        return numerodocumento01;
    }

    public void setNumerodocumento01(String numerodocumento01) {
        this.numerodocumento01 = numerodocumento01;
    }

    public String getNumerodocumento02() {
        return numerodocumento02;
    }

    public void setNumerodocumento02(String numerodocumento02) {
        this.numerodocumento02 = numerodocumento02;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipococumento() {
        return tipococumento;
    }

    public void setTipococumento(String tipococumento) {
        this.tipococumento = tipococumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
}
