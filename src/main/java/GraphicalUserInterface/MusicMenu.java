package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class MusicMenu {
    CircleIcon icon;
    CircleIcon icon2;
    CursorCircle cursor;
    PApplet main;
    PImage musicMen;

    MusicMenu(PApplet main_) {
        main = main_;
    }

    public void setup() {
        musicMen = main.loadImage("ImageImport/mbg.png");
    }

    public void keyPressed(char keyP) {
    }

    public void draw(PApplet main){
        main.background(0,0,0);
        musicMen = main.loadImage("ImageImport/mbg.png");
        main.image(musicMen, 490, 200);
    }
}
