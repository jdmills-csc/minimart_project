/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc340project;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Michael
 */
public abstract class Sales extends JFrame implements Observer{
    private Button clear = new Button("Clear");
    private Button addcart = new Button("Add to cart");
    
    private TextField text = new TextField("type stuff here");
    
    private Label itemLB = new Label("Enter item number here: ", Label.RIGHT);
    
    public Sales(){
        
        super("Sales:");
        setSize(600, 600);
        setVisible(true);
        setLayout(new BorderLayout(5, 5));
                
        Panel bottom = new Panel();
        add(bottom, BorderLayout.SOUTH);
        bottom.setLayout(new GridLayout(4,2,5,5));
        
        bottom.add(this.itemLB);
        bottom.add(this.text);
        
        bottom.add(new Label(""));
        bottom.add(new Label(""));
        bottom.add(this.clear);
        bottom.add(this.addcart);
                
             
    }
}
