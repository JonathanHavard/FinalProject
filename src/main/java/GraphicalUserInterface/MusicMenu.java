package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class MusicMenu {
    Icon icon;
    Icon icon2;
    Cursor cursor;
    PApplet main;
    PImage musicMen;
    String theme;

    MusicMenu(PApplet main_) {
        main = main_;
    }

    public void setup() {
    }

    public void keyPressed(char keyP) {
    }

    public void setTheme(String theme_){
        theme = theme_;
    }

    public void draw(PApplet main){
        if(theme == "main"){
                musicMen = main.loadImage("ImageImport/mbg.png");
                main.image(musicMen, 490, 200);
            }
            if(theme == "metal"){
                musicMen = main.loadImage("ImageImport/Metalic/mbg.png");
                main.image(musicMen, 490, 200);
            }
            if(theme == "glass"){
                musicMen = main.loadImage("ImageImport/Glass/mbg.png");
                main.image(musicMen, 490, 200);
            }
    }
}
