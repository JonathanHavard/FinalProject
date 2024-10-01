/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Particle -- a moving particle. 
 * 
 */
package ParticleEngine;


import processing.core.*;
    public class Player extends Particle{
        Player(float x_, float y_, float radius_, int c, PApplet main_){
            super(x_,y_,radius_, c, main_);    
        }
        
        public void draw(){
            //draws an ellipse
            main.fill(255,0,0);
            main.ellipse(500, 500, size, size);
            main.line(x-(size/2), y, x+(size/2), y);
            move();
        
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
            radius =30;
        damageTaken(){
            radius -=5;
            Player.Draw();
        }
        pointGained(){
            radius +=5;
            Player.Draw();
        }
        if (radius==0){
            gameOver()
        }
        if (radius ==100){
            gameOver()
        }

}

