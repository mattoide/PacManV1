package GUI;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import utils.Resources;

public class Pallino {

    Rectangle pointRect;
    BufferedImage point;

    private int x;
    private int y;

    public Pallino(int px, int py) {

        this.x = px;
        this.y = py;
        this.point = Resources.getImage("/img/point.png");
        this.pointRect = new Rectangle(this.x, this.y, point.getWidth(null), point.getHeight(null));

    }
    
    

    public BufferedImage getPoint() {
        return point;
    }

    public void draw(Graphics g) {
            g.drawImage(point, this.getX(), this.getY(), point.getWidth(), point.getHeight(), null);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Rectangle getRect() {
        return pointRect;
    }

}
