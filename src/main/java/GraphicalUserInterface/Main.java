/*
* Coder: Jonathan Havard
* Date Sep 2024
* Description: Sngine for particles
* Notes
*/

package GraphicalUserInterface;

import processing.core.*;

public class Main extends PApplet {
    MenuManager menuManager;

    public static void main(String[] args) {
        PApplet.main("GraphicalUserInterface.Main");
        
    }

    public void settings(){
        //Changes the size of the screen
        size(640,420);
        
    }

    public void setup() {
        menuManager = new MenuManager();
        menuManager.setup();
    }
    

    public void draw() {
        menuManager.draw(this);
    }

    public void keyPressed(){
        char keyP;
        keyP = key;
        // if (key == 'a'){
        //     menuManager.setState("main");
        // }
        // if (key == 'b'){
        //     menuManager.setState("photo");
        // }
        // if (key == 'c'){
        //     menuManager.setState("music");
        // }
        menuManager.keyPressed(keyP);
        }

        }

