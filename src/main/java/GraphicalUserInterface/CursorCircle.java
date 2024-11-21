package GraphicalUserInterface;
import processing.core.PApplet;
import processing.core.PImage;

public class CursorCircle extends Icon { // Make the program to draw icons also draw Cursor
    int selection;
    PImage circ;
    CursorCircle(float x_, float y_) {
        super(x_, y_);
        selection = 0;
    }

    public void draw(PApplet main) {
        circ = main.loadImage("imageImport/selection.png");
        main.image(circ, x,y);

    }

            
    void keyPressed() {
        // This is a boolean that allows you to move through a list one at a time
        boolean canSelect = true; 

        // CODE IS TEMPORARY WILL CHANGE DEPENDING ON THE 
        // if (selection == 0 && canSelect == true) {
        //     selection = 1;
        //     canSelect = false;
        // }

        // if (selection == 1 && canSelect == true) {
        //     selection = 0;
        //     canSelect = false;
        // }

        canSelect = true;
    }
}


