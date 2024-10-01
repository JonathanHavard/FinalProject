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
        size(1000,1000);
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
    // // public void keyPressed(){
    // //     Particles.keyPressed(key);//calls the particles key pressed function
    // }
    public void mousePressed(){
        // particles.mousePressed();
    }
    ArrayList<Ball> ball;
    int ballCount = 20;
    //All the good items
    ArrayList<Ball2> ball2;
    int ball2Count = 20;
    //All the bad items
    ArrayList<Square> square;
    int squareCount = 7;
    //All the bumpers
    ArrayList<Particles> particle;

    // particle.addAll(ball);
    // particle.addAll(ball2);
    // particle.addAll(square);

    public void keyPressed(){

    }
    
    
    

}