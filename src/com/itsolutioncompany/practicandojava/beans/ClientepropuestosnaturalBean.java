package com.itsolutioncompany.practicandojava.beans;

import java.io.Serializable;

public class ClientepropuestosnaturalBean implements Serializable {

    private int idclientepropuestosnatural;
    private String  tipodocumento;
    private String  lugarnacimiento;
    private String  numerodocumento;
    private String  nombres;
    private String  apellidop;
    private String  apellidom;
    private String  nombrescompleto01;
    private String  nombrescompleto02;
    private String  fechanacimiento;
    private String  sexo;
    private String  telefono;
    private String  correo;

    public ClientepropuestosnaturalBean(int idclientepropuestosnatural, String tipodocumento, String lugarnacimiento, String numerodocumento, String nombres, String apellidop, String apellidom, String nombrescompleto01, String nombrescompleto02, String fechanacimiento, String sexo, String telefono, String correo) {
        this.idclientepropuestosnatural = idclientepropuestosnatural;
        this.tipodocumento = tipodocumento;
        this.lugarnacimiento = lugarnacimiento;
        this.numerodocumento = numerodocumento;
        this.nombres = nombres;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.nombrescompleto01 = nombrescompleto01;
        this.nombrescompleto02 = nombrescompleto02;
        this.fechanacimiento = fechanacimiento;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correo = correo;
    }

    public ClientepropuestosnaturalBean(){

    }

    public int getIdclientepropuestosnatural() {
        return idclientepropuestosnatural;
    }

    public void setIdclientepropuestosnatural(int idclientepropuestosnatural) {
        this.idclientepropuestosnatural = idclientepropuestosnatural;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getLugarnacimiento() {
        return lugarnacimiento;
    }

    public void setLugarnacimiento(String lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }

    public String getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getNombrescompleto01() {
        return nombrescompleto01;
    }

    public void setNombrescompleto01(String nombrescompleto01) {
        this.nombrescompleto01 = nombrescompleto01;
    }

    public String getNombrescompleto02() {
        return nombrescompleto02;
    }

    public void setNombrescompleto02(String nombrescompleto02) {
        this.nombrescompleto02 = nombrescompleto02;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
