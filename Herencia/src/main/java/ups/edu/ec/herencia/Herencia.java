/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.herencia;

/**
 *
 * @author DELL
 */
public class Herencia {

    public static void main(String[] args) {
            
        var gatoMama = new Gato();
        gatoMama.setColor("plomo");
        gatoMama.setNombre("Mishi");
        gatoMama.setRaza("Mestizo");
        gatoMama.setYearNacimiento(2017);
        gatoMama.setNumeroAccidentesFatales(3);
        gatoMama.setNumeroVidas(9);
        
        System.out.println(gatoMama.getNombre());
        System.out.println(gatoMama.calcularVidasRestantes());
        
        
    }
  
}

