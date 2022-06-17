/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class Actor {
    
    private String nombre;
    private String peliculas;
    private String premios;
    private String nombreDeActuar;

    public Actor(String nombre, String peliculas, String premios, String nombreDeActuar) {
        this.nombre = nombre;
        this.peliculas = peliculas;
        this.premios = premios;
        this.nombreDeActuar = nombreDeActuar;
    }

    public Actor(Integer valueOf, String arg, String arg0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(String peliculas) {
        this.peliculas = peliculas;
    }

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    public String getNombreDeActuar() {
        return nombreDeActuar;
    }

    public void setNombreDeActuar(String nombreDeActuar) {
        this.nombreDeActuar = nombreDeActuar;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", peliculas=" + peliculas + ", premios=" + premios + ", nombreDeActuar=" + nombreDeActuar + '}';
    }
    
    
    
}
