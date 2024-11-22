package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class SettingsMenu {
    PApplet main;
    PImage settingsMen;

    SettingsMenu(PApplet main_) {
        main = main_;
        icon = new IconTxt(620, 330, "ImageImport/sqicoblck.png", "sky", 210, main);
    }
    IconTxt icon;

    public void setup() {
    }

    public void keyPressed(char key) {
    }

    public void draw(PApplet main){
        main.background(0,0,0);
        settingsMen = main.loadImage("ImageImport/sbg.png");
        main.image(settingsMen, 490, 200);
        icon.draw(main);
    }
}
