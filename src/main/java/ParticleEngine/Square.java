/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- a moving particle. 
 * 
 */
package ParticleEngine;

//import javafx.css.Size;
import processing.core.*;

public class Square extends Particle{
Square(float x_, float y_, float size_, PApplet main_, int c){
    super(x_, y_, size_, c, main_);
}

public void draw(){
    //draws a square
    main.fill(0,255,0);
    main.square(x, y, size);
    moveP();

}
public void keyPressed(char key){
    //adds directional inputs to the particles
    if (main.key =='w'){
                uVel();
    }
    if (main.key =='s'){
                dVel();
            }
    if (main.key =='a'){
                lVel();
            }
    if (main.key =='d'){
                rVel();
            }

    }
}

