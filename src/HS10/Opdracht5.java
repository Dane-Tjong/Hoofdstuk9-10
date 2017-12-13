package HS10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht5 extends Applet{
    Button okeknop;
    TextField tekstvak;
    double cijfer;
    String zakslaag;

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
    g.drawString ( "met het cijfer ("+ cijfer + ")" + zakslaag,50,60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
             cijfer = Double.parseDouble( s );
            if (cijfer >= 4.5) {
                zakslaag = " Bent u geslaagd met een voldoende";
                repaint();
            }else{
                zakslaag = " Bent u bent gezakt met een onvoldoende";
                repaint();

            }
        }
    }


    class okeknopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            cijfer = Double.parseDouble( s );
            if (cijfer >= 4.5) {
                zakslaag = "u geslaagd met een voldoende";
                repaint();
            }else{
                zakslaag = "u bent gezakt met een onvoldoende";
                repaint();

            }
        }
    }

}
