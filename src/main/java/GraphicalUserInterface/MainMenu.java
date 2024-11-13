package GraphicalUserInterface;
import processing.core.PApplet;

public class MainMenu extends PApplet{
    PApplet main;
public void setup(){   
}
CircleIcon icon = new CircleIcon(420, 210, 100, 255, this);
CircleIcon icon2 = new CircleIcon(220, 210, 100, 255, this); // LATER CREATE AN ARRAY LIST OF ICONS
CursorCircle cursor = new CursorCircle(420, 210, 100, 255, this);

public void keyPressed(){
    cursor.keyPressed();
    if (cursor.selection == 0){
        cursor.x = icon.x;
        cursor.y = icon.y;
        draw();
    }
    if (cursor.selection == 1){
        cursor.x = icon2.x;
        cursor.y = icon2.y;
        draw();
    }
}

public void draw(){
    this.background(66,96,235);
    cursor.draw();
    icon2.draw();
    icon.draw();// LATER CREATE AN ARRAY LIST OF ICONS
}

}
