package GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Incrocio {

    private Rectangle g0, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12, g13, g14, g15, g16, g17, g18, g19;
    private Rectangle g20, g21, g22, g23, g24, g25, g26, g27, g28, g29, g30, g31, g32, g33, g34, g35, g36, g37, g38, g39;
    private Rectangle g40, g41, g42, g43, g44, g45, g46, g47;

    private Rectangle[] cross;

    public Incrocio() {

        int dim = 52;
        //1
        g0 = new Rectangle(50, 24, dim, dim);
        g1 = new Rectangle(50, 104, dim, dim);
        g2 = new Rectangle(50, 157, dim, dim);
        g3 = new Rectangle(50, 432, dim, dim);
        g4 = new Rectangle(50, 487, dim, dim);
        g5 = new Rectangle(50, 560, dim, dim);
        g6 = new Rectangle(50, 616, dim, dim);

        //2
        g7 = new Rectangle(220, 25, dim + 10, dim + 10);
        g8 = new Rectangle(220, 100, dim + 10, dim + 10);
        g9 = new Rectangle(221, 170, dim + 6, dim + 6);
        g10 = new Rectangle(220, 290, dim + 10, dim + 10);
        g11 = new Rectangle(220, 421, dim + 6, dim + 6);
        g12 = new Rectangle(216, 542, dim + 6, dim + 6);

        //3
        g13 = new Rectangle(328, 162, dim, dim);
        g14 = new Rectangle(328, 243, dim, dim);
        g15 = new Rectangle(328, 299, dim, dim);
        g16 = new Rectangle(328, 418, dim, dim);
        g17 = new Rectangle(328, 545, dim, dim);

        //4
        g18 = new Rectangle(432, 27, dim, dim);
        g19 = new Rectangle(432, 98, dim, dim);
        g20 = new Rectangle(440, 179, dim, dim);
        g21 = new Rectangle(440, 437, dim - 2, dim - 2);
        g22 = new Rectangle(440, 488, dim - 2, dim - 2);
        g23 = new Rectangle(440, 562, dim, dim);

        //5
        g24 = new Rectangle(546, 27, dim, dim);
        g25 = new Rectangle(546, 98, dim, dim);
        g26 = new Rectangle(546, 179, dim, dim);
        g27 = new Rectangle(546, 437, dim - 2, dim - 2);
        g28 = new Rectangle(546, 488, dim - 2, dim - 2);
        g29 = new Rectangle(546, 562, dim, dim);

        //6
        g30 = new Rectangle(652, 162, dim, dim);
        g31 = new Rectangle(652, 243, dim, dim);
        g32 = new Rectangle(652, 299, dim, dim);
        g33 = new Rectangle(652, 418, dim, dim);
        g34 = new Rectangle(652, 545, dim, dim);

        //7
        g35 = new Rectangle(747, 25, dim + 10, dim + 10);
        g36 = new Rectangle(747, 100, dim + 10, dim + 10);
        g37 = new Rectangle(747, 170, dim + 6, dim + 6);
        g38 = new Rectangle(747, 290, dim + 10, dim + 10);
        g39 = new Rectangle(747, 421, dim + 6, dim + 6);
        g40 = new Rectangle(748, 542, dim + 6, dim + 6);

        //8
        g41 = new Rectangle(929, 24, dim, dim);
        g42 = new Rectangle(929, 104, dim, dim);
        g43 = new Rectangle(929, 157, dim, dim);
        g44 = new Rectangle(929, 432, dim, dim);
        g45 = new Rectangle(929, 487, dim, dim);
        g46 = new Rectangle(929, 560, dim, dim);
        g47 = new Rectangle(929, 616, dim, dim);

        cross = new Rectangle[]{
            g0, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12, g13, g14, g15, g16, g17, g18, g19,
            g20, g21, g22, g23, g24, g25, g26, g27, g28, g29, g30, g31, g32, g33, g34, g35, g36, g37, g38, g39,
            g40, g41, g42, g43, g44, g45, g46, g47
        };
    }

    public void drawCross(Graphics2D cross) {

        cross.setPaint(Color.white);

        cross.draw(g0);
        cross.draw(g1);
        cross.draw(g2);
        cross.draw(g3);
        cross.draw(g4);
        cross.draw(g5);
        cross.draw(g6);
        cross.draw(g7);
        cross.draw(g8);
        cross.draw(g9);
        cross.draw(g10);
        cross.draw(g11);
        cross.draw(g12);
        cross.draw(g13);
        cross.draw(g14);
        cross.draw(g15);
        cross.draw(g16);
        cross.draw(g17);
        cross.draw(g18);
        cross.draw(g19);
        cross.draw(g20);
        cross.draw(g21);
        cross.draw(g22);
        cross.draw(g23);
        cross.draw(g24);
        cross.draw(g25);
        cross.draw(g26);
        cross.draw(g27);
        cross.draw(g28);
        cross.draw(g29);
        cross.draw(g30);
        cross.draw(g31);
        cross.draw(g32);
        cross.draw(g33);
        cross.draw(g34);
        cross.draw(g35);
        cross.draw(g36);
        cross.draw(g37);
        cross.draw(g38);
        cross.draw(g39);
        cross.draw(g40);
        cross.draw(g41);
        cross.draw(g42);
        cross.draw(g43);
        cross.draw(g44);
        cross.draw(g45);
        cross.draw(g46);
        cross.draw(g47);

    }

    public Rectangle[] getCross() {
        return cross;
    }

}
