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
    public void keyPressed(){
        //adds directional inputs to the balls
        if (main.key == 'q'){
            for(int i=0; i<balls.size(); i++){
                balls.get(i).faster();}
        }
        if (main.key == 'e'){
            for(int i=0; i<balls.size(); i++){
                balls.get(i).slower();}
        }
        if (main.key =='w'){
            for(int i=0; i<balls.size(); i++){
                balls.get(i).uVel();}
        }
        if (main.key =='s'){
            for(int i=0; i<balls.size(); i++){
                balls.get(i).dVel();}
        }
        if (main.key =='a'){
            for(int i=0; i<balls.size(); i++){
                balls.get(i).lVel();}
        }
        if (main.key =='d'){
            for(int i=0; i<balls.size(); i++){
                balls.get(i).rVel();}
        }

    }
}
