package GameLogic;


import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Resources;

public class Giocatore{

    private static final int PUNTEGGIO_INIZIALE = 0;
    private static final int VITE_INIZIALI = 3;
    protected static final int VELOCITA = 15;

    Rectangle pacRect;
    BufferedImage pac;
    
    private int vita;
    private int punteggio;
    private int velocita;
    
    private int spostamento;
    
     private Line2D.Double line;

    public Giocatore() {
        
        this.vita = VITE_INIZIALI;
        this.punteggio = PUNTEGGIO_INIZIALE;
        
        this.pac = Resources.getImage("/img/pacDx.png");
        
        this.pacRect = new Rectangle(245, 126, pac.getWidth(null), pac.getHeight(null));
        
        this.velocita = VELOCITA;
        
        this.spostamento = 2;
        
        line = new Line2D.Double(13, 299, 10, 343);
    }
    

    public int getVita() {
        return vita;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public BufferedImage getPac() {
        return pac;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public void setPunteggio(int pPunteggio) {
        this.punteggio = pPunteggio;
    }

    public void movimentoDx() {
        this.pacRect.x += this.spostamento;
        //System.out.println("dx");
    }

    public void movimentoSx() {
        this.pacRect.x -= this.spostamento;
    
    }
    
    public void movimentoSu() {
        this.pacRect.y -= this.spostamento;
             // System.out.println("diooo");
    }

    public void movimentoGiu() {
        this.pacRect.y += this.spostamento;
    }

    public void movimentoContinuo(){
        
        if (this.getPacRect().intersectsLine(line)){
            this.pacRect.setLocation(1010, 308);
        }
    }
    
    public void drawPac(Graphics g) {
        g.drawImage(pac, pacRect.x, pacRect.y, pac.getWidth(), pac.getHeight(), null);
    }

    public Rectangle getPacRect() {
        return pacRect;
    }

    public void PacDx(){
        this.pac = Resources.getImage("/img/pacDx.png");
    }
    
    public void PacSx(){
        this.pac = Resources.getImage("/img/pacSx.png");
    }
    
    public void PacSu(){
        this.pac = Resources.getImage("/img/pacSu.png");
    }
    
    public void PacGiu(){
        this.pac = Resources.getImage("/img/pacGiu.png");
    }
    
    public int getVelocita() {
        return velocita;
    }

    public boolean isVivo() {
        if (vita > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void togliVita(){
            this.setVita(this.getVita() - 1);
    }
    
    public void restart(){
    this.pacRect.setLocation(512, 387);
        System.out.println("morto");
    }
    
}


