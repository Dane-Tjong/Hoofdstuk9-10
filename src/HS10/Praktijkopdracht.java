package HS10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    Label label;
    Button okeknop;
    String gitgud;
    int getal;

    public void init() {
        tekstvak = new TextField();
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
        label = new Label("poepjes");
        add(label);

        okeknop = new Button();
        okeknop.setLabel("oke");
        okeknopListener knl = new okeknopListener();
        add(okeknop);
    }


    public void paint(Graphics g) {
        g.drawString("cyka blyat" + gitgud, 50, 60);
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);

            switch (getal) {
                case 0:
                    gitgud = "Met dit cijfer heeft u slecht gepresteert.";
                    repaint();
                    break;
                case 1:
                    gitgud = "Met dit cijfer heeft u slecht gepresteert.";
                    repaint();
                    break;
                case 2:
                    gitgud = "Met dit cijfer heeft u slecht gepresteert.";
                    repaint();
                    break;
                case 3:
                    gitgud = "Met dit cijfer heeft u slecht gepresteert.";
                    repaint();
                    break;
                case 4:
                    gitgud = "Met dit cijfer heeft u een onvoldoende behaald.";
                    repaint();
                    break;
                case 5:
                    gitgud = "Met dit cijfer heeft u een matig behaald.";
                    repaint();
                    break;
                case 6:
                    gitgud = "Met dit cijfer heeft u een voldoende behaald";
                    repaint();
                    break;
                case 7:
                    gitgud = "Met dit cijfer heeft u een voldoende behaald";
                    repaint();
                    break;
                case 8:
                    gitgud = "Met dit cijfer heeft u een goed behaald.";
                    repaint();
                    break;
                case 9:
                    gitgud = "Met dit cijfer heeft u een goed behaald.";
                    repaint();
                    break;
                case 10:
                    gitgud = "Met dit cijfer heeft u een goed behaald.";
                    repaint();
                    break;
                default:
                    gitgud = "dit is geen geldig cijfer";
                    repaint();
                    break;

            }


        }
    }

    class okeknopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);

            switch (getal) {
                case 0:
                    gitgud = "Met dit cijfer heeft u slecht gepresteert.";
                    repaint();
                    break;
                case 1:
                    gitgud = "Met dit cijfer heeft u slecht gepresteert.";
                    repaint();
                    break;
                case 2:
                    gitgud = "Met dit cijfer heeft u slecht gepresteert.";
                    repaint();
                    break;
                case 3:
                    gitgud = "Met dit cijfer heeft u slecht gepresteert.";
                    repaint();
                    break;
                case 4:
                    gitgud = "Met dit cijfer heeft u een onvoldoende behaald.";
                    repaint();
                    break;
                case 5:
                    gitgud = "Met dit cijfer heeft u een matig behaald.";
                    repaint();
                    break;
                case 6:
                    gitgud = "Met dit cijfer heeft u een voldoende behaald";
                    repaint();
                    break;
                case 7:
                    gitgud = "Met dit cijfer heeft u een voldoende behaald";
                    repaint();
                    break;
                case 8:
                    gitgud = "Met dit cijfer heeft u een goed behaald.";
                    repaint();
                    break;
                case 9:
                    gitgud = "Met dit cijfer heeft u een goed behaald.";
                    repaint();
                    break;
                case 10:
                    gitgud = "Met dit cijfer heeft u een goed behaald.";
                    repaint();
                    break;
                default:
                    gitgud = "dit is geen geldig cijfer";


            }



        }
    }
}


