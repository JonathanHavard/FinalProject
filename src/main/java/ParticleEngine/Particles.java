/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- particles class for partical engine
 * 
 */
package ParticleEngine;

import processing.core.*;
import java.util.ArrayList;

public class Particles{

    PApplet main;
    ArrayList<Particle> particles;

    Particle particle;
    int ptCount = 200;
    //maximum particle count
    int maxRad = 40;

    Particles(PApplet main_){
        main = main_;
        particles = new ArrayList<Particle>();
    }
    void setup(){
        //new particle
        particle = new Ball(maxRad, maxRad, maxRad, main, ptCount);
    }
    // adds particles to the array
    void init(){
        for (int i=0; i<ptCount; i++){
            //Summons a bunch of particles
            float x = main.random(main.width);
            //random location x
            float y = main.random(main.height);
            //random location y
            float radius = main.random(maxRad);
            //randomized the particle colors
            float red = main.random(255);
            float green = main.random(255);
            float blue = main.random(255);
            

            Particle particle = new Particle();
            particles.add(particle);

            // Square square = new Square(x, y, size, main, main.color(red, green, blue));
            // squares.add(square);
        }
    }


    void draw(){
        for (int i=0; i<ptCount/2; i++){
            particles.get(i).draw();
            //draws the particles
        }
    }
    public void mousePressed(){
        for(int i=0; i<particles.size(); i++){
            //function to change the color of the particles (doesn't work :\ )
            particles.get(i).colorChange(particle);}

    }
    public void keyPressed(char key){
        //adds directional inputs to the particles (also doesn't work :[ )
        if (main.key=='r'){
        
        }
        if (key == 'q'){
            for(int i=0; i<particles.size(); i++){
                //speeds up particles
                particles.get(i).faster();}
        }
        if (main.key == 'e'){
            for(int i=0; i<particles.size(); i++){
                //slows particles
                particles.get(i).slower();}
        }
        if (main.key =='w'){
            for(int i=0; i<particles.size(); i++){
                //moves particles up
                particles.get(i).uVel();}
        }
        if (main.key =='s'){
            for(int i=0; i<particles.size(); i++){
                //moves particles down
                particles.get(i).dVel();}
        }
        if (main.key =='a'){
            for(int i=0; i<particles.size(); i++){
                //moves particles left
                particles.get(i).lVel();}
        }
        if (main.key =='d'){
            for(int i=0; i<particles.size(); i++){
                //moves particles right
                particles.get(i).rVel();}
        }

    }
}
