package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class SettingsMenu {
    PApplet main;
    PImage settingsMen;
    PImage metalMen;
    PImage glassMen;
    String theme;

    SettingsMenu(PApplet main_) {
        main = main_;
        icon = new IconTxt(620, 330, "ImageImport/sqicoblck.png", "sky", 210, main);
    }
    IconTxt icon;

    public void setup() {
    }

    public void keyPressed(char key) {
    }

    public void setTheme(String theme_){
        theme = theme_;
    }

    public void draw(PApplet main){
        main.background(0,0,0);
        if(theme == "main"){
        settingsMen = main.loadImage("ImageImport/sbg.png");
        main.image(settingsMen, 490, 200);
        icon.draw(main);
        }
        if(theme == "metal"){
        metalMen = main.loadImage("ImageImport/Metalic/sbg.png");
        main.image(metalMen, 490, 200);
        }
        if(theme == "glass"){
            settingsMen = main.loadImage("ImageImport/Glass/sbg.png");
            main.image(settingsMen, 490, 200);
            }
    }
}
