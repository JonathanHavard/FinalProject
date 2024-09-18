/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Ball -- balls class for partical engine
 * 
 */

package ParticleEngine;
import java.util.ArrayList;
import processing.core.*;

public class ParticleSpray {
    PApplet main; //connects to main cliass
    ArrayList<Ball> balls;

    int bllCount = 700;
    int maxRad = 40; 
    ParticleSpray(PApplet main_){
        main = main_;
        balls = new ArrayList<>();
        init();
    }
    // adds balls to the array
    void init(){
        for (int i=0; i<bllCount; i++){
            float x = main.random(main.width);
            float y = main.random(main.height);
            float radius = main.random(maxRad);
            float red = main.random(255);
            float green = main.random(255);
            float blue = main.random(255);
            //randomized the balls

            Ball ball = new Ball(x, y,  radius, main, main.color(red, green, blue));
            balls.add(ball);
        }
    }


    void draw()
    {
        for (int i=0; i<bllCount; i++){
            balls.get(i).draw();
            //draws the balls
        }
    }
}
