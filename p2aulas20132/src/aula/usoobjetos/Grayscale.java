package aula.usoobjetos;

import java.awt.Color;
import princeton.Picture;
import princeton.Luminance;
public class Grayscale {

    public static void main(String[] args) {
        Picture pic = new Picture(args[0]);
        int width  = pic.width();
        int height = pic.height();

        // convert to grayscale
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = pic.get(x, y);
                Color gray = Luminance.toGray(color);
                pic.set(x, y, gray);
            }
        }
        pic.show();
    }

}
