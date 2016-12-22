package Okno;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by Пыш-пыш on 03.12.2016.
 */
public class menuPanel extends JPanel{

    public JPanel pan1;

    public JPanel pan2;

    public JPanel pan3;

    public JPanel pan4;

    public JPanel pan5;




    public  menuPanel() {

        this.setPreferredSize(new Dimension(200,500));
        //this.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        ///this.setBackground(Color.CYAN);

        initUI();

    }

    private void initUI() {

        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));




        pan1 = new JPanel();
        pan2 = new JPanel();
        pan3 = new JPanel();
        pan4 = new JPanel();
        pan5 = new JPanel();


        pan1.setPreferredSize(new Dimension(200,100));
        pan2.setPreferredSize(new Dimension(200,100));
        pan3.setPreferredSize(new Dimension(200,100));
        pan4.setPreferredSize(new Dimension(200,100));
        pan5.setPreferredSize(new Dimension(200,100));

/*
        pan1.setBackground(Color.BLACK);
        pan2.setBackground(Color.BLUE);
        pan3.setBackground(Color.DARK_GRAY);
        pan4.setBackground(Color.WHITE);
        pan5.setBackground(Color.YELLOW);
*/


        pan1.setLayout(new BoxLayout(pan1,BoxLayout.LINE_AXIS));
        pan2.setLayout(new BoxLayout(pan2,BoxLayout.LINE_AXIS));
        pan3.setLayout(new BoxLayout(pan3,BoxLayout.LINE_AXIS));
        pan4.setLayout(new BoxLayout(pan4,BoxLayout.LINE_AXIS));
        pan5.setLayout(new BoxLayout(pan5,BoxLayout.LINE_AXIS));


        JButton butt1=new JButton("Butt1");
        JButton butt2=new JButton("Butt2");
        JButton butt3=new JButton("Butt3");
        JButton butt4=new JButton("Butt4");
        JButton butt5=new JButton("Butt5");

       // butt1.setPreferredSize(new Dimension(50,30));

        pan1.add(butt1);
        pan2.add(butt2);
        pan3.add(butt3);
        pan4.add(butt4);
        pan5.add(butt5);

        this.add(pan1);
        this.add(pan2);
        this.add(pan3);
        this.add(pan4);
        this.add(pan5);

    }


}
