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
Triangle(float x_, float y_, float size_, PApplet main_, int c){
    super(x_, y_, size_, c, main_);
}

public void draw(float x, float y, float size, float color){
    //draws a triangle
    main.fill(particleColor);
    main.triangle(x, y, (x+size), (y+size), x+(size*2), y);
    move();
    System.out.println("drawing a triangle");
    

}
}