package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class Cursor extends Ico{ 
    int selection;
    PImage circ;
    Cursor(float x_, float y_) {
        super(x_, y_);
        selection = 0;
    }

    public void draw(PApplet main) {
        circ = main.loadImage("imageImport/selection.png");
        main.image(circ, x,y);

    } 
}


