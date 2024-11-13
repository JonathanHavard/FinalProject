package GraphicalUserInterface;

import processing.core.PApplet;

public class MenuManager{
    MenuManager(Main main, CircleIcon ico1, CircleIcon ico2, CursorCircle cursor){
        main = main_;
        ico1 = ico1_;
        ico2 = ico2_;
        cursor = cursor_;
    }
    MainMenu mainMenu = new MainMenu(null, null, null, null);
    public void setup(){
        mainMenu.draw();
    }
        
}
