package GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Line {

    private Line2D.Double currentLine0, currentLine1, currentLine2, currentLine3, currentLine4, currentLine5,
            currentLine6, currentLine7, currentLine8, currentLine9, currentLine10, currentLine11,
            currentLine12, currentLine13, currentLine14, currentLine15, currentLine16, currentLine17,
            currentLine18, currentLine19, currentLine20, currentLine21, currentLine22, currentLine23,
            currentLine24, currentLine25;

    private Line2D.Double[] linesO;

    private Line2D.Double currentLine26, currentLine27, currentLine28, currentLine29, currentLine30, currentLine31,
            currentLine32, currentLine33, currentLine34, currentLine35, currentLine36, currentLine37,
            currentLine38, currentLine39, currentLine40, currentLine41, currentLine42, currentLine43,
            currentLine44, currentLine45, currentLine46, currentLine47, currentLine48, currentLine49,
            currentLine50, currentLine51, currentLine52, currentLine53, currentLine54, currentLine55,
            currentLine56, currentLine57, currentLine58, currentLine59, currentLine60, currentLine61,
            currentLine62, currentLine63, currentLine64, currentLine65, currentLine66, currentLine67,
            currentLine68, currentLine69;

    private Line2D.Double[] linesV;

    public Line() {

        //1
        currentLine0 = new Line2D.Double(55, 40, 450, 40);
        currentLine1 = new Line2D.Double(307, 40, 696, 40);
        //2
        currentLine2 = new Line2D.Double(55, 126, 550, 126);
        currentLine3 = new Line2D.Double(307, 126, 695, 126);
        //3
        currentLine4 = new Line2D.Double(55, 188, 240, 188);
        currentLine5 = new Line2D.Double(205, 188, 300, 188);
        currentLine6 = new Line2D.Double(307, 188, 410, 188);
        currentLine7 = new Line2D.Double(412, 188, 592, 188);
        //4
        currentLine8 = new Line2D.Double(205, 256, 410, 256);
        currentLine9 = new Line2D.Double(307, 256, 410, 256);
        //5
        currentLine10 = new Line2D.Double(145, 325, 268, 325);
        currentLine11 = new Line2D.Double(352, 324, 480, 324);
        //6
        currentLine12 = new Line2D.Double(205, 390, 410, 390);
        currentLine13 = new Line2D.Double(307, 390, 410, 390);
        //7
        currentLine14 = new Line2D.Double(55, 450, 454, 450);
        currentLine15 = new Line2D.Double(307, 450, 690, 450);
        //8
        currentLine16 = new Line2D.Double(70, 512, 125, 512); 
        currentLine17 = new Line2D.Double(145, 512, 470, 512);
        currentLine18 = new Line2D.Double(307, 512, 520, 512);
        currentLine19 = new Line2D.Double(); //esterno
        //9
        currentLine20 = new Line2D.Double(55, 577, 240, 577);
        currentLine21 = new Line2D.Double(205, 577, 300, 577);
        currentLine22 = new Line2D.Double(307, 577, 410, 577);
        currentLine23 = new Line2D.Double(413, 577, 592, 577);
        //10
        currentLine24 = new Line2D.Double(70, 640, 530, 640);
        currentLine25 = new Line2D.Double(307, 640, 695, 64);

        linesO = new Line2D.Double[]{
            currentLine0, currentLine1, currentLine2, currentLine3, currentLine4, currentLine5, currentLine6, currentLine7,
            currentLine8, currentLine9, currentLine10, currentLine11, currentLine12, currentLine13, currentLine14, currentLine15,
            currentLine16, currentLine17, currentLine18, /**/ currentLine20, currentLine21, currentLine22, currentLine23,
            currentLine24, currentLine25
        };

        //1
        currentLine26 = new Line2D.Double(60, 60, 60, 100);
        currentLine27 = new Line2D.Double(60, 105, 60, 130);
        currentLine28 = new Line2D.Double(60, 250, 60, 300);
        currentLine29 = new Line2D.Double(60, 330, 60, 360);
        //2
        currentLine30 = new Line2D.Double(240, 60, 240, 100);
        currentLine31 = new Line2D.Double(240, 105, 240, 130);
        currentLine32 = new Line2D.Double(240, 135, 240, 160);
        currentLine33 = new Line2D.Double(240, 153, 240, 180);
        currentLine34 = new Line2D.Double(240, 170, 240, 200);
        currentLine35 = new Line2D.Double(240, 205, 240, 240);
        currentLine36 = new Line2D.Double(240, 235, 240, 300);
        currentLine37 = new Line2D.Double(240, 297, 240, 320);
        //3
        currentLine38 = new Line2D.Double(360, 105, 360, 130);
        currentLine39 = new Line2D.Double(360, 170, 360, 200);
        currentLine40 = new Line2D.Double(360, 205, 360, 240);
        currentLine41 = new Line2D.Double(360, 235, 360, 255);
        currentLine42 = new Line2D.Double(360, 297, 360, 320);
        //4
        currentLine43 = new Line2D.Double(450, 60, 450, 100);
        currentLine44 = new Line2D.Double(450, 135, 450, 160);
        currentLine45 = new Line2D.Double(450, 250, 450, 300);
        currentLine46 = new Line2D.Double(450, 330, 450, 360);
        //5
        currentLine47 = new Line2D.Double(564, 60, 564, 100);
        currentLine48 = new Line2D.Double(564, 135, 564, 160);
        currentLine49 = new Line2D.Double(564, 250, 564, 300);
        currentLine50 = new Line2D.Double(564, 330, 564, 360);
        //6
        currentLine51 = new Line2D.Double(654, 105, 654, 130);
        currentLine52 = new Line2D.Double(654, 170, 654, 200);
        currentLine53 = new Line2D.Double(654, 205, 654, 240);
        currentLine54 = new Line2D.Double(654, 235, 654, 255);
        currentLine55 = new Line2D.Double(654, 297, 654, 320);
        //7
        currentLine56 = new Line2D.Double(774, 60, 774, 100);
        currentLine57 = new Line2D.Double(774, 105, 774, 130);
        currentLine58 = new Line2D.Double(774, 135, 774, 160);
        currentLine59 = new Line2D.Double(774, 153, 774, 180);
        currentLine60 = new Line2D.Double(774, 170, 774, 200);
        currentLine61 = new Line2D.Double(774, 205, 774, 240);
        currentLine62 = new Line2D.Double(774, 235, 774, 300);
        currentLine63 = new Line2D.Double(774, 297, 774, 320);
        //8
        currentLine64 = new Line2D.Double(953, 45, 953, 130);
        currentLine65 = new Line2D.Double(953, 88, 953, 110);
        currentLine66 = new Line2D.Double(953, 104, 953, 145);
        currentLine67 = new Line2D.Double(953, 250, 953, 300);
        currentLine68 = new Line2D.Double(953, 313, 953, 340);
        currentLine69 = new Line2D.Double(953, 330, 953, 360);

        linesV = new Line2D.Double[]{
            currentLine26, currentLine27, currentLine28, currentLine29, currentLine30, currentLine31,
            currentLine32, currentLine33, currentLine34, currentLine35, currentLine36, currentLine37,
            currentLine38, currentLine39, currentLine40, currentLine41, currentLine42, currentLine43,
            currentLine44, currentLine45, currentLine46, currentLine47, currentLine48, currentLine49,
            currentLine50, currentLine51, currentLine52, currentLine53, currentLine54, currentLine55,
            currentLine56, currentLine57, currentLine58, currentLine59, currentLine60, currentLine61,
            currentLine62, currentLine63, currentLine64, currentLine65, currentLine66, currentLine67,
            currentLine68, currentLine69
        };

    }

    public Line2D.Double[] getLinesO() {
        return linesO;
    }

    public Line2D.Double[] getLinesV() {
        return linesV;
    }

    public void drawMaze(Graphics2D maze) {

        maze.setPaint(Color.white);
    }

}
