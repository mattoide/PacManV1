/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;

public class NewClass {

    public void drawMaze(Graphics2D maze) {

        maze.setPaint(Color.white);

        //contorno sx
        Line2D.Double currentLine = new Line2D.Double(30, 8, 985, 8);
        maze.draw(currentLine);
        currentLine.setLine(56, 25, 482, 25);
        maze.draw(currentLine);
        //(x, y, larghezza,altezza, inizio, angolo, tipo);
        Arc2D.Double bend = new Arc2D.Double(38, 24, 50, 30, 100, 80, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(37, 35, 37, 204);
        maze.draw(currentLine);
        bend.setArc(36, 184, 50, 30, 200, 80, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(56, 214, 189, 214);
        maze.draw(currentLine);

        //contorno centro
        bend.setArc(470, 26, 25, 25, 350, 100, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(493, 35, 493, 97);
        maze.draw(currentLine);
        bend.setArc(495, 88, 38, 22, 180, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(534, 35, 534, 97);
        maze.draw(currentLine);
        bend.setArc(532, 25, 42, 30, 100, 80, Arc2D.OPEN); //this
        maze.draw(bend);

//contorno dx
        //prima riga primo a sx  
        currentLine.setLine(116, 65, 210, 65);
        maze.draw(currentLine);
        currentLine.setLine(116, 106, 210, 106);
        maze.draw(currentLine);
        bend.setArc(105, 60, 50, 50, 130, 110, Arc2D.OPEN);
        maze.draw(bend);
        bend.setArc(168, 60, 50, 50, 300, 110, Arc2D.OPEN);
        maze.draw(bend);

        //prima riga secondo a sx  
        currentLine.setLine(294, 65, 415, 65);
        maze.draw(currentLine);
        currentLine.setLine(294, 106, 413, 106);
        maze.draw(currentLine);
        bend.setArc(284, 60, 50, 50, 130, 110, Arc2D.OPEN);
        maze.draw(bend);
        bend.setArc(376, 60, 50, 50, 300, 110, Arc2D.OPEN);
        maze.draw(bend);

        //prima riga terzo a sx  
        currentLine.setLine(613, 65, 734, 65);
        maze.draw(currentLine);
        currentLine.setLine(614, 106, 732, 106);
        maze.draw(currentLine);
        bend.setArc(602, 60, 50, 50, 130, 110, Arc2D.OPEN);
        maze.draw(bend);
        bend.setArc(695, 60, 50, 50, 300, 110, Arc2D.OPEN);
        maze.draw(bend);

        //prima riga quarto a sx  
        currentLine.setLine(822, 65, 913, 65);
        maze.draw(currentLine);
        currentLine.setLine(822, 106, 913, 106);
        maze.draw(currentLine);
        bend.setArc(812, 60, 50, 50, 130, 110, Arc2D.OPEN);
        maze.draw(bend);
        bend.setArc(874, 60, 50, 50, 300, 110, Arc2D.OPEN);
        maze.draw(bend);

        //seconda riga quello a sx
        currentLine.setLine(114, 150, 201, 150);
        maze.draw(currentLine);
        currentLine.setLine(114, 173, 201, 173);
        maze.draw(currentLine);
        bend.setArc(105, 150, 22, 22, 80, 200, Arc2D.OPEN);
        maze.draw(bend);
        bend.setArc(192, 150, 22, 22, 270, 180, Arc2D.OPEN);
        maze.draw(bend);

        //seconda riga quello a dx
        currentLine.setLine(824, 150, 912, 150);
        maze.draw(currentLine);
        currentLine.setLine(824, 173, 912, 173);
        maze.draw(currentLine);
        bend.setArc(812, 150, 22, 22, 80, 200, Arc2D.OPEN);
        maze.draw(bend);
        bend.setArc(902, 150, 22, 22, 270, 180, Arc2D.OPEN);
        maze.draw(bend);

        //cemtrale muro
        //1 T
        currentLine.setLine(399, 149, 628, 149);
        maze.draw(currentLine);
        bend.setArc(388, 149, 22, 24, 80, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(399, 174, 481, 174);
        maze.draw(currentLine);
        bend.setArc(469, 175, 25, 25, 350, 100, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(494, 183, 494, 230);
        maze.draw(currentLine);
        bend.setArc(495, 217, 37, 22, 180, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(533, 183, 533, 230);
        maze.draw(currentLine);
        bend.setArc(532, 175, 35, 25, 100, 80, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(546, 175, 626, 175);
        maze.draw(currentLine);
        bend.setArc(614, 150, 26, 24, 270, 200, Arc2D.OPEN);
        maze.draw(bend);

        //2 T
        currentLine.setLine(399, 409, 628, 409);
        maze.draw(currentLine);
        bend.setArc(388, 409, 22, 23, 80, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(399, 433, 481, 433);
        maze.draw(currentLine);
        bend.setArc(469, 434, 25, 25, 350, 100, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(494, 445, 494, 488);
        maze.draw(currentLine);
        bend.setArc(495, 477, 37, 22, 180, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(533, 487, 533, 444);
        maze.draw(currentLine);
        bend.setArc(534, 433, 35, 25, 100, 80, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(548, 433, 626, 433);
        maze.draw(currentLine);
        bend.setArc(616, 409, 22, 23, 270, 200, Arc2D.OPEN);
        maze.draw(bend);

        //3 T
        currentLine.setLine(399, 537, 628, 537);
        maze.draw(currentLine);
        bend.setArc(389, 537, 22, 23, 80, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(399, 561, 481, 561);
        maze.draw(currentLine);
        bend.setArc(469, 562, 25, 25, 350, 100, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(494, 575, 494, 615);
        maze.draw(currentLine);
        bend.setArc(495, 605, 37, 22, 180, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(533, 617, 533, 576);
        maze.draw(currentLine);
        bend.setArc(532, 564, 35, 25, 100, 80, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(548, 562, 626, 562);
        maze.draw(currentLine);
        bend.setArc(616, 537, 24, 23, 270, 200, Arc2D.OPEN);
        maze.draw(bend);

        //rettangolo centrale
        currentLine.setLine(461, 286, 461, 280);
        maze.draw(currentLine);
        currentLine.setLine(461, 278, 390, 278);
        maze.draw(currentLine);
        currentLine.setLine(389, 279, 389, 365);
        maze.draw(currentLine);
        currentLine.setLine(389, 367, 637, 367);
        maze.draw(currentLine);
        currentLine.setLine(639, 367, 639, 279);
        maze.draw(currentLine);
        currentLine.setLine(637, 278, 567, 278);
        maze.draw(currentLine);
        currentLine.setLine(566, 278, 566, 289);
        maze.draw(currentLine);
        currentLine.setLine(566, 289, 623, 289);
        maze.draw(currentLine);
        currentLine.setLine(623, 289, 623, 355);
        maze.draw(currentLine);
        currentLine.setLine(623, 355, 402, 355);
        maze.draw(currentLine);
        currentLine.setLine(404, 355, 404, 290);
        maze.draw(currentLine);
        currentLine.setLine(402, 290, 460, 290);
        maze.draw(currentLine);

        //colonna sx
        //1
        currentLine.setLine(283, 157, 283, 293);
        maze.draw(currentLine);
        bend.setArc(283, 282, 37, 22, 180, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(320, 291, 320, 250);
        maze.draw(currentLine);
        bend.setArc(320, 236, 42, 30, 100, 80, Arc2D.OPEN); //this
        maze.draw(bend);
        currentLine.setLine(335, 238, 414, 238);
        maze.draw(currentLine);
        bend.setArc(404, 214, 22, 24, 270, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(414, 213, 332, 213);
        maze.draw(currentLine);
        bend.setArc(320, 184, 50, 30, 180, 70, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(320, 196, 320, 159);
        maze.draw(currentLine);
        bend.setArc(282, 148, 37, 22, 0, 180, Arc2D.OPEN);
        maze.draw(bend);

        //2
        currentLine.setLine(281, 351, 281, 421);
        maze.draw(currentLine);
        bend.setArc(283, 410, 37, 22, 180, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(320, 420, 320, 350);
        maze.draw(currentLine);
        bend.setArc(283, 342, 37, 22, 0, 180, Arc2D.OPEN);
        maze.draw(bend);

        //3
        currentLine.setLine(417, 472, 295, 472);
        maze.draw(currentLine);
        bend.setArc(283, 472, 22, 24, 80, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(295, 496, 417, 496);
        maze.draw(currentLine);
        bend.setArc(404, 473, 24, 23, 270, 200, Arc2D.OPEN);
        maze.draw(bend);

        //4
        currentLine.setLine(267, 600, 120, 600);
        maze.draw(currentLine);
        bend.setArc(107, 601, 23, 24, 80, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(120, 625, 416, 625);
        maze.draw(currentLine);
        bend.setArc(404, 601, 24, 24, 270, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(412, 601, 334, 601);
        maze.draw(currentLine);
        bend.setArc(318, 571, 50, 30, 180, 70, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(320, 584, 320, 547);
        maze.draw(currentLine);
        bend.setArc(282, 536, 37, 22, 0, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(282, 584, 282, 547);
        maze.draw(currentLine);

        //sx sx
        currentLine.setLine(201, 472, 120, 472);
        maze.draw(currentLine);
        bend.setArc(107, 472, 22, 24, 80, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(120, 496, 163, 496);
        maze.draw(currentLine);
        bend.setArc(151, 497, 25, 25, 350, 100, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(177, 512, 177, 550);
        maze.draw(currentLine);
        bend.setArc(178, 540, 37, 22, 180, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(215, 549, 215, 491);
        maze.draw(currentLine);
        bend.setArc(190, 475, 25, 30, 350, 120, Arc2D.OPEN);
        maze.draw(bend);

        //colonna dx
        //1
        currentLine.setLine(708, 157, 708, 199);
        maze.draw(currentLine);
        bend.setArc(708, 282, 37, 22, 180, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(690, 213, 617, 213);
        maze.draw(currentLine);
        bend.setArc(603, 213, 24, 25, 80, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(707, 252, 707, 288);
        maze.draw(currentLine);
        currentLine.setLine(619, 238, 697, 238);
        maze.draw(currentLine);
        bend.setArc(708, 150, 37, 22, 0, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(745, 290, 745, 158);
        maze.draw(currentLine);

        //2
        currentLine.setLine(707, 351, 707, 421);
        maze.draw(currentLine);
        bend.setArc(708, 410, 37, 22, 180, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(746, 420, 746, 350);
        maze.draw(currentLine);
        bend.setArc(708, 342, 37, 22, 0, 180, Arc2D.OPEN);
        maze.draw(bend);

        //3
        currentLine.setLine(731, 472, 615, 472);
        maze.draw(currentLine);
        bend.setArc(602, 472, 22, 24, 80, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(615, 496, 734, 496);
        maze.draw(currentLine);
        bend.setArc(721, 473, 24, 23, 270, 200, Arc2D.OPEN);
        maze.draw(bend);

        //4
        currentLine.setLine(707, 547, 707, 582);
        maze.draw(currentLine);
        bend.setArc(600, 600, 23, 24, 80, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(692, 599, 614, 599);
        maze.draw(currentLine);
        bend.setArc(898, 600, 24, 24, 270, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(611, 625, 915, 625);
        maze.draw(currentLine);
        currentLine.setLine(907, 600, 764, 600);
        maze.draw(currentLine);
        bend.setArc(708, 535, 37, 22, 0, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(745, 583, 745, 548);
        maze.draw(currentLine);

        //dx dx
        currentLine.setLine(907, 472, 826, 472);
        maze.draw(currentLine);
        bend.setArc(897, 472, 24, 23, 270, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(812, 493, 812, 547);
        maze.draw(currentLine);
        currentLine.setLine(850, 549, 850, 511);
        maze.draw(currentLine);
        bend.setArc(813, 539, 37, 22, 180, 180, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(863, 496, 909, 496);
        maze.draw(currentLine);

        //contorno dx
        currentLine.setLine(551, 24, 976, 24);
        maze.draw(currentLine);
        currentLine.setLine(991, 36, 991, 201);
        maze.draw(currentLine);
        currentLine.setLine(972, 215, 836, 215);
        maze.draw(currentLine);
        bend.setArc(817, 215, 47, 30, 100, 80, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(813, 232, 813, 289);
        maze.draw(currentLine);
        currentLine.setLine(827, 303, 1012, 303);
        maze.draw(currentLine);
        currentLine.setLine(1012, 342, 833, 342);
        maze.draw(currentLine);
        bend.setArc(812, 343, 47, 30, 100, 80, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(810, 359, 810, 420);
        maze.draw(currentLine);
        currentLine.setLine(830, 431, 977, 431);
        maze.draw(currentLine);
        currentLine.setLine(988, 447, 988, 528);
        maze.draw(currentLine);
        currentLine.setLine(976, 537, 936, 537);
        maze.draw(currentLine);
        bend.setArc(921, 538, 24, 22, 80, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(976, 560, 936, 560);
        maze.draw(currentLine);
        currentLine.setLine(988, 571, 988, 648);
        maze.draw(currentLine);
        currentLine.setLine(55, 667, 983, 667);
        maze.draw(currentLine);

        //contorno sx continuazione
        currentLine.setLine(37, 569, 37, 649);
        maze.draw(currentLine);
        currentLine.setLine(57, 560, 100, 560);
        maze.draw(currentLine);
        bend.setArc(85, 537, 24, 23, 270, 200, Arc2D.OPEN);
        maze.draw(bend);
        currentLine.setLine(94, 536, 54, 536);
        maze.draw(currentLine);
        currentLine.setLine(37, 518, 37, 451);
        maze.draw(currentLine);
        currentLine.setLine(53, 536, 0, 536);
        maze.draw(currentLine);
        currentLine.setLine(61, 433, 187, 433);
        maze.draw(currentLine);
        currentLine.setLine(216, 421, 216, 360);
        maze.draw(currentLine);
        currentLine.setLine(198, 342, 11, 342);
        maze.draw(currentLine);
        currentLine.setLine(16, 305, 197, 305);
        maze.draw(currentLine);
        currentLine.setLine(215, 292, 215, 230);
        maze.draw(currentLine);

    }
}
