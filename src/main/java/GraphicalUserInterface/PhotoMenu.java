package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class PhotoMenu {
    PApplet main;
    PImage musicMen;

    PhotoMenu(PApplet main_) {
        main = main_;
    }

    public void setup() {
    }

    public void keyPressed(char key) {
    }

    public void draw(PApplet main){
        main.background(0,0,0);
        main.text("fotos", 600, 600);
    }
}
