package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class CalendarMenu {
    //Beginnings of a calendar menu
    Icon icon;
    Icon icon2;
    Cursor cursor;
    PApplet main;
    PImage musicMen;

    CalendarMenu(PApplet main_) {
        main = main_;
    }

    public void setup() {
        // musicMen = main.loadImage("ImageImport/mbg.png");
    }

    public void keyPressed(char key) {
    }

    public void draw(PApplet main){
        main.background(0,0,0);
        main.text("cadlenar", 600, 600);
        // main.image(musicMen, 650, 250);
    }
}
