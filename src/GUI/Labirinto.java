package GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.util.Random;

public class Labirinto {

    private Line2D.Double currentLine0, currentLine1, currentLine2;
    private Line2D.Double currentLine3, currentLine4, currentLine5;
    private Line2D.Double currentLine6, currentLine7, currentLine8;
    private Line2D.Double currentLine9, currentLine10, currentLine11;
    private Line2D.Double currentLine12, currentLine13, currentLine14;
    private Line2D.Double currentLine15, currentLine16, currentLine17;
    private Line2D.Double currentLine18, currentLine19, currentLine20;
    private Line2D.Double currentLine21, currentLine22, currentLine23;
    private Line2D.Double currentLine24, currentLine25, currentLine26;
    private Line2D.Double currentLine27, currentLine28, currentLine29;
    private Line2D.Double currentLine30, currentLine31, currentLine32;
    private Line2D.Double currentLine33, currentLine34, currentLine35;
    private Line2D.Double currentLine36, currentLine37, currentLine38;
    private Line2D.Double currentLine39, currentLine40, currentLine41;
    private Line2D.Double currentLine42, currentLine43, currentLine44;
    private Line2D.Double currentLine45, currentLine46, currentLine47;
    private Line2D.Double currentLine48, currentLine49, currentLine50;
    private Line2D.Double currentLine51, currentLine52, currentLine53;
    private Line2D.Double currentLine54, currentLine55, currentLine56;
    private Line2D.Double currentLine57, currentLine58, currentLine59;
    private Line2D.Double currentLine60, currentLine61, currentLine62;
    private Line2D.Double currentLine63, currentLine64, currentLine65;
    private Line2D.Double currentLine66, currentLine67, currentLine68;
    private Line2D.Double currentLine69, currentLine70, currentLine71;
    private Line2D.Double currentLine72, currentLine73, currentLine74;
    private Line2D.Double currentLine75, currentLine76, currentLine77;
    private Line2D.Double currentLine78, currentLine79, currentLine80;
    private Line2D.Double currentLine81, currentLine82, currentLine83;
    private Line2D.Double currentLine84, currentLine85, currentLine86;
    private Line2D.Double currentLine87, currentLine88, currentLine89;
    private Line2D.Double currentLine90, currentLine91, currentLine92;
    private Line2D.Double currentLine93, currentLine94, currentLine95;
    private Line2D.Double currentLine96, currentLine97, currentLine98;
    private Line2D.Double currentLine99, currentLine100, currentLine101, currentLine102;

    private Line2D.Double[] lines;

    private Arc2D.Double bend0, bend1, bend2, bend3, bend4, bend5;
    private Arc2D.Double bend6, bend7, bend8, bend9, bend10;
    private Arc2D.Double bend11, bend12, bend13, bend14, bend15;
    private Arc2D.Double bend16, bend17, bend18, bend19, bend20;
    private Arc2D.Double bend21, bend22, bend23, bend24, bend25;
    private Arc2D.Double bend26, bend27, bend28, bend29, bend30;
    private Arc2D.Double bend31, bend32, bend33, bend34, bend35;
    private Arc2D.Double bend36, bend37, bend38, bend39, bend40;
    private Arc2D.Double bend41, bend42, bend43, bend44, bend45;
    private Arc2D.Double bend46, bend47, bend48, bend49, bend50;
    private Arc2D.Double bend51, bend52, bend53, bend54, bend55;
    private Arc2D.Double bend56, bend57, bend58, bend59, bend60;
    private Arc2D.Double bend61, bend62, bend63, bend64;

    private Arc2D.Double[] arches;

