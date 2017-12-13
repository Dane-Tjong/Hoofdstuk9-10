package HS10;


import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht02 extends Applet{
    Button okeknop;
    TextField tekstvak;
    double getal;
    double Hgetal;
    double Lgetal;

    public void init() {
        Lgetal = 999999999;

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
        g.drawString("Laagste getal: "+ Lgetal,50,90);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            if (getal >= Hgetal) {
                Hgetal = getal;
                repaint();
            } else {
                repaint();
            }
            if (getal <= Lgetal) {
                Lgetal = getal;
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
            if (getal <= Lgetal) {
                Lgetal = getal;
                repaint();
            }else{
                repaint();
            }
        }
    }
}




