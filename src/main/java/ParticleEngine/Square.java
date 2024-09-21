/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Ball -- a moving ball. 
 * 
 */
package ParticleEngine;

import processing.core.*;

public class Square {
    PApplet main; //the main class -- provides all the functionality of processing

    float x,y; //location of square
    float xVel = 10;
    float yVel = 10; //Y velocity
    float y_direction = 1;
    float x_direction = 1;
    float size; //square size
    int squareColor;

    Square(float x_, float y_, float size_, PApplet main_, int c){
        x = x_;
        y = y_;
        size = size_;
        squareColor = c;

        main = main_;

        xVel = main.random(-10, 10);
        yVel = main.random(-10, 10);
    }

    void draw(){
        //draws a square
        main.square(x, y, size);
        main.fill(squareColor);
        move();

    }
    void move(){
        // square movement
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
        if (x_direction == 1){
        xVel--;
        }
        if (x_direction == -1){
            xVel++;
            }
    }
    void rVel(){
        if (x_direction == 1){
        xVel++;
        }
        if (x_direction == -1){
            xVel--;
        }
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

    public void colorChange(Square square_) {
        square_.main.color(main.random(255), main.random(255), main.random(255));
    }
    

}
