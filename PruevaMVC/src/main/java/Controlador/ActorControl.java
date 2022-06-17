/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Actor;
import Servicio.ActorServicio;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ActorControl {
    
    private final ActorServicio capitanServicio = new ActorServicio();
    
    public Actor crear(String [] args){
        var actor= new Actor(Integer.valueOf(args[0]),args[1],args[2]);
        this.capitanServicio.crear(actor);
        return actor;
    }
    
    public List<Actor> listar(){
        return this.capitanServicio.listar();
    }
    
}
