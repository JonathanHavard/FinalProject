package GraphicalUserInterface;

import processing.core.PApplet;

public class MenuManager{
    CircleIcon ico1 = new CircleIcon(0, 0, 0, 0, null);
    CircleIcon ico2 = new CircleIcon(0, 0, 0, 0, null);
    CursorCircle cursor = new CursorCircle(0, 0, 0, 0, null);

    MenuManager(Main main, CircleIcon ico1_, CircleIcon ico2_, CursorCircle cursor_){
        ico1 = ico1_;
        ico2 = ico2_;
        cursor = cursor_;
    }
    MainMenu mainMenu = new MainMenu(this, ico1, ico2, cursor);
    public void setup(){
        mainMenu.draw();
    }  
}
