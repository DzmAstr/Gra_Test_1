package Okno;


import javax.swing.*;
import java.awt.*;

public class kula extends JComponent {

   public int x;
   public int y;
   public int radius;
   public Color kolor;


    public kula() {
        this(100,400,100);
    }

    public kula(int xK,int yK,int radiusK){

        kolor = new Color(173, 25, 24);
        x=xK;
        y=yK;
        radius=radiusK;




    }


    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);


        int widthParScreen= this.getParent().getWidth();
        int heightParScreen= this.getParent().getHeight();
       // System.out.println(size);
        g.setColor(Color.BLUE);

        g.fillOval(x*widthParScreen/1000,y*heightParScreen/1000,radius*widthParScreen/1000,radius*heightParScreen/1000);



    }



    public void odr(){
        x=100;

        paintComponent(this.getGraphics());
    }


}
