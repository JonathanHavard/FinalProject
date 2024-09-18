/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Ball -- balls class for partical engine
 * 
 */
package ParticleEngine;

import processing.core.*;
import java.util.ArrayList;

public class Balls{

    PApplet main;
    ArrayList<Ball> balls;

    Ball ball;

    Balls(PApplet main_){
        main = main_;
        balls = new ArrayList<Ball>();
    }

    void setup(){
        //new ball
        ball = new Ball(main.width/2.0f, main.height*.10f, 100.f, main, main.color(main.random(255), main.random(255), main.random(225)));
    }

    void draw(){
        //Draws stuff on screen
        main.noStroke();
        
    }

    public void mousePressed(){
        for(int i=0; i<balls.size(); i++){
            //function to change the color of the balls (doesn't work :\ )
            balls.get(i).colorChange(ball);}

    }
    public void keyPressed(){
        //adds directional inputs to the balls (also doesn't work :[ )
        if (main.key == 'q'){
            for(int i=0; i<balls.size(); i++){
                //speeds up particles
                balls.get(i).faster();}
        }
        if (main.key == 'e'){
            for(int i=0; i<balls.size(); i++){
                //slows particles
                balls.get(i).slower();}
        }
        if (main.key =='w'){
            for(int i=0; i<balls.size(); i++){
                //moves particles up
                balls.get(i).uVel();}
        }
        if (main.key =='s'){
            for(int i=0; i<balls.size(); i++){
                //moves particles down
                balls.get(i).dVel();}
        }
        if (main.key =='a'){
            for(int i=0; i<balls.size(); i++){
                //moves particles left
                balls.get(i).lVel();}
        }
        if (main.key =='d'){
            for(int i=0; i<balls.size(); i++){
                //moves particles right
                balls.get(i).rVel();}
        }

    }
}