    public Labirinto() {

        //contorno sx      //(x, y, larghezza,altezza, inizio, angolo, tipo);
        currentLine0 = new Line2D.Double(56, 25, 482, 25);
        currentLine1 = new Line2D.Double(37, 35, 37, 204);
        currentLine2 = new Line2D.Double(56, 214, 189, 214);

        //contorno centro
        currentLine3 = new Line2D.Double(493, 35, 493, 97);
        currentLine4 = new Line2D.Double(534, 35, 534, 97);

        //prima riga primo a sx  
        currentLine5 = new Line2D.Double(116, 65, 210, 65);
        currentLine6 = new Line2D.Double(116, 106, 210, 106);

        //prima riga secondo a sx  
        currentLine7 = new Line2D.Double(294, 65, 415, 65);
        currentLine8 = new Line2D.Double(294, 106, 413, 106);

        //prima riga terzo a sx  
        currentLine9 = new Line2D.Double(613, 65, 734, 65);
        currentLine10 = new Line2D.Double(614, 106, 732, 106);

        //prima riga quarto a sx  
        currentLine11 = new Line2D.Double(822, 65, 913, 65);
        currentLine12 = new Line2D.Double(822, 106, 913, 106);

        //seconda riga quello a sx                                               
        currentLine13 = new Line2D.Double(114, 150, 201, 150);
        currentLine14 = new Line2D.Double(114, 173, 201, 173);

        //seconda riga quello a dx
        currentLine15 = new Line2D.Double(824, 150, 912, 150);
        currentLine16 = new Line2D.Double(824, 173, 912, 173);

        //cemtrale muro
        //1 T
        currentLine17 = new Line2D.Double(399, 149, 628, 149);
        currentLine18 = new Line2D.Double(399, 174, 481, 174);
        currentLine19 = new Line2D.Double(494, 183, 494, 230);
        currentLine20 = new Line2D.Double(533, 183, 533, 230);
        currentLine21 = new Line2D.Double(546, 175, 626, 175);

        //2 T
        currentLine22 = new Line2D.Double(399, 409, 628, 409);
        currentLine23 = new Line2D.Double(399, 433, 481, 433);
        currentLine24 = new Line2D.Double(494, 445, 494, 488);
        currentLine25 = new Line2D.Double(533, 487, 533, 444);
        currentLine26 = new Line2D.Double(548, 433, 626, 433);

        //3 T
        currentLine27 = new Line2D.Double(399, 537, 628, 537);
        currentLine28 = new Line2D.Double(399, 561, 481, 561);
        currentLine29 = new Line2D.Double(494, 575, 494, 615);
        currentLine30 = new Line2D.Double(533, 617, 533, 576);
        currentLine31 = new Line2D.Double(548, 562, 626, 562);

        //rettangolo centrale
        currentLine32 = new Line2D.Double(461, 286, 461, 280);
        currentLine33 = new Line2D.Double(461, 278, 390, 278);
        currentLine34 = new Line2D.Double(389, 279, 389, 365);
        currentLine35 = new Line2D.Double(389, 367, 637, 367);
        currentLine36 = new Line2D.Double(639, 367, 639, 279);
        currentLine37 = new Line2D.Double(637, 278, 567, 278);
        currentLine38 = new Line2D.Double(566, 278, 566, 289);
        currentLine39 = new Line2D.Double(566, 289, 623, 289);
        currentLine40 = new Line2D.Double(623, 289, 623, 355);
        currentLine41 = new Line2D.Double(623, 355, 402, 355);
        currentLine42 = new Line2D.Double(404, 355, 404, 290);
        currentLine43 = new Line2D.Double(402, 290, 460, 290);

        //colonna sx
        //1
        currentLine44 = new Line2D.Double(283, 157, 283, 293);
        currentLine45 = new Line2D.Double(320, 291, 320, 250);
        currentLine46 = new Line2D.Double(335, 238, 414, 238);
        currentLine47 = new Line2D.Double(414, 213, 332, 213);
        currentLine48 = new Line2D.Double(320, 196, 320, 159);

        //2
        currentLine49 = new Line2D.Double(281, 351, 281, 421);
        currentLine50 = new Line2D.Double(320, 420, 320, 350);

        //3
        currentLine51 = new Line2D.Double(417, 472, 295, 472);
        currentLine52 = new Line2D.Double(295, 496, 417, 496);

        //4
        currentLine53 = new Line2D.Double(267, 600, 120, 600);
        currentLine54 = new Line2D.Double(120, 625, 416, 625);
        currentLine55 = new Line2D.Double(412, 601, 334, 601);
        currentLine56 = new Line2D.Double(320, 584, 320, 547);
        currentLine57 = new Line2D.Double(282, 584, 282, 547);

        //sx sx
        currentLine58 = new Line2D.Double(201, 472, 120, 472);
        currentLine59 = new Line2D.Double(120, 496, 163, 496);
        currentLine60 = new Line2D.Double(177, 512, 177, 550);
        currentLine61 = new Line2D.Double(215, 549, 215, 491);

        //colonna dx
        //1
        currentLine62 = new Line2D.Double(708, 157, 708, 199);
        currentLine63 = new Line2D.Double(690, 213, 617, 213);
        currentLine64 = new Line2D.Double(707, 252, 707, 288);
        currentLine65 = new Line2D.Double(619, 238, 697, 238);
        currentLine66 = new Line2D.Double(745, 290, 745, 158);

        //2
        currentLine67 = new Line2D.Double(707, 351, 707, 421);
        currentLine68 = new Line2D.Double(746, 420, 746, 350);

        //3
        currentLine69 = new Line2D.Double(731, 472, 615, 472);
        currentLine70 = new Line2D.Double(615, 496, 734, 496);

        //4 
        currentLine71 = new Line2D.Double(707, 547, 707, 582);
        currentLine72 = new Line2D.Double(692, 599, 614, 599);
        currentLine73 = new Line2D.Double(611, 625, 915, 625);
        currentLine74 = new Line2D.Double(907, 600, 764, 600);
        currentLine75 = new Line2D.Double(745, 583, 745, 548);

        //dx dx
        currentLine76 = new Line2D.Double(907, 472, 826, 472);
        currentLine77 = new Line2D.Double(812, 493, 812, 547);
        currentLine78 = new Line2D.Double(850, 549, 850, 511);
        currentLine79 = new Line2D.Double(863, 496, 909, 496);

        //contorno dx
        currentLine80 = new Line2D.Double(551, 24, 976, 24);
        currentLine81 = new Line2D.Double(991, 36, 991, 201);
        currentLine82 = new Line2D.Double(972, 215, 836, 215);
        currentLine83 = new Line2D.Double(813, 232, 813, 289);
        currentLine84 = new Line2D.Double(827, 303, 1012, 303);
        currentLine85 = new Line2D.Double(1012, 342, 833, 342);
        currentLine86 = new Line2D.Double(810, 359, 810, 420);
        currentLine87 = new Line2D.Double(830, 431, 977, 431);
        currentLine88 = new Line2D.Double(988, 447, 988, 528);
        currentLine89 = new Line2D.Double(976, 537, 936, 537);
        currentLine90 = new Line2D.Double(976, 560, 936, 560);
        currentLine91 = new Line2D.Double(988, 571, 988, 648);
        currentLine92 = new Line2D.Double(55, 667, 983, 667);

        //contorno sx continuazione
        currentLine93 = new Line2D.Double(37, 569, 37, 649);
        currentLine94 = new Line2D.Double(57, 560, 100, 560);
        currentLine95 = new Line2D.Double(94, 536, 54, 536);
        currentLine96 = new Line2D.Double(37, 518, 37, 451);
        currentLine97 = new Line2D.Double(53, 536, 0, 536);
        currentLine98 = new Line2D.Double(61, 433, 187, 433);
        currentLine99 = new Line2D.Double(216, 421, 216, 360);
        currentLine100 = new Line2D.Double(198, 342, 11, 342);
        currentLine101 = new Line2D.Double(16, 305, 197, 305);
        currentLine102 = new Line2D.Double(215, 292, 215, 230);

        lines = new Line2D.Double[]{
            currentLine0, currentLine1, currentLine2, currentLine3,
            currentLine4, currentLine5, currentLine6, currentLine7,
            currentLine8, currentLine9, currentLine10, currentLine11,
            currentLine12, currentLine13, currentLine14, currentLine15,
            currentLine16, currentLine17, currentLine18, currentLine19,
            currentLine20, currentLine21, currentLine22, currentLine23,
            currentLine24, currentLine25, currentLine26, currentLine27,
            currentLine28, currentLine29, currentLine30, currentLine31,
            currentLine32, currentLine33, currentLine34, currentLine35,
            currentLine36, currentLine37, currentLine38, currentLine39,
            currentLine40, currentLine41, currentLine42, currentLine43,
            currentLine44, currentLine45, currentLine46, currentLine47,
            currentLine48, currentLine49, currentLine50, currentLine51,
            currentLine52, currentLine53, currentLine54, currentLine55,
            currentLine56, currentLine57, currentLine58, currentLine59,
            currentLine60, currentLine61, currentLine62, currentLine63,
            currentLine64, currentLine65, currentLine66, currentLine67,
            currentLine68, currentLine69, currentLine70, currentLine71,
            currentLine72, currentLine73, currentLine74, currentLine75,
            currentLine76, currentLine77, currentLine78, currentLine79,
            currentLine80, currentLine81, currentLine82, currentLine83,
            currentLine84, currentLine85, currentLine86, currentLine87,
            currentLine88, currentLine89, currentLine90, currentLine91,
            currentLine92, currentLine93, currentLine94, currentLine95,
            currentLine96, currentLine97, currentLine98, currentLine99,
            currentLine100, currentLine101, currentLine102
        };

        //contorno sx
        bend0 = new Arc2D.Double(38, 24, 50, 30, 100, 80, Arc2D.OPEN);
        bend1 = new Arc2D.Double(36, 184, 50, 30, 200, 80, Arc2D.OPEN);

        //contorno centro
        bend2 = new Arc2D.Double(470, 26, 25, 25, 350, 100, Arc2D.OPEN);
        bend3 = new Arc2D.Double(495, 88, 38, 22, 180, 180, Arc2D.OPEN);
        bend4 = new Arc2D.Double(532, 25, 42, 30, 100, 80, Arc2D.OPEN);

        //prima riga primo a sx 
        bend5 = new Arc2D.Double(105, 60, 50, 50, 130, 110, Arc2D.OPEN);
        bend6 = new Arc2D.Double(168, 60, 50, 50, 300, 110, Arc2D.OPEN);

        //prima riga secondo a sx  
        bend7 = new Arc2D.Double(284, 60, 50, 50, 130, 110, Arc2D.OPEN);
        bend8 = new Arc2D.Double(376, 60, 50, 50, 300, 110, Arc2D.OPEN);

        //prima riga terzo a sx  
        bend9 = new Arc2D.Double(602, 60, 50, 50, 130, 110, Arc2D.OPEN);
        bend10 = new Arc2D.Double(695, 60, 50, 50, 300, 110, Arc2D.OPEN);

        //prima riga quarto a sx  
        bend11 = new Arc2D.Double(812, 60, 50, 50, 130, 110, Arc2D.OPEN);
        bend12 = new Arc2D.Double(874, 60, 50, 50, 300, 110, Arc2D.OPEN);

        //seconda riga quello a sx
        bend13 = new Arc2D.Double(105, 150, 22, 22, 80, 200, Arc2D.OPEN);
        bend14 = new Arc2D.Double(192, 150, 22, 22, 270, 180, Arc2D.OPEN);

        //seconda riga quello a dx
        bend15 = new Arc2D.Double(812, 150, 22, 22, 80, 200, Arc2D.OPEN);
        bend16 = new Arc2D.Double(902, 150, 22, 22, 270, 180, Arc2D.OPEN);

        //cemtrale muro
        //1 T
        bend17 = new Arc2D.Double(388, 149, 22, 24, 80, 200, Arc2D.OPEN);
        bend18 = new Arc2D.Double(469, 175, 25, 25, 350, 100, Arc2D.OPEN);
        bend19 = new Arc2D.Double(495, 217, 37, 22, 180, 180, Arc2D.OPEN);
        bend20 = new Arc2D.Double(532, 175, 35, 25, 100, 80, Arc2D.OPEN);
        bend21 = new Arc2D.Double(614, 150, 26, 24, 270, 200, Arc2D.OPEN);

        //2 T
        bend22 = new Arc2D.Double(388, 409, 22, 23, 80, 200, Arc2D.OPEN);
        bend23 = new Arc2D.Double(469, 434, 25, 25, 350, 100, Arc2D.OPEN);
        bend24 = new Arc2D.Double(495, 477, 37, 22, 180, 180, Arc2D.OPEN);
        bend25 = new Arc2D.Double(534, 433, 35, 25, 100, 80, Arc2D.OPEN);
        bend26 = new Arc2D.Double(616, 409, 22, 23, 270, 200, Arc2D.OPEN);

        //3 T
        bend27 = new Arc2D.Double(389, 537, 22, 23, 80, 200, Arc2D.OPEN);
        bend28 = new Arc2D.Double(469, 562, 25, 25, 350, 100, Arc2D.OPEN);
        bend29 = new Arc2D.Double(495, 605, 37, 22, 180, 180, Arc2D.OPEN);
        bend30 = new Arc2D.Double(532, 564, 35, 25, 100, 80, Arc2D.OPEN);
        bend31 = new Arc2D.Double(616, 537, 24, 23, 270, 200, Arc2D.OPEN);

        //colonna sx
        //1
        bend32 = new Arc2D.Double(283, 282, 37, 22, 180, 180, Arc2D.OPEN);
        bend33 = new Arc2D.Double(320, 236, 42, 30, 100, 80, Arc2D.OPEN);
        bend34 = new Arc2D.Double(404, 214, 22, 24, 270, 180, Arc2D.OPEN);
        bend35 = new Arc2D.Double(320, 184, 50, 30, 180, 70, Arc2D.OPEN);
        bend36 = new Arc2D.Double(282, 148, 37, 22, 0, 180, Arc2D.OPEN);

        //2
        bend37 = new Arc2D.Double(283, 410, 37, 22, 180, 180, Arc2D.OPEN);
        bend38 = new Arc2D.Double(283, 342, 37, 22, 0, 180, Arc2D.OPEN);

        //3
        bend39 = new Arc2D.Double(283, 472, 22, 24, 80, 200, Arc2D.OPEN);
        bend40 = new Arc2D.Double(404, 473, 24, 23, 270, 200, Arc2D.OPEN);

        //4
        bend41 = new Arc2D.Double(107, 601, 23, 24, 80, 200, Arc2D.OPEN);
        bend42 = new Arc2D.Double(404, 601, 24, 24, 270, 200, Arc2D.OPEN);
        bend43 = new Arc2D.Double(318, 571, 50, 30, 180, 70, Arc2D.OPEN);
        bend44 = new Arc2D.Double(282, 536, 37, 22, 0, 180, Arc2D.OPEN);

        //sx sx
        bend45 = new Arc2D.Double(107, 472, 22, 24, 80, 200, Arc2D.OPEN);
        bend46 = new Arc2D.Double(151, 497, 25, 25, 350, 100, Arc2D.OPEN);
        bend47 = new Arc2D.Double(178, 540, 37, 22, 180, 180, Arc2D.OPEN);
        bend48 = new Arc2D.Double(190, 475, 25, 30, 350, 120, Arc2D.OPEN);

        //colonna dx
        //1
        bend49 = new Arc2D.Double(708, 282, 37, 22, 180, 180, Arc2D.OPEN);
        bend50 = new Arc2D.Double(603, 213, 24, 25, 80, 200, Arc2D.OPEN);
        bend51 = new Arc2D.Double(708, 150, 37, 22, 0, 180, Arc2D.OPEN);

        //2
        bend52 = new Arc2D.Double(708, 342, 37, 22, 0, 180, Arc2D.OPEN);
        bend53 = new Arc2D.Double(708, 410, 37, 22, 180, 180, Arc2D.OPEN);

        //3
        bend54 = new Arc2D.Double(602, 472, 22, 24, 80, 200, Arc2D.OPEN);
        bend55 = new Arc2D.Double(721, 473, 24, 23, 270, 200, Arc2D.OPEN);

        //4 
        bend56 = new Arc2D.Double(600, 600, 23, 24, 80, 200, Arc2D.OPEN);
        bend57 = new Arc2D.Double(898, 600, 24, 24, 270, 200, Arc2D.OPEN);
        bend58 = new Arc2D.Double(708, 535, 37, 22, 0, 180, Arc2D.OPEN);

        //dx dx
        bend59 = new Arc2D.Double(897, 472, 24, 23, 270, 200, Arc2D.OPEN);
        bend60 = new Arc2D.Double(813, 539, 37, 22, 180, 180, Arc2D.OPEN);

        //contorno dx
        bend61 = new Arc2D.Double(817, 215, 47, 30, 100, 80, Arc2D.OPEN);
        bend62 = new Arc2D.Double(812, 343, 47, 30, 100, 80, Arc2D.OPEN);
        bend63 = new Arc2D.Double(921, 538, 24, 22, 80, 200, Arc2D.OPEN);

        //contorno sx continuazione
        bend64 = new Arc2D.Double(85, 537, 24, 23, 270, 200, Arc2D.OPEN);

        arches = new Arc2D.Double[]{
            bend0, bend1, bend2, bend3, bend4, bend5, bend6, bend7, bend8,
            bend9, bend10, bend11, bend12, bend13, bend14, bend15, bend16,
            bend17, bend18, bend19, bend20, bend21, bend22, bend23, bend24,
            bend25, bend26, bend27, bend28, bend29, bend30, bend31, bend32,
            bend33, bend34, bend35, bend36, bend37, bend38, bend39, bend40,
            bend41, bend42, bend43, bend44, bend45, bend46, bend47, bend48,
            bend49, bend50, bend51, bend52, bend53, bend54, bend55, bend56,
            bend57, bend58, bend59, bend60, bend61, bend62, bend63, bend64
        };

    }

