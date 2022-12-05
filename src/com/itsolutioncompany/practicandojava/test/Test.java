package com.itsolutioncompany.practicandojava.test;

public class Test {

    public static void main (String []args) {

        System.out.println("Validar: "+mensaje("04"));

    }

    public static String mensaje (String msn){
        String out="";

        switch (msn){
            case "01":
                return out= "El mensaje es 00001";
            case "02":
                return out= "El mensaje es 00002";
            case "03":
                return out= "El mensaje es 00003";
            case "04":
                return out= "El mensaje es 00004";
            case "05":
                return out= "El mensaje es 00005";

            default:
                 return out= "El Mensaje no Existe";

        }

    }
}
