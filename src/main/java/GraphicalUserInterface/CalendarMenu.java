package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class CalendarMenu {
    //Beginnings of a calendar menu
    Icon icon;
    Icon icon2;
    Cursor cursor;
    PApplet main;
    PImage calendarMen;

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
        calendarMen = main.loadImage("ImageImport/cbg.png");
        main.image(calendarMen, 490, 200);
        // main.image(musicMen, 650, 250);
    }
}
