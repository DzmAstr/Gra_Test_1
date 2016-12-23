package Okno;


import javax.swing.*;
import java.awt.*;

public class przeszkoda extends JComponent {


    public int x;
    public int y;
    public int width;
    public int height;

    public przeszkoda() {
        this(30,50,100,200);
    }

    public przeszkoda(int xK, int yK, int widhtK, int heightK){

        fillData(xK,yK,widhtK,heightK);

    }

    private void fillData(int xK,int yK,int widhtK,int heightK) {
        x=xK;
        y=yK;
        width=widhtK;
        height=heightK;


    }


    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);

        int widthParScreen= this.getParent().getWidth();
        int heightParScreen= this.getParent().getHeight();

        g.setColor(new Color(37, 40, 170));

        g.fillRect(x*widthParScreen/1000,y*heightParScreen/1000,width*widthParScreen/1000,height*heightParScreen/1000);


    }
/*

    public void changeCharacteristics(int xK,int yK,int widhtK,int heightK) {  // float xK,float yK, float widhtK,float heightK){
        x=xK;
        y=yK;
        width=widhtK;
        height=heightK;
    }
*/

}
