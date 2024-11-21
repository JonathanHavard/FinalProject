package GraphicalUserInterface;
import processing.core.*;

public class CircleIcon extends Icon {
    String text_;
    PImage logo;
    PApplet main;
    CircleIcon(float x, float y, String text, PApplet main) {
        super(x, y);
            text_ = text;
            
    }

    public void draw(PApplet main) {
        logo = main.loadImage(text_);
        main.image(logo, x, y);
        //draws an ellipse
        
        
    }

    float getX() {
        return x;
    }

    float getY() {
        return y;
    }
}