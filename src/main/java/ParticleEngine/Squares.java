/*
 * Coder: Jonathan Havard
 * Date: Sep. 2024
 * Description: Square -- squares class for partical engine
 * 
 */
package ParticleEngine;

import processing.core.*;
import java.util.ArrayList;

public class Squares{

    PApplet main;
    ArrayList<Square> squares;

    Square square;

    Squares(PApplet main_){
        main = main_;
        squares = new ArrayList<Square>();
    }

    void setup(){
        //new square
        square = new Square(main.width/2.0f, main.height*.10f, 100.f, main, main.color(main.random(255), main.random(255), main.random(225)));
    }

    void draw(){
        //Draws stuff on screen
        main.noStroke();
        
    }

    public void mousePressed(){
        for(int i=0; i<squares.size(); i++){
            //function to change the color of the squares (doesn't work :\ )
            squares.get(i).colorChange(square);}

    }
    public void keyPressed(){
        //adds directional inputs to the squares (also doesn't work :[ )
        if (main.key == 'q'){
            for(int i=0; i<squares.size(); i++){
                //speeds up particles
                squares.get(i).faster();}
        }
        if (main.key == 'e'){
            for(int i=0; i<squares.size(); i++){
                //slows particles
                squares.get(i).slower();}
        }
        if (main.key =='w'){
            for(int i=0; i<squares.size(); i++){
                //moves particles up
                squares.get(i).uVel();}
        }
        if (main.key =='s'){
            for(int i=0; i<squares.size(); i++){
                //moves particles down
                squares.get(i).dVel();}
        }
        if (main.key =='a'){
            for(int i=0; i<squares.size(); i++){
                //moves particles left
                squares.get(i).lVel();}
        }
        if (main.key =='d'){
            for(int i=0; i<squares.size(); i++){
                //moves particles right
                squares.get(i).rVel();}
        }

    }
}
