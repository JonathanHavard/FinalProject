package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class PhotoMenu {
    PApplet main;
    PImage photoMen;

    PhotoMenu(PApplet main_) {
        main = main_;
    }

    public void setup() {
    }

    public void keyPressed(char key) {
    }

    public void draw(PApplet main){
        main.background(0,0,0);
        photoMen = main.loadImage("ImageImport/pbg.png");
        main.image(photoMen, 490, 200);
    }
}
