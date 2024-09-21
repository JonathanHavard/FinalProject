/*
* Coder: Jonathan Havard
* Date Sep 2024
* Description: Sngine for particles
* Notes
*/

package ParticleEngine;

import processing.core.*;

public class Main extends PApplet{
    Balls balls;

    public static void main(String[] args) {
        PApplet.main("ParticleEngine.Main");
    }

    public void settings(){
        //Changes the size of the screen
        size(1280, 720);
        balls = new Balls(this); //instantiates ball
    }
    public void setup(){
        balls.setup();
        balls.init();
    }
    public void draw(){ //draws balls
        this.background(0);
        balls.draw();
        balls.draw();
    }
    public void keyPressed(){
        balls.keyPressed(key);//calls the balls key pressed function
    }


}