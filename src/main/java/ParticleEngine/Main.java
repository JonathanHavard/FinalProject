/*
* Coder: Jonathan Havard
* Date Sep 2024
* Description: Sngine for particles
* Notes
*/

//Well I've hit a wall and need help. I'm not going to use an extension, I'm just going to take a late grade if it's possible.
package ParticleEngine;

import processing.core.*;

public class Main extends PApplet{

    ParticleSpray particleSpray; //initiates Particle Spray
    Balls balls;

    public static void main(String[] args) {
        PApplet.main("ParticleEngine.Main");
    }

    public void settings(){
        //Changes the size of the screen
        size(1280, 720);
        particleSpray = new ParticleSpray(this); //instantiates particle spray
        balls = new Balls(this); //instantiates ball
    }
    public void setup(){
        balls.setup();
    }
    public void draw(){ //draws balls
        this.background(0);
        particleSpray.draw();
        balls.draw();
    }
    public void keyPressed(){
        balls.keyPressed();//calls the balls key pressed function
    }


}