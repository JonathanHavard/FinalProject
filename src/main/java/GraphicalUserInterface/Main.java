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
    public void settings(){
        //Changes the size of the screen
        size(640,420);
    }

    public void setup()
    {
        CircleIcon icon = new CircleIcon(420, 210, 100, 255, this);
        CircleIcon icon2 = new CircleIcon(220, 210, 100, 255, this); // LATER CREATE AN ARRAY LIST OF ICONS
        CursorCircle cursor = new CursorCircle(420, 210, 100, 255, null);

        MenuManager menuManager = new MenuManager(null, icon, icon2, cursor);
        menuManager.setup();
    }
}
