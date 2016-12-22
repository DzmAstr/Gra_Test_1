
import javax.swing.*;
import java.awt.*;

import Okno.*;


public class Main {

    public static void  main(String [] args) {

        mojeOkno okno = new mojeOkno();

        okno.setVisible(true);

    };



/*
        public void paint(Graphics g) {
            Dimension size = getSize();
            int d = Math.min(size.width, size.height);
            int ed = d/20;
            int x = (size.width - d)/2;
            int y = (size.height - d)/2;
            g.fillOval(x, y, d, d);
            g.setColor(Color.black);
            g.drawOval(x, y, d, d);
            g.fillOval(x+d/3-(ed/2), y+d/3-(ed/2), ed, ed);
            g.fillOval(x+(2*(d/3))-(ed/2), y+d/3-(ed/2), ed, ed);
            g.drawArc(x+d/4, y+2*(d/5), d/2, d/3, 0, -180);
        }

 */

}
