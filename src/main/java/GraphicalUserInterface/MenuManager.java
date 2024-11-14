package GraphicalUserInterface;

import processing.core.PApplet;

public class MenuManager {
    MainMenu mainMenu;

    MenuManager() {
        mainMenu = new MainMenu();
    }
    
    public void setup() {
        mainMenu.setup();
    }  

    public void draw(PApplet main) {
        mainMenu.draw(main);
    }
    public void keyPressed(){
        mainMenu.keyPressed();
    }
}