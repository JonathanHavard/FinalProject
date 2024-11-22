package GraphicalUserInterface;
import javafx.scene.control.Menu;
import processing.core.PApplet;
import processing.core.PImage;

public class PhotoMenu {
    PApplet main;
    PImage photoMen;
    PImage metalMen;
    PImage glassMen;
    String theme;

    PhotoMenu(PApplet main_) {
        main = main_;
    }

    public void setup() {
    }

    public void keyPressed(char key) {
    }

    public void setTheme(String theme_){
        theme = theme_;
    }

    public void draw(PApplet main){
        if(theme == "main"){
            photoMen = main.loadImage("ImageImport/pbg.png");
            main.image(photoMen, 490, 200);
            }
            if(theme == "metal"){
            metalMen = main.loadImage("ImageImport/Metalic/pbg.png");
            main.image(metalMen, 490, 200);
        }
        if(theme == "glass"){
            photoMen = main.loadImage("ImageImport/Glass/pbg.png");
            main.image(photoMen, 490, 200);
            }
    }
}
