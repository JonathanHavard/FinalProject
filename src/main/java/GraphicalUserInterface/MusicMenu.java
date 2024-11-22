package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class MusicMenu {
    Icon icon;
    Icon icon2;
    Cursor cursor;
    PApplet main;
    PImage musicMen;

    MusicMenu(PApplet main_) {
        main = main_;
    }

    public void setup() {
    }

    public void keyPressed(char keyP) {
    }

    public void draw(PApplet main){
        main.background(0,0,0);
        musicMen = main.loadImage("ImageImport/mbg.png");
        main.image(musicMen, 490, 200);
    }
}
