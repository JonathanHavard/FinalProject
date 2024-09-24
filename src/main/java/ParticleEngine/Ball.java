/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- a moving particle. 
 * 
 */
package ParticleEngine;

//import javafx.css.Size;
import processing.core.*;

public class Ball extends Particle{
    PApplet main;
Ball(float x_, float y_, float radius_, int c, PApplet main_){
    x = x_;
    y = y_;
    size = radius_;
    particleColor = c;

    main = main_;

    maxVel = 50;
    minVel = 1;
    xVel = main.random(-10, 10);
    yVel = main.random(-10, 10);
    x = 0;
    y = 0;
    size = main.random(10, 50);
}

void Draw(){
    //draws an ellipse
    main.ellipse(x, y, size, size);
    main.fill(particleColor);
    move();

}
}