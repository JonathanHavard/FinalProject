package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class CalendarMenu {
    //Beginnings of a calendar menu
    PApplet main;
    PImage calendarMen;
    PImage metalMen;
    PImage glassMen;
    String theme;

    CalendarMenu(PApplet main_) {
        main = main_;
    }

    public void setup() {
        // musicMen = main.loadImage("ImageImport/mbg.png");
    }

    public void keyPressed(char key) {
    }

    public void setTheme(String theme_){
        theme = theme_;
    }

    public void draw(PApplet main){
        main.background(0,0,0);
        if(theme == "main"){
            calendarMen = main.loadImage("ImageImport/cbg.png");
            main.image(calendarMen, 490, 200);
        }
        if(theme == "metal"){
            metalMen = main.loadImage("ImageImport/Metalic/cbg.png");
            main.image(metalMen, 490, 200);
        }
        if(theme == "glass"){
            calendarMen = main.loadImage("ImageImport/Glass/cbg.png");
            main.image(calendarMen, 490, 200);
            }
    }
}
