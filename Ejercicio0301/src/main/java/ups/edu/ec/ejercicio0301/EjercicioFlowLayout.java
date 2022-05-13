/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ejercicio0301;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class EjercicioFlowLayout extends JFrame{
    
    JPanel contenedor;
    
    public EjercicioFlowLayout (){
        
        contenedor = new JPanel();
        contenedor.setLayout(new FlowLayout());
        for(int i=0;i<5;i++){
            contenedor.add(new JLabel("Button  "+(i+1)));
        }
        
        add(contenedor);
        setSize(500,500);
        setVisible(true);
        setTitle("FlowLayout");
        setLocation(400,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
