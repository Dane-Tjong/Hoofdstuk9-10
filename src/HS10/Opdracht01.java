package HS10;


import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht01 extends Applet{
    Button okeknop;
    TextField tekstvak;
    double getal;
    double Hgetal;


    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);

        okeknop = new Button();
        okeknop.setLabel("Oke");
        okeknopListener kn1 = new okeknopListener();
        okeknop.addActionListener(kn1);
        add(okeknop);

    }

    public void paint(Graphics g) {
        g.drawString("Huidig getal: "+ getal,50,60);
        g.drawString("Hoogste getal: "+ Hgetal,50,75);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            if (getal >= Hgetal) {
                Hgetal = getal;
                repaint();
            }else{
                repaint();

            }
            }
        }


    class okeknopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            if (getal >= Hgetal) {
                Hgetal = getal;
                repaint();
            }else{
                repaint();
            }
        }
    }
}




