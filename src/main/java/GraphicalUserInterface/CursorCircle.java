package GraphicalUserInterface;

import processing.core.PApplet;

public class CursorCircle extends Icon {//Make the program to draw icons also draw Cursor
    CursorCircle(float x_, float y_, float radius_, int c, PApplet main_){
        super(x_, y_, radius_, c, main_);
    }
        public void draw(){
            //draws an ellipse
            main.ellipse(x, y, size/2, size/2);
            main.fill(IconColor);
            }

            int selection = 0;{
                        //CODE IS TEMPORARY WILL CHANGE DEPENDING ON THE ARRAY LIS
            if(selection == 0 && main.keyPressed){
                selection = 1;
                System.out.println(selection);
            }
            if(selection == 1 && main.keyPressed){
                selection = 0;
                System.out.println(selection);
            }
        }
        void keyPressed(){}
}


