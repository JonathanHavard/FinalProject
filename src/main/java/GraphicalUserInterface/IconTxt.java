package GraphicalUserInterface;
import processing.core.*;
import processing.core.PFont;

public class IconTxt extends Ico {
    String text_;
    PImage logo;
    PApplet main;
    String title_;
    int color_;
    PFont round;

    IconTxt(float x, float y, String text, String title, int color, PApplet main) {
        super(x, y);
            text_ = text;
            title_ = title;
            color_ = color;
            
    }

    public void draw(PApplet main) {
        logo = main.loadImage(text_);
        round = main.createFont("Font/Typo_Round.otf", 32);
        main.image(logo, x, y);
        main.textFont(round);
        main.textSize(28);
        main.fill(color_);
        main.text(title_, x+25, y+35);
        //Draws text near the center of the Icon
        
        
    }

    float getX() {
        return x;
    }

    float getY() {
        return y;
    }
}