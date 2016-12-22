package Okno;


import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.io.IOException;


public class poleGry extends JPanel {

    public kula kulka;

    public endLevel levEnd;

    //public  przeszkoda[] vektorPrzeszkod; //NWM JAK POPRAWNIE SIE ROBI

    public przeszkoda przeszkoTest;

    public przeszkoda[] arrPrzeszkod;


/////////////////////////////////////////////////////
    /*
    * parametry kulki
    */
    public static int kulkax;
    public static int kulkay;
    public static int kulkar;
    /*
     * parametry konca etapu
     */
    public static int koniecx;
    public static int koniecy;
    public static int koniecwidth;
    /*
     * parametry przeszkody 1
     */
    public static int prz1x;
    public static int prz1y;
    public static int prz1width;
    public static int prz1height;
    /*
     * parametry przeszkody 2
     */
    public static int prz2x;
    public static int prz2y;
    public static int prz2width;
    public static int prz2height;
    /*
     * parametry przeszkody 3
     */
    public static int prz3x;
    public static int prz3y;
    public static int prz3width;
    public static int prz3height;
    /*
     * parametry przeszkody 4
     */
    public static int prz4x;
    public static int prz4y;
    public static int prz4width;
    public static int prz4height;
    /*
     * parametry przeszkody 5
     */
    public static int prz5x;
    public static int prz5y;
    public static int prz5width;
    public static int prz5height;

 ///////////////////////////////////////





    public poleGry(){

        //this.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        this.setBackground(new Color(180, 176, 175));

/*
        kulka = new kula();


        this.add(kulka);
*/

        initPG();

    }


    public void initPG (){

        parsowanie();

        initKulka();
        initPrzeszkody();
        initEndGame();


    }

    private void initEndGame() {

        levEnd = new endLevel(koniecx,koniecy,koniecwidth);
        add(levEnd);
    }

    private void initPrzeszkody() {

        //TRZEBA ZROBIC POBIERANIE Z PLIKU
/*
      przeszkoTest=new przeszkoda(600,400,100,200);
        add(przeszkoTest);

        arrPrzeszkod= new przeszkoda[5];//pobieranie ilosci przeszkod dodac

        arrPrzeszkod[0]= new przeszkoda();

        add(arrPrzeszkod[0]);

        */
        //vektorPrzeszkod[0]=new przeszkoda(17,19,33,100);

/*        vektorPrzeszkod[0].changeCharacteristics(17,19,33,100);
        vektorPrzeszkod[1].changeCharacteristics(17,19,33,100);
        vektorPrzeszkod[2].changeCharacteristics(17,19,33,100);
        vektorPrzeszkod[3].changeCharacteristics(17,19,33,100);*/

        //parsowanie();
        arrPrzeszkod = new przeszkoda[5];
        arrPrzeszkod[0]= new przeszkoda(prz1x,prz1y,prz1width,prz1height);
        arrPrzeszkod[1]= new przeszkoda(prz2x,prz2y,prz2width,prz2height);
        arrPrzeszkod[2]= new przeszkoda(prz3x,prz3y,prz3width,prz3height);
        arrPrzeszkod[3]= new przeszkoda(prz4x,prz4y,prz4width,prz4height);
        arrPrzeszkod[4]= new przeszkoda(prz5x,prz5y,prz5width,prz5height);


        add(arrPrzeszkod[0]);
        add(arrPrzeszkod[1]);
        add(arrPrzeszkod[2]);
        add(arrPrzeszkod[3]);
        add(arrPrzeszkod[4]);



    }

    private void initKulka() {

        kulka = new kula(kulkax,kulkay,kulkar);
        this.add(kulka);

    }


    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //Dimension size= getSize();
        //Dimension size= getSize();
        //System.out.println(size);

