/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- a moving particle. 
 * 
 */
package ParticleEngine;

import processing.core.*;

public class Particle {
    PApplet main; //the main class -- provides all the functionality of processing

    static float x; //location of particle

    float y;
    float xVel = 10;
    float yVel = 10; //Y velocity
    float y_direction = 1;
    float x_direction = 1;
    float size; //particle size
    static int particleColor;
    float maxVel;
    float minVel;

    void move(){
        // particle movement
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
        //increases particle speed
        if (yVel<maxVel){
            //adds a speed cap
    yVel*=1.1;
        }
        if (xVel<maxVel){
            //adds a speed cap
    xVel*=1.1;
    }
        
}
void slower(){
        //decreases particle speed
    if (yVel>minVel){
    yVel*=0.9;
    }
    if (xVel>minVel){
    xVel*=0.9;
    }
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

    public void colorChange(Particle particle_) {
        particle_.main.color(main.random(255), main.random(255), main.random(255));
    }
    public void draw() {
        ball.Draw(1, 1,10, 10);
        square.Draw(1,1,10);
        triangle.Draw(1, 1, 10, 10);
    }
    

}
