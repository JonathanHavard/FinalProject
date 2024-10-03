/*
* Coder: Jonathan Havard
* Date Sep 2024
* Description: Sngine for particles
* Notes
*/

package ParticleEngine;

import java.util.ArrayList;

import processing.core.*;

public class Main extends PApplet{
    Particles particles;

    public static void main(String[] args) {
        PApplet.main("ParticleEngine.Main");
    }

    public void settings(){
        //Changes the size of the screen
        size(1000,700);
        particles = new Particles(this); //instantiates particle
    }
    public void setup(){
        particles.setup();
        particles.init();
    }
    public void draw(){ //draws particles
        this.background(0);
        particles.draw();
    }
    public void keyPressed(){
        particles.keyPressed();//calls the particles key pressed function
    }
    public void mousePressed(){
        // particles.mousePressed();
    }
}