        rysuj(g);
    }

    private void rysuj(Graphics g) {

        drawKulka(g);
        drawPrzesz(g);
        drawEndLvl(g);
    }







    private void drawEndLvl(Graphics g) {

        levEnd.paintComponent(g);
    }

    private void drawPrzesz(Graphics g) {

/*        przeszkoTest.paintComponent(g);
        arrPrzeszkod[0].paintComponent(g);*/
  /*    vektorPrzeszkod[0].paintComponent(g);
        vektorPrzeszkod[1].paintComponent(g);
        vektorPrzeszkod[2].paintComponent(g);
        vektorPrzeszkod[3].paintComponent(g);
*/

        arrPrzeszkod[0].paintComponent(g);
        arrPrzeszkod[1].paintComponent(g);
        arrPrzeszkod[2].paintComponent(g);
        arrPrzeszkod[3].paintComponent(g);
        arrPrzeszkod[4].paintComponent(g);

    }

    private void drawKulka(Graphics g) {

        kulka.paintComponent(g);
        //kulka.odr();

    }



    public static void parsowanie()
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try
        {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc= builder.parse("level1.xml");

            doc.getDocumentElement().normalize();

            kulkax = Integer.parseInt(doc.getElementsByTagName("kulkax").item(0).getTextContent());
            kulkay = Integer.parseInt(doc.getElementsByTagName("kulkay").item(0).getTextContent());
            kulkar = Integer.parseInt(doc.getElementsByTagName("kulkar").item(0).getTextContent());

            koniecx = Integer.parseInt(doc.getElementsByTagName("koniecx").item(0).getTextContent());
            koniecy = Integer.parseInt(doc.getElementsByTagName("koniecy").item(0).getTextContent());
            koniecwidth = Integer.parseInt(doc.getElementsByTagName("koniecwidth").item(0).getTextContent());

            prz1x = Integer.parseInt(doc.getElementsByTagName("prz1x").item(0).getTextContent());
            prz1y = Integer.parseInt(doc.getElementsByTagName("prz1y").item(0).getTextContent());
            prz1width = Integer.parseInt(doc.getElementsByTagName("prz1width").item(0).getTextContent());
            prz1height = Integer.parseInt(doc.getElementsByTagName("prz1height").item(0).getTextContent());

            prz2x = Integer.parseInt(doc.getElementsByTagName("prz2x").item(0).getTextContent());
            prz2y = Integer.parseInt(doc.getElementsByTagName("prz2y").item(0).getTextContent());
            prz2width = Integer.parseInt(doc.getElementsByTagName("prz2width").item(0).getTextContent());
            prz2height = Integer.parseInt(doc.getElementsByTagName("prz2height").item(0).getTextContent());

            prz3x = Integer.parseInt(doc.getElementsByTagName("prz3x").item(0).getTextContent());
            prz3y = Integer.parseInt(doc.getElementsByTagName("prz3y").item(0).getTextContent());
            prz3width = Integer.parseInt(doc.getElementsByTagName("prz3width").item(0).getTextContent());
            prz3height = Integer.parseInt(doc.getElementsByTagName("prz3height").item(0).getTextContent());

            prz4x = Integer.parseInt(doc.getElementsByTagName("prz4x").item(0).getTextContent());
            prz4y = Integer.parseInt(doc.getElementsByTagName("prz4y").item(0).getTextContent());
            prz4width = Integer.parseInt(doc.getElementsByTagName("prz4width").item(0).getTextContent());
            prz4height = Integer.parseInt(doc.getElementsByTagName("prz4height").item(0).getTextContent());

            prz5x = Integer.parseInt(doc.getElementsByTagName("prz5x").item(0).getTextContent());
            prz5y = Integer.parseInt(doc.getElementsByTagName("prz5y").item(0).getTextContent());
            prz5width = Integer.parseInt(doc.getElementsByTagName("prz5width").item(0).getTextContent());
            prz5height = Integer.parseInt(doc.getElementsByTagName("prz5height").item(0).getTextContent());

        }
        catch (ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        catch (SAXException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}



