/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Ball -- a bouncing ball. Bounces up and down.
 * 
 */
package ParticleEngine;

import processing.core.*;

public class Ball {
    PApplet main; //the main class -- provides all the functionality of processing

    float x,y; //location of ball
    float xVel = 10;
    float yVel = 10; //Y velocity
    float y_direction = 1;
    float x_direction = 1;
    float radius; //ball size
    int ballColor;

    Ball(float x_, float y_, float radius_, PApplet main_, int c){
        x = x_;
        y = y_;
        radius = radius_;
        ballColor = c;

        main = main_;
    }

    void draw(){
        //draws an ellipse
        main.ellipse(x, y, radius, radius);
        main.fill(ballColor);
        move();

    }
    void move(){
        // ball movement
        y += yVel*y_direction;
        x += xVel*x_direction;
        if(y>main.height || y<0){
            y_direction *= -1;
        }
        if(x>main.width || x<0){
            x_direction *= -1;
        }
    }
    void faster(){
        //increases ball speed
    yVel*=1.1;
    xVel*=1.1;
}
void slower(){
        //decreases ball speed
    yVel*=0.9;
    xVel*=0.9;
}
    void lVel(){
        xVel--;
    }
    void rVel(){
        xVel++;
    }
    void dVel(){
        yVel++;
    }
    void uVel(){
        yVel--;
    }
    void randomVel(){
        // xVel=;
        // yVel=;
    }

}
