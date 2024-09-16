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
        //changes the Background color
        main.background(0);
        ball = new Ball(main.width/2.0f, main.height*.10f, 50.f, main, main.color(main.random(255), main.random(255), main.random(225)));
    }

    void draw(){
        //Draws stuff on screen
        main.noStroke();
        main.background(0);
        ball.draw();
        
    }
    public void keyPressed(){
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
