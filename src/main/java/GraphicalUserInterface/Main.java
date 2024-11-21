/*
* Coder: Jonathan Havard
* Date Sep 2024
* Description: Sngine for particles
* Notes
*/

package GraphicalUserInterface;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

import processing.core.*;


public class Main extends PApplet {
    MenuManager menuManager;

    // static FileSystem sys = FileSystems.getDefault();
    // static String prependPath = "ImageImport"  + sys.getSeparator();
    // static String appendType = ".jpg"  + sys.getSeparator();

    public static void main(String[] args) {
        PApplet.main("GraphicalUserInterface.Main");
        
    }

    public void settings(){
        //Changes the size of the screen
        fullScreen();
        size(1920,1200);
        
    }

    public void setup() {
        menuManager = new MenuManager(this);
        menuManager.setup();
    }
    

    public void draw() {
        menuManager.draw(this);
    }

    public void keyPressed(){
        char keyP;
        keyP = key;
        menuManager.keyPressed(keyP);
        }

        }

