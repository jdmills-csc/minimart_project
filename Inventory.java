/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc340project;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Michael
 */
public class Inventory extends Frame implements Observer {
    
    //a-y is the item names

    private Label a = new Label("item1");
    private Label b = new Label("item2");
    private Label c = new Label("item3");
    private Label d = new Label("item4");
    private Label e = new Label("item5");
    private Label f = new Label("item6");
    private Label g = new Label("item7");
    private Label h = new Label("item8");
    private Label i = new Label("item9");
    private Label j = new Label("item10");
    private Label k = new Label("item11");
    private Label l = new Label("item12");
    private Label m = new Label("item13");
    private Label n = new Label("item14");
    private Label o = new Label("item15");
    private Label p = new Label("item16");
    private Label q = new Label("item17");
    private Label r = new Label("item18");
    private Label s = new Label("item19");
    private Label t = new Label("item20");
    private Label u = new Label("item21");
    private Label v = new Label("item22");
    private Label w = new Label("item23");
    private Label x = new Label("item24");
    private Label y = new Label("item25");

    //i1-i25 is the quantity number
    private Label i1 = new Label("x");
    private Label i2 = new Label("x");
    private Label i3 = new Label("x");
    private Label i4 = new Label("x");
    private Label i5 = new Label("x");
    private Label i6 = new Label("x");
    private Label i7 = new Label("x");
    private Label i8 = new Label("x");
    private Label i9 = new Label("x");
    private Label i10 = new Label("x");
    private Label i11 = new Label("x");
    private Label i12 = new Label("x");
    private Label i13 = new Label("x");
    private Label i14 = new Label("x");
    private Label i15 = new Label("x");
    private Label i16 = new Label("x");
    private Label i17 = new Label("x");
    private Label i18 = new Label("x");
    private Label i19 = new Label("x");
    private Label i20 = new Label("x");
    private Label i21 = new Label("x");
    private Label i22 = new Label("x");
    private Label i23 = new Label("x");
    private Label i24 = new Label("x");
    private Label i25 = new Label("x");

 //not sure if I can use these so commenting out for the moment   
//    private int item1 = 0;
//    private int item2 = 0;
//    private int item3 = 0;
//    private int item4 = 0;
//    private int item5 = 0;
//    private int item6 = 0;
//    private int item7 = 0;
//    private int item8 = 0;
//    private int item9 = 0;
//    private int item10 = 0;
//    private int item11 = 0;
//    private int item12 = 0;
//    private int item13 = 0;
//    private int item14 = 0;
//    private int item15 = 0;
//    private int item16 = 0;
//    private int item17 = 0;
//    private int item18 = 0;
//    private int item19 = 0;
//    private int item20 = 0;
//    private int item21 = 0;
//    private int item22 = 0;
//    private int item23 = 0;
//    private int item24 = 0;
//    private int item25 = 0;
    public Inventory() {

        super("Inventory");
        setSize(300, 300);
        setVisible(true);
        setLayout(new BorderLayout(5, 5));

        Panel inv = new Panel();
        add(inv, BorderLayout.CENTER);
        inv.setLayout(new GridLayout(10, 5, 5, 15));

        inv.add(a);
        inv.add(b);
        inv.add(c);
        inv.add(d);
        inv.add(e);

        inv.add(i1);
        inv.add(i2);
        inv.add(i3);
        inv.add(i4);
        inv.add(i5);
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));

        inv.add(f);
        inv.add(g);
        inv.add(h);
        inv.add(i);
        inv.add(j);

        inv.add(i6);
        inv.add(i7);
        inv.add(i8);
        inv.add(i9);
        inv.add(i10);
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));

        inv.add(k);
        inv.add(l);
        inv.add(m);
        inv.add(n);
        inv.add(o);

        inv.add(i11);
        inv.add(i12);
        inv.add(i13);
        inv.add(i14);
        inv.add(i15);
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));

        inv.add(p);
        inv.add(q);
        inv.add(r);
        inv.add(s);
        inv.add(t);

        inv.add(i16);
        inv.add(i17);
        inv.add(i18);
        inv.add(i19);
        inv.add(i20);
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));

        inv.add(u);
        inv.add(v);
        inv.add(w);
        inv.add(x);
        inv.add(y);

        inv.add(i21);
        inv.add(i22);
        inv.add(i23);
        inv.add(i24);
        inv.add(i25);
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));
//        inv.add(new Label("x"));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        }
        );

    }

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}