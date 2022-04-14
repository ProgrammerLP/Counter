package Gui;

import javax.swing.*;
import java.awt.*;
import actions.actions;

public class Draw extends JLabel {

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        //Draw Background
        g.setColor(new Color(135,135,255));
        g.fillRect(0,0, Gui.width, Gui.height);

        //Draw Scores
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(""+actions.ch, 120, 140);
        g.drawString(" : "+actions.cm, 160, 140);
        g.drawString(" : "+actions.cs, 200, 140);

        repaint();

    }
}
