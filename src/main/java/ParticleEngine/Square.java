/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- a moving particle. 
 * 
 */
package ParticleEngine;

import javafx.css.Size;
import processing.core.*;

public class Square extends Particle{
    PApplet main;
Square(float x_, float y_, float size_, int c){
    x = x_;
    y = y_;
    size = size_;
    particleColor = c;


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