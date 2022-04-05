/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.clase;

import java.sql.SQLOutput;

/**
 *
 * @author PC-01
 */
public class Clase {

    public static void main(String[] args) {
       
        var autoPepe = new Auto ();
        autoPepe.color="Blanco";
        autoPepe.marca="Subaru";
        autoPepe.year=2019;
        autoPepe.placa="H0YC3BB";
        autoPepe.precio=9800;
        
        System.out.println(autoPepe.color+" | "+autoPepe.marca+" | "+autoPepe.year+" | "+autoPepe.placa+" | "+autoPepe.precio+" | ");
        
        var autoJuan = new Auto ();
        autoJuan.color="Amarillo";
        autoJuan.marca="Mitsubishi";
        autoJuan.year=2017;
        autoJuan.placa="DBZ777";
        autoJuan.precio=8500;
        
        System.out.println(autoJuan.color+" | "+autoJuan.marca+" | "+autoJuan.year+" | "+autoJuan.placa+" | "+autoJuan.precio+" | ");
        var esTaxi=false;
        esTaxi=autoJuan.esTaxi();
        if(esTaxi = autoJuan.esTaxi()){
            System.out.println("El auto de placa "+autoJuan.placa+" es un taxi");
            }else{
            System.out.println("El auto de la placa "+autoJuan.placa+ "No es un taxi");
        }
        System.out.println("Es Taxi: "+autoJuan.esTaxi());
        System.out.println("El auto de placa "+autoJuan.placa+" debe pagar la tasa de "+autoJuan.calcularTasaSolidaria());
    }
}
