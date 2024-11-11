/*
* Coder: Jonathan Havard
* Date Sep 2024
* Description: Sngine for particles
* Notes
*/

package GraphicalUserInterface;

import java.util.ArrayList;

import processing.core.*;

public class Main extends PApplet{


    public static void main(String[] args) {
        PApplet.main("GraphicalUserInterface.Main");
    }
    CircleIcon icon = new CircleIcon(420, 210, 100, 255, this);
    CircleIcon icon2 = new CircleIcon(220, 210, 100, 255, this); // LATER CREATE AN ARRAY LIST OF ICONS
    CursorCircle cursor = new CursorCircle(220, 210, 120, 0, this);

    public void settings(){
        //Changes the size of the screen
        size(640,420);

    }
    public void setup(){
        this.background(66,96,235);
        cursor.draw();
        icon.draw();
        icon2.draw();// LATER CREATE AN ARRAY LIST OF ICONS
        
    }

    public void keyPressed(){
        cursor.keyPressed();
        System.out.println("key pressed");
    }
    
    
}
