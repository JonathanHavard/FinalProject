package GraphicalUserInterface;
import processing.core.*;

public class IconTxt extends Ico {
    String text_;
    PImage logo;
    PApplet main;
    String title_;
    IconTxt(float x, float y, String text, String title, PApplet main) {
        super(x, y);
            text_ = text;
            title_ = title;
            
    }

    public void draw(PApplet main) {
        logo = main.loadImage(text_);
        main.image(logo, x, y);
        main.textSize(32);
        main.fill(255);
        main.text(title_, x+25, y+35);
        
        
    }

    float getX() {
        return x;
    }

    float getY() {
        return y;
    }
}