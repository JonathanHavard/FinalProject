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
        ball.draw();
        
    }
    public void keyPressed(){
        //adds directional inputs to the balls
        if (main.key == 'q'){
            ball.faster();
        }
        if (main.key == 'e'){
            ball.slower();
        }
        if (main.key =='w'){
            ball.uVel();
        }
        if (main.key =='s'){
            ball.dVel();
        }
        if (main.key =='a'){
            ball.lVel();
        }
        if (main.key =='d'){
            ball.rVel();
        }

    }
}
