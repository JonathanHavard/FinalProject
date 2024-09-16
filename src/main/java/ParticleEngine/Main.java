/*
* Coder: Jonathan Havard
* Date Sep 2024
* Description: Sngine for particles
*
*/

package ParticleEngine;

import processing.core.*;
import java.util.ArrayList;

public class Main extends PApplet{

    Balls balls;

    public static void main(String[] args) {
        PApplet.main("ParticleEngine.Main");
    }

    public void settings(){
        //Changes the size of the screen
        size(1280, 720);
        balls = new Balls(this);
    }
    public void setup(){
        balls.setup();
    }
    public void draw(){
        balls.draw();
    }
    public void keyPressed(){
        balls.keyPressed();
    }


}