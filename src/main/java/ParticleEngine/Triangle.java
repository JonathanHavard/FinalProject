/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- a moving particle. 
 * 
 */
package ParticleEngine;

//import javafx.css.Size;
import processing.core.*;

public class Triangle extends Particle{
    PApplet main;
Triangle(float x_, float y_, float size_, PApplet main_, int c){
    x = x_;
    y = y_;
    size = size_;
    particleColor = c;

    main = main_;

    maxVel = 50;
    minVel = 1;
    xVel = main.random(-10, 10);
    yVel = main.random(-10, 10);
}

void Draw(float x, float y, float size, float color){
    //draws an ellipse
    main.triangle(x, y, x+size, y+size, x+(size*2), y+(size*2));
    main.fill(particleColor);
    move();

}
}