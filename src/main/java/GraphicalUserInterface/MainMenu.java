package GraphicalUserInterface;

import processing.core.PApplet;

public class MainMenu {
    CircleIcon icon;
    CircleIcon icon2;
    CursorCircle cursor;

    MainMenu() {
        icon = new CircleIcon(420, 210, 100, 255);
        icon2 = new CircleIcon(220, 210, 100, 255); // LATER CREATE AN ARRAY LIST OF ICONS
        cursor = new CursorCircle(420, 210, 100, 255);
    }

    public void setup() {
        
    }

    public void keyPressed() {
        cursor.keyPressed();
        if (cursor.selection == 0){
            cursor.x = icon.x;
            cursor.y = icon.y;
        }
        if (cursor.selection == 1){
            cursor.x = icon2.x;
            cursor.y = icon2.y;
        }
    }

    public void draw(PApplet main){
        main.background(66,96,235);
        cursor.draw(main);
        icon2.draw(main);
        icon.draw(main);// LATER CREATE AN ARRAY LIST OF ICONS
    }
}
