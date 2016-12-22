package Okno;

import javax.swing.*;
import javax.swing.text.StringContent;
import java.awt.*;


public class mojeOkno extends JFrame {


    public poleGry PoleGry;

    public poleMenuInfo menuPan;

    public mojeOkno() {

        setSize(678, 500);
        setTitle("Gra_Kulka");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

       /* this.setLayout(new BorderLayout());

        poleGry pole1 = new poleGry();

        add(pole1,BorderLayout.CENTER);



        pole1.setBorder(BorderFactory.createLineBorder(Color.black));

        pole1.setVisible(true);
*/
        //setVisible(true);

        inicjalizujUI();


    }

    private void inicjalizujUI() {

        this.setLayout(new BorderLayout());


        PoleGry = new poleGry();


        //PoleGry.poleGry();

        menuPan = new poleMenuInfo();

        // menuPan.poleMenuInfo();


        this.add(menuPan, BorderLayout.EAST);
        this.add(PoleGry, BorderLayout.CENTER);


    }





/*
    public void fun() {
        mojeOkno okn = new mojeOkno();
        okn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okn.setLocationRelativeTo(null);
        okn.setVisible(true);
    };
*/
/*

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}
*/





}