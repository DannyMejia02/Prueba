/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Productor;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface IProductorServicio {
    
    public Productor crear(Productor productor);
    public Productor modificar();
    public Productor eliminar();
    public List<Productor> listar(); 
    
}
