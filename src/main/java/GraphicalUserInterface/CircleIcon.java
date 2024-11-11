package GraphicalUserInterface;

import processing.core.*;

public class CircleIcon extends Icon{
    CircleIcon(float x_, float y_, float radius_, int c, PApplet main_){
        super(x_, y_, radius_, c, main_);
    }
public void draw(){
    //draws an ellipse
    main.ellipse(x, y, size, size);
    main.fill(IconColor);
    }
    float getX(){
        return x;
    }
    float getY(){
        return y;
    }
}