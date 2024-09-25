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
Ball(float x_, float y_, float radius_, int c, PApplet main_){
    super(x_,y_,radius_, c, main_);    
}

public void draw(){
    //draws an ellipse
    main.fill(particleColor);
    main.ellipse(x, y, size, size);
    move();

}
}