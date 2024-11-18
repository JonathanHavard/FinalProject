package GraphicalUserInterface;

import processing.core.PApplet;
import processing.core.PImage;

public class MainMenu{
    CircleIcon icon;
    CircleIcon icon2;
    CursorCircle cursor;
    DisplayScreen displayScreen;
    PImage mainMen;

    MainMenu() {
        icon = new CircleIcon(860, 550, 100, 255);
        icon2 = new CircleIcon(1060, 550, 100, 255); // LATER CREATE AN ARRAY LIST OF ICONS
        cursor = new CursorCircle(860, 550, 100, 255);
    }

    public void setup(PApplet main) {
        mainMen = main.loadImage("ImageImport/bg.jpg");
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
        main.background(0,0,0);
        // displayScreen.MainWindow();
        main.fill(66,96,235);
        main.rect(650, 250, 600, 600,15);
        main.image(mainMen, 650, 250);
        main.fill(0,255,0);
        cursor.draw(main);
        icon2.draw(main, "Photos");
        icon.draw(main, "Music");// LATER CREATE AN ARRAY LIST OF ICONS
        
        
    }
}
