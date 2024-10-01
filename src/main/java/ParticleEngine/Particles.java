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
    int ptCount = 50;
    //maximum particle count

    Particles(PApplet main_){
        main = main_;
        particles = new ArrayList<Particle>();
    }
    void setup(){

    }
    public void keyPressed(){}

    void init(){
        for (int i=0; i<ptCount; i++){
            //Summons a bunch of particles
            float x = main.random(main.width);
            //random location x
            float y = main.random(main.height);
            //random location y
            

            Ball ball = new Ball(x, y, 100.0f, main.color(0,255,50), main);
            particles.add(ball);
            
            Ball2 ball2 = new Ball2(x, y, 100.0f, main, main.color(255,0,0));
            particles.add(ball2);

            Square square = new Square(500,500, 30, main, main.color(0,255,0));
            particles.add(square);

            Player player = new Player(x, y, 100.0f, main.color(255,0,0), main);
            particles.add(player);
            //for some reason it causes the entire window to not work....
            
        }
     
    }


    void draw(){
        for (int i=0; i<ptCount/2; i++){
            particles.get(i).draw();
            //draws the particles
        }
        
    }
    public void collision(float x1, float y1, float size1, float x2, float y2, float size2){
        boolean collided;
        for (int i=0; i<size; i++){
            if(x1+ size == x2);
            //.....I don't know....
        }
        
    }



    
}
    //     if (main.key =='z'){
    //         for(int i=0; i<particles.size(); i++){
    //             //moves particles right
    //             particles.get(i).Reverse();}
    //         }

    //     }
        // void mousePressed(){
        //     for(int i=0; i<particles.size(); i++){}
        //     particles.get(i).MouseBurst();
        // }