    public void drawMaze(Graphics2D maze) {

        maze.setPaint(Color.blue);         // Set wall color to blue

        //contorno sx
        maze.draw(currentLine0);
        maze.draw(bend0);
        maze.draw(currentLine1);
        maze.draw(bend1);
        maze.draw(currentLine2);

        //contorno centro
        maze.draw(bend2);
        maze.draw(currentLine3);
        maze.draw(bend3);
        maze.draw(currentLine4);
        maze.draw(bend4);

        //contorno dx
        //prima riga primo a sx  
        maze.draw(currentLine5);
        maze.draw(currentLine6);
        maze.draw(bend5);
        maze.draw(bend6);

        //prima riga secondo a sx  
        maze.draw(currentLine7);
        maze.draw(currentLine8);
        maze.draw(bend7);
        maze.draw(bend8);

        //prima riga terzo a sx  
        maze.draw(currentLine9);
        maze.draw(currentLine10);
        maze.draw(bend9);
        maze.draw(bend10);

        //prima riga quarto a sx  
        maze.draw(currentLine11);
        maze.draw(currentLine12);
        maze.draw(bend11);
        maze.draw(bend12);

        //seconda riga quello a sx
        maze.draw(currentLine13);
        maze.draw(currentLine14);
        maze.draw(bend13);
        maze.draw(bend14);

        //seconda riga quello a dx
        maze.draw(currentLine15);
        maze.draw(currentLine16);
        maze.draw(bend15);
        maze.draw(bend16);

        //cemtrale muro
        //1 T
        maze.draw(currentLine17);
        maze.draw(bend17);
        maze.draw(currentLine18);
        maze.draw(bend18);
        maze.draw(currentLine19);
        maze.draw(bend19);
        maze.draw(currentLine20);
        maze.draw(bend20);
        maze.draw(currentLine21);
        maze.draw(bend21);

        //2 T 
        maze.draw(currentLine22);
        maze.draw(bend22);
        maze.draw(currentLine23);
        maze.draw(bend23);
        maze.draw(currentLine24);
        maze.draw(bend24);
        maze.draw(currentLine25);
        maze.draw(bend25);
        maze.draw(currentLine26);
        maze.draw(bend26);

        //3 T
        maze.draw(currentLine27);
        maze.draw(bend27);
        maze.draw(currentLine28);
        maze.draw(bend28);
        maze.draw(currentLine29);
        maze.draw(bend29);
        maze.draw(currentLine30);
        maze.draw(bend30);
        maze.draw(currentLine31);
        maze.draw(bend31);

        //rettangolo centrale
        maze.draw(currentLine32);
        maze.draw(currentLine33);
        maze.draw(currentLine34);
        maze.draw(currentLine35);
        maze.draw(currentLine36);
        maze.draw(currentLine37);
        maze.draw(currentLine38);
        maze.draw(currentLine39);
        maze.draw(currentLine40);
        maze.draw(currentLine41);
        maze.draw(currentLine42);
        maze.draw(currentLine43);

        //colonna sx
        //1
        maze.draw(currentLine44);
        maze.draw(bend32);
        maze.draw(currentLine45);
        maze.draw(bend33);
        maze.draw(currentLine46);
        maze.draw(bend34);
        maze.draw(currentLine47);
        maze.draw(bend35);
        maze.draw(currentLine48);
        maze.draw(bend36);

        //2
        maze.draw(currentLine49);
        maze.draw(bend37);
        maze.draw(currentLine50);
        maze.draw(bend38);

        //3
        maze.draw(currentLine51);
        maze.draw(bend39);
        maze.draw(currentLine52);
        maze.draw(bend40);

        //4
        maze.draw(currentLine53);
        maze.draw(bend41);
        maze.draw(currentLine54);
        maze.draw(bend42);
        maze.draw(currentLine55);
        maze.draw(bend43);
        maze.draw(currentLine56);
        maze.draw(bend44);
        maze.draw(currentLine57);

        //sx sx
        maze.draw(currentLine58);
        maze.draw(bend45);
        maze.draw(currentLine59);
        maze.draw(bend46);
        maze.draw(currentLine60);
        maze.draw(bend47);
        maze.draw(currentLine61);
        maze.draw(bend48);

        //colonna dx
        //1
        maze.draw(currentLine62);
        maze.draw(bend49);
        maze.draw(currentLine63);
        maze.draw(bend50);
        maze.draw(currentLine64);
        maze.draw(currentLine65);
        maze.draw(bend51);
        maze.draw(currentLine66);

        //2
        maze.draw(currentLine67);
        maze.draw(bend52);
        maze.draw(currentLine68);
        maze.draw(bend53);

        //3
        maze.draw(currentLine69);
        maze.draw(bend54);
        maze.draw(currentLine70);
        maze.draw(bend55);

        //4
        maze.draw(currentLine71);
        maze.draw(bend56);
        maze.draw(currentLine72);
        maze.draw(bend57);
        maze.draw(currentLine73);
        maze.draw(currentLine74);
        maze.draw(bend58);
        maze.draw(currentLine75);

        //dx dx
        maze.draw(currentLine76);
        maze.draw(bend59);
        maze.draw(currentLine77);
        maze.draw(currentLine78);
        maze.draw(bend60);
        maze.draw(currentLine79);

        //contorno dx
        maze.draw(currentLine80);
        maze.draw(currentLine81);
        maze.draw(bend61);
        maze.draw(currentLine82);
        maze.draw(currentLine83);
        maze.draw(currentLine84);
        maze.draw(bend62);
        maze.draw(currentLine85);
        maze.draw(currentLine86);
        maze.draw(currentLine87);
        maze.draw(currentLine88);
        maze.draw(bend63);
        maze.draw(currentLine89);
        maze.draw(currentLine90);
        maze.draw(currentLine91);
        maze.draw(currentLine92);

        //contorno sx continuazione
        maze.draw(currentLine93);
        maze.draw(currentLine94);
        maze.draw(bend64);
        maze.draw(currentLine95);
        maze.draw(currentLine96);
        maze.draw(currentLine97);
        maze.draw(currentLine98);
        maze.draw(currentLine99);
        maze.draw(currentLine100);
        maze.draw(currentLine101);
        maze.draw(currentLine102);
    }

    public Line2D.Double[] getLines() {
        return lines;
    }

    public Arc2D.Double[] getArches() {
        return arches;
    }
}
