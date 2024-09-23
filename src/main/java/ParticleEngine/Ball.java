/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- a moving particle. 
 * 
 */
package ParticleEngine;

import processing.core.*;

public class Ball extends Particle{
    PApplet main;
Ball(float x_, float y_, float radius_, PApplet main_, int c){
    x = x_;
    y = y_;
    size = radius_;
    particleColor = c;

    main = main_;

    maxVel = 50;
    minVel = 1;
    xVel = main.random(-10, 10);
    yVel = main.random(-10, 10);
}

void Draw(){
    //draws an ellipse
    main.ellipse(x, y, size);
    main.fill(particleColor);
    move();

}
}