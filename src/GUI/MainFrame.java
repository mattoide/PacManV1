package GUI;

import GameLogic.Giocatore;
import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MainFrame extends JFrame {

    public static final int ALTEZZA_FRAME = 723;
    public static final int LARGHEZZA_FRAME = 1027;
    public static final Dimension DIM_FRAME = new Dimension(LARGHEZZA_FRAME, ALTEZZA_FRAME);
    public static GamePanel gamePanel;
    //public static EndPanel endPanel;
    public Giocatore player;

    public MainFrame() {

        //Metodi che definiscono un frame
        this.setSize(DIM_FRAME);
        this.setTitle("Pac-man");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.player = new Giocatore();

        gamePanel = new GamePanel(player);
        //endPanel = new EndPanel(player);

        gamePanel.setVisible(true);
        //endPanel.setVisible(false);
        gamePanel.setFocusable(true);
        gamePanel.requestFocus();
        this.getContentPane().add(gamePanel);
        //this.getContentPane().add(endPanel);

    }
}
