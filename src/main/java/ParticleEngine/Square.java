/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- a moving particle. 
 * 
 */
package ParticleEngine;

import processing.core.*;

public class Square extends Particle{
    PApplet main;
Square(){
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
    //draws a square
    main.square(x, y, size);
    main.fill(particleColor);
    move();

}
}