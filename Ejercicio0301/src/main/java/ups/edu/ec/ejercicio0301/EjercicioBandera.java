/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ejercicio0301;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class EjercicioBandera extends JFrame{
    
    JPanel contenedor;
    JPanel jPanelBandera;
    List<JLabel>jLabelBanderaList;
    
    public EjercicioBandera(){
        contenedor = new JPanel();
        contenedor.setLayout(new BorderLayout());
        
        contenedor.add(new JLabel("Button 1"),BorderLayout.NORTH);
        contenedor.add(new JLabel("Button 4"),BorderLayout.SOUTH);
        contenedor.add(new JLabel("Button 5"),BorderLayout.EAST);
        contenedor.add(new JLabel("Button 3"),BorderLayout.WEST);
        
        
        add(contenedor);
        setSize(300,300);
        setVisible(true);
        setTitle("Bandera BorderLayout");
        setLocation(1200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    public void IniciarComponentes(){
        this.inciarBandera();
    }
    
    public void inciarBandera(){
        
        this.jPanelBandera = new JPanel();
        this.jPanelBandera.setLayout(new GridLayout(4,1));
        
        this.jLabelBanderaList =new ArrayList<>();
        for(var i=0;i<4;i++)
            this.jLabelBanderaList.add(new JLabel());
        
        this.jLabelBanderaList.get(0).setBackground(Color.RED);
        this.jLabelBanderaList.get(1).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(2).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(3).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(4).setBackground(Color.RED);
        this.jLabelBanderaList.get(5).setBackground(Color.RED);
        this.jLabelBanderaList.get(6).setBackground(Color.RED);
        this.jLabelBanderaList.get(7).setBackground(Color.RED);
        this.jLabelBanderaList.get(8).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(9).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(10).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(11).setBackground(Color.RED);
        this.jLabelBanderaList.get(12).setBackground(Color.RED);
        this.jLabelBanderaList.get(13).setBackground(Color.RED);
        this.jLabelBanderaList.get(14).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(15).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(16).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(17).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(18).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(19).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(20).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(21).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(22).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(23).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(24).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(25).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(26).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(27).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(28).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(29).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(30).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(31).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(32).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(33).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(34).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(35).setBackground(Color.RED);
        this.jLabelBanderaList.get(36).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(37).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(38).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(39).setBackground(Color.RED);
        this.jLabelBanderaList.get(40).setBackground(Color.RED);
        this.jLabelBanderaList.get(41).setBackground(Color.RED);
        this.jLabelBanderaList.get(42).setBackground(Color.RED);
        this.jLabelBanderaList.get(43).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(44).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(45).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(46).setBackground(Color.RED);
        this.jLabelBanderaList.get(47).setBackground(Color.RED);
        this.jLabelBanderaList.get(48).setBackground(Color.RED);
        
        for (var i=0;i<4;i++)
            this.jPanelBandera.add(this.jLabelBanderaList.get(i));
        
    }
    
    
}
