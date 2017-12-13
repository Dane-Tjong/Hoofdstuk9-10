package HS10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht03_4 extends Applet{
    TextField tekstvak;
    TextField jaar;
    Label label;
    int maanden;
    int jaartal;
    String maand;
    String tekst;

    public void init() {
        jaar = new TextField("",20);
        tekstvak = new TextField("", 20);
        label = new Label("link is jaartal rechts is maandnummer ");
        tekstvak.addActionListener(new TekstvakListener());
        jaar.addActionListener(new TekstvakListener());
        add(label);
        add(jaar);
        add(tekstvak);

    }


    public void paint(Graphics g) {
        g.drawString("geselecteerde maand = "+ maand ,50,60);
    }



    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String j = jaar.getText();
            jaartal = Integer.parseInt( j );
            String m = tekstvak.getText();
            maanden = Integer.parseInt(m);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst = ""+ jaartal + " is geen schrikkeljaar";
            }
            repaint();

            switch (maanden) {
                case 1:
                    maand = "Januari heeft 31 dagen.";
                    break;
                case 2:
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0 ) {
                        maand = "Februari heeft 29 dagen.";
                        repaint();
                    }else {
                        maand = "Februari heeft 28 dagen.";
                        repaint();
                    }
                    repaint();
                    break;
                case 3:
                    maand = "Maart heeft 31 dagen.";
                    break;
                case 4:
                    maand = "April heeft 30 dagen.";
                    break;
                case 5:
                    maand = "Mei heeft 31 dagen.";
                    break;
                case 6:
                    maand = "Juni heeft 30 dagen.";
                    break;
                case 7:
                    maand = "Juli heeft 31 dagen.";
                    break;
                case 8:
                    maand = "Augustus heeft 31 dagen.";
                    break;
                case 9:
                    maand = "September heeft 30 dagen.";
                    break;
                case 10:
                    maand = "Oktober heeft 31 dagen.";
                    break;
                case 11:
                    maand = "November heeft 30 dagen.";
                    break;
                case 12:
                    maand = "December heeft 31 dagen.";
                    break;
                default:
                    maand = "Er zijn maar 12 maanden!";
                    break;
            }
            repaint();
        }
    }
}