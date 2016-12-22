package Okno;



import javax.swing.*;
import java.awt.*;


public class poleMenuInfo extends JPanel{

    public statusPanel statusPan ;
    public menuPanel menuPan ;


    public boolean userDataCompleted; //czy sa wypelnione wszystkie dane

    public int gameStatus; //1-nie zaczela sie ,2 -trwa, 3 - skonczyla sie(komunikat)


    public  poleMenuInfo() {

        this.setPreferredSize(new Dimension(200,500));
        //this.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        this.setBackground(new Color(183,243, 151));

        initUI();

    }

    private void initUI() {

    this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));



        //BorderLayout menuLayout = new BorderLayout();

        this.setLayout(new BorderLayout());

        statusPan = new statusPanel();
        //statusPan.statusPanel();
        menuPan = new menuPanel();
        //menuPan.menuPanel();

        //statusPan.setVisible(false);
        //statusPan.isVisible(false);
        this.add(menuPan,BorderLayout.CENTER);
        this.add(statusPan,BorderLayout.CENTER);  //dowiedziesc sie jak robic LAYERS


        this.setVisible(true);


    }


}
