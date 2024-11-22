package GraphicalUserInterface;
import processing.core.*;

public class Icon extends Ico {
    String text_;
    PImage logo;
    PApplet main;
    Icon(float x, float y, String text, PApplet main) {
        super(x, y);
            text_ = text;
            
    }

    public void draw(PApplet main) {
        logo = main.loadImage(text_);
        main.image(logo, x, y);
        //Basic Icon that loads an image No text version
    }

    float getX() {
        return x;
    }

    float getY() {
        return y;
    }
}