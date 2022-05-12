/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ejercicio0301;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class EjercicioBorderLayout extends JFrame{
    
    JPanel contenedor;
    
    
    public EjercicioBorderLayout(){
        contenedor = new JPanel();
        contenedor.setLayout(new BorderLayout());
        
        contenedor.add(new JButton("Button 1"),BorderLayout.NORTH);
        contenedor.add(new JButton("Button 4"),BorderLayout.SOUTH);
        contenedor.add(new JButton("Button 5"),BorderLayout.EAST);
        contenedor.add(new JButton("Button 3"),BorderLayout.WEST);
        contenedor.add(new JButton("Button 2"),BorderLayout.CENTER);
        
        add(contenedor);
        setSize(300,300);
        setVisible(true);
        setTitle("BorderLayout");
        
    }
    
}
