/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class lineeee {

    private Line2D.Double l0, l1, l2, l3, l4, l5, l6, l7, l8, l9;
    private Line2D.Double l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20;

    public lineeee() {
        //o
        l0 = new Line2D.Double(63, 42, 959, 42);
        l1 = new Line2D.Double(62, 129, 952, 129);
        l2 = new Line2D.Double(62, 191, 959, 191);
        l18 = new Line2D.Double(61, 260, 956, 260);
        l3 = new Line2D.Double(195, 326, 822, 326);
        l4 = new Line2D.Double(246, 395, 808, 395);
        l5 = new Line2D.Double(65, 453, 962, 453);
        l6 = new Line2D.Double(64, 514, 960, 514);
        l7 = new Line2D.Double(48, 546, 980, 546);
        l8 = new Line2D.Double(62, 581, 953, 581);
        l9 = new Line2D.Double(62, 645, 956, 645);

        //v
        l10 = new Line2D.Double(62, 41, 61, 644);
        l11 = new Line2D.Double(244, 43, 244, 585);
        l12 = new Line2D.Double(358, 40, 358, 648);
        l13 = new Line2D.Double(458, 41, 458, 642);
        l14 = new Line2D.Double(570, 43, 570, 645);
        l15 = new Line2D.Double(666, 42, 666, 652);
        l16 = new Line2D.Double(780, 41, 780, 646);
        l17 = new Line2D.Double(957, 41, 957, 646);
   //     
l19 = new Line2D.Double(125, 453, 125, 583);
l20 = new Line2D.Double(900, 453, 900, 583);
    }

    public void drawMaze(Graphics2D maze) {

        maze.setPaint(Color.blue);
//o
        maze.draw(l0);
        maze.draw(l1);
        maze.draw(l2);
        maze.draw(l3);
        maze.draw(l4);
        maze.draw(l5);
        maze.draw(l6);
        maze.draw(l7);
        maze.draw(l8);
        maze.draw(l9);
        maze.draw(l18);

        //v
        maze.draw(l10);
        maze.draw(l11);
        maze.draw(l12);
        maze.draw(l13);
        maze.draw(l14);
        maze.draw(l15);
        maze.draw(l16);
        maze.draw(l17);
        
         maze.draw(l19);
          maze.draw(l20);
    }
}
