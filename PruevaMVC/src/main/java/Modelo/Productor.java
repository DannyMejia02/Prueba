/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class Productor {
    
    private String rol;
    private String planTrabajo;
    private String rodaje;
    private Actor actor;

    public Productor(String rol, String planTrabajo, String rodaje, Actor actor) {
        this.rol = rol;
        this.planTrabajo = planTrabajo;
        this.rodaje = rodaje;
        this.actor = actor;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPlanTrabajo() {
        return planTrabajo;
    }

    public void setPlanTrabajo(String planTrabajo) {
        this.planTrabajo = planTrabajo;
    }

    public String getRodaje() {
        return rodaje;
    }

    public void setRodaje(String rodaje) {
        this.rodaje = rodaje;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Productor{" + "rol=" + rol + ", planTrabajo=" + planTrabajo + ", rodaje=" + rodaje + ", actor=" + actor + '}';
    }
    
    
    
}
