/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Ball -- balls class for partical engine
 * 
 */
package ParticleEngine;

import processing.core.*;
import java.util.ArrayList;

public class Balls{

    PApplet main;
    ArrayList<Ball> balls;

    Ball ball;
    int ptCount = 200;
    //maximum ball count
    int maxRad = 40;

    Balls(PApplet main_){
        main = main_;
        balls = new ArrayList<Ball>();
    }
    void setup(){
        //new ball
        ball = new Ball(main.width/2.0f, main.height*.10f, 100.f, main, main.color(main.random(255), main.random(255), main.random(225)));
    }
    // adds balls to the array
    void init(){
        for (int i=0; i<ptCount; i++){
            //Summons a bunch of particles
            float x = main.random(main.width);
            //random location x
            float y = main.random(main.height);
            //random location y
            float radius = main.random(maxRad);
            //randomized the ball colors
            float red = main.random(255);
            float green = main.random(255);
            float blue = main.random(255);
            

            Ball ball = new Ball(x, y, radius, main, main.color(red, green, blue));
            balls.add(ball);

            // Square square = new Square(x, y, size, main, main.color(red, green, blue));
            // squares.add(square);
        }
    }


    void draw(){
        for (int i=0; i<ptCount/2; i++){
            balls.get(i).draw();
            //draws the balls
        }
    }
    public void mousePressed(){
        for(int i=0; i<balls.size(); i++){
            //function to change the color of the balls (doesn't work :\ )
            balls.get(i).colorChange(ball);}

    }
    public void keyPressed(char key){
        //adds directional inputs to the balls (also doesn't work :[ )
        if (main.key=='r'){
        
        }
        if (key == 'q'){
            System.out.println("here??" + balls.size());
            for(int i=0; i<balls.size(); i++){
                //speeds up particles
                balls.get(i).faster();}
        }
        if (main.key == 'e'){
            for(int i=0; i<balls.size(); i++){
                //slows particles
                balls.get(i).slower();}
        }
        if (main.key =='w'){
            for(int i=0; i<balls.size(); i++){
                //moves particles up
                balls.get(i).uVel();}
        }
        if (main.key =='s'){
            for(int i=0; i<balls.size(); i++){
                //moves particles down
                balls.get(i).dVel();}
        }
        if (main.key =='a'){
            for(int i=0; i<balls.size(); i++){
                //moves particles left
                balls.get(i).lVel();}
        }
        if (main.key =='d'){
            for(int i=0; i<balls.size(); i++){
                //moves particles right
                balls.get(i).rVel();}
        }

    }
}
