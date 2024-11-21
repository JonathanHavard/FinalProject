package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class SettingsMenu {
    PApplet main;
    PImage musicMen;

    SettingsMenu(PApplet main_) {
        main = main_;
    }

    public void setup() {
    }

    public void keyPressed(char key) {
    }

    public void draw(PApplet main){
        main.background(0,0,0);
        main.text("Settings and stuff", 600, 600);
    }
}
