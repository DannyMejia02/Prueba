/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ejercicio0301;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class EjercicioGridLayout extends JFrame {
    
    JPanel contenedor;
    
    public EjercicioGridLayout(){
     
        contenedor = new JPanel();
        contenedor.setLayout(new GridLayout(3,2));
        
        for(int i=0;i<5;i++){
            contenedor.add(new JLabel("Button"+(i+1)));
        }
        
        add(contenedor);
        setSize(300,300);
        setVisible(true);
        setTitle("GridLayout");
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
