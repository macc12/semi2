/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.o7planning.restfulcrud.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author white
 */
@XmlRootElement(name = "sensor")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sensor {
    private String id;
    private String temperatura;
    private String humedad;
    private String presion;
    private String fecha;
    private String hora;
    private String ejex;
    private String ejey;
    private String ejez;
    private String actuador;

    public Sensor() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEjex() {
        return ejex;
    }

    public void setEjex(String ejex) {
        this.ejex = ejex;
    }

    public String getEjey() {
        return ejey;
    }

    public void setEjey(String ejey) {
        this.ejey = ejey;
    }

    public String getEjez() {
        return ejez;
    }

    public void setEjez(String ejez) {
        this.ejez = ejez;
    }

    public String getActuador() {
        return actuador;
    }

    public void setActuador(String actuador) {
        this.actuador = actuador;
    }

    
}
