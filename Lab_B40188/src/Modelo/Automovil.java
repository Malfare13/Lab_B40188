/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Angelica
 */
public class Automovil {
    
    private String numeroRegistro;
    private String nombreDueno;
    private String cedulaDueno;
    private String placaAuto;

    public Automovil(String numeroRegistro, String nombreDueno, String cedulaDueno, String placaAuto) {
        this.numeroRegistro = numeroRegistro;
        this.nombreDueno = nombreDueno;
        this.cedulaDueno = cedulaDueno;
        this.placaAuto = placaAuto;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getCedulaDueno() {
        return cedulaDueno;
    }

    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    public String getPlacaAuto() {
        return placaAuto;
    }

    public void setPlacaAuto(String placaAuto) {
        this.placaAuto = placaAuto;
    }
    
    private String getInformacion(){
        return "Numero registro: "+numeroRegistro+
                "\n"+"Nombre Dueño: "+nombreDueno+
                "\n"+"Cedula Dueño: "+cedulaDueno+
                "\n"+"Placa Auto: "+placaAuto;
    }
    
    
}
