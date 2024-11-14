package GraphicalUserInterface;

import processing.core.PApplet;

public class CursorCircle extends Icon { // Make the program to draw icons also draw Cursor
    int selection;
    CursorCircle(float x_, float y_, float radius_, int c) {
        super(x_, y_, radius_, c);
        selection = 0;
    }

    public void draw(PApplet main) {
        //draws an ellipse
        main.ellipse(x, y, size+10, size+10);
        main.fill(iconColor);
    }

            
    void keyPressed() {
        // This is a boolean that allows you to move through a list one at a time
        boolean canSelect = true; 

        // CODE IS TEMPORARY WILL CHANGE DEPENDING ON THE ARRAY LIS
        if (selection == 0 && canSelect == true) {
            selection = 1;
            canSelect = false;
        }

        if (selection == 1 && canSelect == true) {
            selection = 0;
            canSelect = false;
        }

        canSelect = true;
    }
}


