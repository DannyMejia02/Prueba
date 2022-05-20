/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.unidad3_ejercicio02;

/**
 *
 * @author DELL
 */
public class Unidad3_Ejercicio02 {

    public static void main(String[] args) {
        
        var  v1 = new  VentanaA("INSCRIBETE");
        v1 . setVisible (true);
        
        var  v2 = new  VentanaB("DATOS PERSONALES");
        v2 . setVisible (true);
        
        var v3 = new VentanaC("INFORMACION DE CARRERA");
        v3.setVisible(true);
        
        var v4 = new VentanaD("CREAR GRUPO");
        v4.setVisible(true);
        
        var v5 = new VentanaE("Matricula Terminada");
        v5.setVisible(true);
    }
 
}
