package GraphicalUserInterface;


import processing.core.*;

public class Icon {
    PApplet main; //the main class -- provides all the functionality of processing

    float x; //location of Icon
    float y; //location of Icon
    float size; //Icon size
    static int IconColor;
    Icon(float x_, float y_, float size_, int c, PApplet main_){
        x = x_;
        y = y_;
        size = size_;
        IconColor = c;
    
        main = main_;
        size = size_;
    }
}
