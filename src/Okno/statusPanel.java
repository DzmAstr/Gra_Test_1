package Okno;

import javax.swing.*;
import java.awt.*;


public class statusPanel extends JPanel{

    public JPanel pan1;

    public JPanel pan2;

    public JPanel pan3;

    public JPanel pan4;

    public JPanel pan5;




    public int lifes; //ilosc zyc
    public int currentScore; //obecne pkt
    public String levelName; //imie lvl




    public  statusPanel() {

        this.setPreferredSize(new Dimension(200,500));
        this.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        this.setBackground(new Color(183,243, 151));

        initUI();

    }

    private void initUI() {

        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));


        initPanels(this);



    }

    private void initPanels(statusPanel statusPanel) {

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

        pan1.setMaximumSize(new Dimension(200,1000));
        pan2.setMaximumSize(new Dimension(200,1000));
        pan3.setMaximumSize(new Dimension(200,1000));
        pan4.setMaximumSize(new Dimension(200,1000));
        pan5.setMaximumSize(new Dimension(200,1000));

        pan1.setBackground(new Color(183,243, 151));
        pan2.setBackground(new Color(183,243, 151));
        pan3.setBackground(new Color(183,243, 151));
        pan4.setBackground(new Color(183,243, 151));
        pan5.setBackground(new Color(183,243, 151));


        pan1.setLayout(new BoxLayout(pan1,BoxLayout.LINE_AXIS));
        pan2.setLayout(new BoxLayout(pan2,BoxLayout.Y_AXIS));
        pan3.setLayout(new BoxLayout(pan3,BoxLayout.LINE_AXIS));
        pan4.setLayout(new BoxLayout(pan4,BoxLayout.X_AXIS));
        pan5.setLayout(new BoxLayout(pan5,BoxLayout.Y_AXIS));

        JLabel lable1 = new JLabel("Level 1");lable1.setBackground(new Color(183,243, 151));   //поправитьб сделать все в отдельных функцияхб в конструкторе прописать ЛЕВЕЛ и СКОР
        JLabel lable2 = new JLabel("Score 2300");lable2.setBackground(new Color(183,243, 151));
        JLabel lable3 = new JLabel("Time : 0:40");lable3.setBackground(new Color(183,243, 151));

        JButton pause = new JButton("Pause");

        pan2.add(lable1);
        pan2.add(lable2);
        pan2.add(lable3);

  /*      JPanel pan5_1=new JPanel();
        pan5_1.setLayout(new BorderLayout());
        pan5_1.setMaximumSize(new Dimension(80,40));
        pan5_1.add(pause,BorderLayout.CENTER);*/
        pan5.add(pause);

        paintLifeLevel(pan4);

        this.add(pan1);
        this.add(pan2);
        this.add(pan3);
        this.add(pan4);
        this.add(pan5);
    }

    private void paintLifeLevel(JPanel pan4) {

        String pathLifeIcon = "Images/img1.png";

        JLabel lifeIcon = new JLabel(new ImageIcon(getClass().getResource(pathLifeIcon)));
        JLabel lifeIcon2 = new JLabel(new ImageIcon(getClass().getResource(pathLifeIcon)));
        pan4.add(lifeIcon,BorderLayout.CENTER);
        pan4.add(lifeIcon2,BorderLayout.CENTER);

    }


}
