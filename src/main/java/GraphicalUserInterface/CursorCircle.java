package GraphicalUserInterface;

import processing.core.PApplet;

public class CursorCircle extends Icon {//Make the program to draw icons also draw Cursor
    CursorCircle(float x_, float y_, float radius_, int c, PApplet main_){
        super(x_, y_, radius_, c, main_);
    }
        public void draw(){
            //draws an ellipse
            main.ellipse(x, y, size+10, size+10);
            main.fill(IconColor);

            }

            int selection = 0;
        void keyPressed(){
            boolean canSelect = true;//This is a boolean that allows you to move through a list one at a time
                //CODE IS TEMPORARY WILL CHANGE DEPENDING ON THE ARRAY LIS
            if(selection == 0 && canSelect == true){
                selection = 1;
                canSelect = false;
        }
            if(selection == 1 && canSelect == true){
                selection = 0;
                canSelect = false;
        }
        canSelect = true;
    }
}


