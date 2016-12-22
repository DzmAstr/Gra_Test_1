package Okno;


import javax.swing.*;
import java.awt.*;

public class endLevel extends JComponent{



    public int x;
    public int y;
    public int width;


    public endLevel() {
        this(700,700,100);
    }

    public endLevel(int xK, int yK, int widhtK){

        fillData(xK,yK,widhtK);

    }

    private void fillData(int xK,int yK,int widhtK) {
        x=xK;
        y=yK;
        width=widhtK;



    }



    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);

        int widthParScreen= this.getParent().getWidth();
        int heightParScreen= this.getParent().getHeight();

        Dimension size= getSize();
        g.setColor(new Color(198, 0, 178));

        g.fillRect(x*widthParScreen/1000,y*heightParScreen/1000,width*widthParScreen/1000,width*heightParScreen/1000);



    }

}
