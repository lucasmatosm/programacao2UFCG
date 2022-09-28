package princeton;
/*************************************************************************

 *  Compilation:  javac Graffiti.java
 *  Execution:    java Graffiti
 *  Dependencies: Draw.java DrawListener.java
 *
 *
 *  Known bugs
 *  -----------
 *    - if user drags the mouse in order to move the location of the
 *      window, this is recorded as a drawing event
 *
 *************************************************************************/

import java.awt.Color;

public class Graffiti implements DrawListener {

    private Draw draw = new Draw();   // drawing object
    private int N = 0;                // number of circles drawn

    public Graffiti() {
        draw.addListener(this);
        draw.clear(Color.LIGHT_GRAY);
        draw.show();
    }

    // we don't need these here, but they're part of the interface
    public void mousePressed(double x, double y)  { }
    public void mouseReleased(double x, double y) { }
    public void keyTyped(char c)                  { }

    // draw a spot as the user drags the mouse
    public void mouseDragged(double x, double y) {
        draw.setPenColor(Color.getHSBColor(1.0f * N / 256.0f, 1.0f, 1.0f));
        draw.filledCircle(x, y, 0.02);
        N++;
        if (N == 256) N = 0;
    }

    // test client
    public static void main(String[] args) {
        new Graffiti();
    }
 
   
}
